class Solution {
    public static boolean isSafe(char[][] arr, int row, int col) {
        int N = arr.length;

        // Check vertical above
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < col; i++) {
            if (arr[row][i] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        //lower left
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // Check lower right diagonal
        for (int i = row, j = col; i < N && j < N; i++, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printQueen(char[][] arr, int col,List<List<String>> Boards) {
        int N = arr.length;
        if (col == N) {
            printResult(arr,Boards);
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(arr, i, col)) {
                arr[i][col] = 'Q';
                printQueen(arr, col + 1,Boards);
                arr[i][col] = '.';
            }
        }
    }

    public static void printResult(char[][] arr ,List<List<String>> Boards) {
        String row="";
        List<String> newBoard =new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            row="";
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        Boards.add(newBoard);
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> Boards=new ArrayList<>();
        char[][] arr=new char[n][n];

        printQueen(arr,0,Boards);
        return Boards;

    }
}