class Solution {
    public int countServers(int[][] grid) {
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        int total=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                    total++;
                }
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && row[i]==1 && col[j]==1){
                    total--;
                }
            }
        }
        return total;

    }
}