class Solution {
    public long subArrayRanges(int[] nums) {
        int nse[]=nse(nums);
        int pse[]=pse(nums);
        int nge[]=nge(nums);
        int pge[]=pge(nums);
        long total=0;
        
        for (int i=0;i<nums.length;i++){
            long maxCount=(long)(i-pge[i])*(nge[i]-i);
            long minCount=(long)(i-pse[i])*(nse[i]-i);

            total +=(long)nums[i]*(maxCount - minCount);
        }
        return total;
    }

    public int[] nge(int arr[]){
        int a[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=a.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }

            a[i]= stack.isEmpty()? a.length:stack.peek();

            stack.push(i);

        }
        return a;
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

    public int[] pse(int arr[]){
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
    public int[] pge(int arr[]){
        int a[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<a.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }

            a[i]= stack.isEmpty()? -1:stack.peek();

            stack.push(i);

        }
        return a;
    }
}