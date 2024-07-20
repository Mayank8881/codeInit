class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List l1=new ArrayList();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int flag=0;
                int temp=matrix[i][j];
                for(int k=0;k<matrix[0].length;k++){
                    if(k!=j){
                        if(temp>matrix[i][k]){
                            flag=1;
                            break;
                        }
                    }
                }
                for(int k=0;k<matrix.length;k++){
                    if(k!=i){
                        if(temp<matrix[k][j]){
                            flag=1;
                            break;
                        }
                    }
                }
                    
            if(flag==0){
                    l1.add(matrix[i][j]);
                }     
            }
                
        }
            return l1;
    }
        
    
}