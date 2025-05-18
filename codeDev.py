import os
import json
import requests
import subprocess
from datetime import datetime


REPO_PATH = "D:\DSA\codeInit"
SESSION_COOKIE = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJfYXV0aF91c2VyX2lkIjoiMTA5Mjk5ODkiLCJfYXV0aF91c2VyX2JhY2tlbmQiOiJkamFuZ28uY29udHJpYi5hdXRoLmJhY2tlbmRzLk1vZGVsQmFja2VuZCIsIl9hdXRoX3VzZXJfaGFzaCI6ImYxMzE1N2U5NmZjYTIxZjQyYmUyYzhkNjU4MDZlYjU0NDE3YTY3ZDU5MGQwMGMyMTdmNjBhNjI1Nzc2OTgwZDUiLCJzZXNzaW9uX3V1aWQiOiIwN2IzNzNkMCIsImlkIjoxMDkyOTk4OSwiZW1haWwiOiJtYXlhbmttb2toZXJlMjUyN0BnbWFpbC5jb20iLCJ1c2VybmFtZSI6Im1heWFuX2siLCJ1c2VyX3NsdWciOiJtYXlhbl9rIiwiYXZhdGFyIjoiaHR0cHM6Ly9hc3NldHMubGVldGNvZGUuY29tL3VzZXJzL21heWFuX2svYXZhdGFyXzE3Mzc5OTg2OTgucG5nIiwicmVmcmVzaGVkX2F0IjoxNzQ3NDkxOTk3LCJpcCI6IjQ5LjM2LjQwLjIzMyIsImlkZW50aXR5IjoiMzNkMGYyNTdhODE3ZDFjYTRjNDM4MWI4N2Y4YWQ4M2YiLCJkZXZpY2Vfd2l0aF9pcCI6WyIxZWUzNmQ5YzgyNmViN2E3NDZkNWFhYzE5MjgwYzMxNSIsIjQ5LjM2LjQwLjIzMyJdLCJfc2Vzc2lvbl9leHBpcnkiOjEyMDk2MDB9.Hi_ClYlzPx5-hkv_p1yrGd2m0a03YLIKfZODDy87vGs"
CSRF_TOKEN = "MnWkMMvjn1C26YZQ8PlAANFvbwhz0VbQLqFaVdTfBDYlAvcq4RR7EWbxBvZmyzdh"
HEADERS = {
    "Cookie": f"LEETCODE_SESSION={SESSION_COOKIE}; csrftoken={CSRF_TOKEN}",
    "x-csrftoken": CSRF_TOKEN,
    "User-Agent": "Mozilla/5.0"
}

def fetch_leetcode_submissions():
    submissions = []
    offset = 200 
    limit = 200

    while True:
        url = f"https://leetcode.com/api/submissions/?offset={offset}&limit={limit}"
        response = requests.get(url, headers=HEADERS)
        
        if response.status_code != 200:
            print("Failed to fetch submissions. Check your cookies.")
            break

        data = response.json()
        fetched_submissions = data.get("submissions_dump", [])
        
        if not fetched_submissions:
            break  # No more submissions to fetch
        
        submissions.extend(fetched_submissions)
        offset += limit  # Move to the next page

    return submissions

def commit_submission(title, code, lang, timestamp):
    file_extension = {
        "python3": "py",
        "java": "java",
        "cpp": "cpp",
        "c": "c",
        "javascript": "js"
    }.get(lang, "txt")

    filename = f"{title.replace(' ', '_')}.{file_extension}"
    filepath = os.path.join(REPO_PATH, filename)

    with open(filepath, "w") as f:
        f.write(code)

    commit_time = datetime.utcfromtimestamp(timestamp).strftime('%Y-%m-%dT%H:%M:%S')

    subprocess.run(["git", "add", filename], cwd=REPO_PATH)
    subprocess.run(["git", "commit", "-m", f"Add {title}", "--date", commit_time], cwd=REPO_PATH)

def main():
    os.chdir(REPO_PATH)

    submissions = fetch_leetcode_submissions()
    if not submissions:
        print("No submissions found.")
        return

    for sub in submissions:
        commit_submission(
            title=sub["title"],
            code=sub["code"],
            lang=sub["lang"],
            timestamp=sub["timestamp"]
        )

    subprocess.run(["git", "push"], cwd=REPO_PATH)

if __name__ == "__main__":
    main()