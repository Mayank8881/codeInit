class Solution {
    public int[] minOperations(String boxes) {
        // int arr[]=new int[boxes.length()];
        // for(int i=0;i<boxes.length();i++){
        //     int count=0;
        //     for(int j=0;j<boxes.length();j++){
        //         if(boxes.charAt(j)=='1'){
        //             count=count+Math.abs(i - j);
        //         }
        //     }
        //     arr[i]=count;
        // }
        // return arr;

        int arr[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            arr[i]=boxes.charAt(i)-'0';
        }
        int left[]=new int[boxes.length()];
        int right[]=new int[boxes.length()];

        int count=0;

        count=arr[0];
        for(int i=1;i<boxes.length();i++){
            left[i]=left[i-1]+count;
            count+=arr[i];
        }

        count=arr[boxes.length()-1];
        for(int i=boxes.length()-2;i>=0;i--){
            right[i]=right[i+1]+count;
            count+=arr[i];
        }

        for(int i=0;i<boxes.length();i++){
            arr[i]=left[i]+right[i];
        }
        return arr;
    }
}