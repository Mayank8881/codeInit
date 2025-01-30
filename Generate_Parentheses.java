class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate("",n,n,list);
        return list;
    }

    public void generate(String s,int n,int m,List<String> list){
        if(n==0 && m==0){
            list.add(s);
            return;
        }
        if(n>0){

        generate(s+"(",n-1,m,list);
        }
        if(m>0){

        generate(s+")",n,m-1,list);
        }
    }
}