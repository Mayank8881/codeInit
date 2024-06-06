class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        System.out.println(hand.length);
        int len=hand.length;
        int a=len%groupSize;
        System.out.println(a);
        if(a==0){
            return true;
        }
        else{
            return false;
        }
    }
}