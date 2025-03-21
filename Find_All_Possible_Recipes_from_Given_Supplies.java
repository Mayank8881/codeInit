class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> rec = new HashMap<>();
        Set<String> sup = new HashSet<>(Arrays.asList(supplies));
        Map<String, Boolean> memo = new HashMap<>();
        for (int i = 0; i < recipes.length; i++) rec.put(recipes[i], ingredients.get(i));
        List<String> res = new ArrayList<>();
        for (String r : recipes)
            if (dfs(r, rec, sup, new HashSet<>(), memo)) res.add(r);
        return res;
    }

    private boolean dfs(String s, Map<String, List<String>> rec, Set<String> sup, Set<String> vis, Map<String, Boolean> memo) {
        if (!rec.containsKey(s)) return true;
        if (memo.containsKey(s)) return memo.get(s);
        if (!vis.add(s)) return false;
        for (String ing : rec.get(s))
            if ((!rec.containsKey(ing) && !sup.contains(ing)) || (rec.containsKey(ing) && !dfs(ing, rec, sup, vis, memo))) {
                vis.remove(s);
                memo.put(s, false);
                return false;
            }
        vis.remove(s);
        memo.put(s, true);
        return true;
    }
}