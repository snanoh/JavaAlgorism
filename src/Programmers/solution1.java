package Programmers;

public class solution1 {
    public static void main(String[] args) {
        String s1 = "xyZA";
        String s2 = "xyZA";

        System.out.println(solution(s1, s2));
    }

    private static String solution(String s1, String s2) {
        String answer = "";

        String str1 = "";
        String str2 = "";

        int cnt1 =0;
        for(int i = 1 ; i< s1.length()+1; i++){
            if(s1.substring(s1.length()-i, s1.length()).equals(s2.substring(0,i ))){
                cnt1= i ;
            }
        }

        int cnt2 =0;
        for(int i = 1 ; i< s2.length()+1; i++){
            if(s2.substring(s2.length()-i, s2.length()).equals(s1.substring(0,i ))){
                cnt2= i;
            }
        }
        str1 = s1 + s2.substring(cnt1, s2.length());
        str2 = s2 + s1.substring(cnt2, s1.length());


        if(str1.length() > str2.length()){
            answer = str2;
        }else{
            answer = str1;
        }

        return answer;
    }


}
