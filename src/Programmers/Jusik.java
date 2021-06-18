package Programmers;

import java.util.Arrays;

public class Jusik {
    public static void main(String[] args) {
        int[] array = {13,7,3,7,5,16,12};
        int[] answer = solution(array);

        System.out.println(Arrays.toString(answer));

    }

    private static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i]; //주식을 날짜의 가격
            boolean chk = true; // 큰값이 없는 경우 check
            int j = i +1; //while문 용 값
            int cnt = 0; //answer에 들어갈 cnt

            while (j  < prices.length ) {
                if(price < prices[j]){
                    cnt++;
                    chk = false;
                    break;
                }
                cnt++;
                j++;
            }
            if(chk){
                cnt = -1;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
