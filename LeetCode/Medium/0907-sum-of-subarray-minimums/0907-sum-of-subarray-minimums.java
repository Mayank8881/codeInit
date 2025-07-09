class Solution {
    public int sumSubarrayMins(int[] arr) {
        int nse[]=nse(arr);
        int psee[]=psee(arr);
        long total=0;
        int mod=(int)1e9+7;

        for(int i=0;i<arr.length;i++){
            int left=i-nse[i];
            int right=psee[i]-i;

            total+=(left*right %mod)*arr[i] %mod;
        }
        return (int)total;
    }

    public int[] nse(int arr[]){
        int a[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=a.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            a[i]= stack.isEmpty()? a.length:stack.peek();

            stack.push(i);

        }
        return a;
    }

    public int[] psee(int arr[]){
        int a[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<a.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }

            a[i]= stack.isEmpty()? -1:stack.peek();

            stack.push(i);

        }
        return a;
    }

}