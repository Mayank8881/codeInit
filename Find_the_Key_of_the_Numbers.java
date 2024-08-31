import java.util.*;
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder s=new StringBuilder();
        String s1=Integer.toString(num1);
        String s2=Integer.toString(num2);
        String s3=Integer.toString(num3);
        
        if(s1.length()!=4){
            if(s1.length()==3){
                s1="0"+s1;
            }
            else if(s1.length()==2){
                s1="00"+s1;
            }
            else if(s1.length()==1){
                s1="000"+s1;
            }
        }
        if(s2.length()!=4){
            if(s2.length()==3){
                s2="0"+s2;
            }
            else if(s2.length()==2){
                s2="00"+s2;
            }
            else if(s2.length()==1){
                s2="000"+s2;
            }
        }
        if(s3.length()!=4){
            if(s3.length()==3){
                s3="0"+s3;
            }
            else if(s3.length()==2){
                s3="00"+s3;
            }
            else if(s3.length()==1){
                s3="000"+s3;
            }
        }
//         ArrayListString> a=new ArrayList<>();
//         a.add(s1);
//         a.add(s2);
//         a.add(s3);
//         for(int i=0;i<2;i++){
            
//             for(int j=0;j<s1.length()){
                
//             }
//         }
        for(int i=0;i<s1.length();i++){
            if(s2.charAt(i)<s1.charAt(i)){
                if(s3.charAt(i)<s2.charAt(i)){
                    s.append(s3.charAt(i));
                }
                else{
                    s.append(s2.charAt(i));
                }
            }
            else{
                s.append(s1.charAt(i));
            }
        }
        String str=s.toString();
        return Integer.parseInt(str);
    }
}