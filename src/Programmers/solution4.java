package Programmers;

import java.util.ArrayList;

public class solution4 {
    public static void main(String[] args) {
        int N = 3;
        int[] coffee_times = {4,2,2,5,3};

        solution(N, coffee_times);
    }

    private static int[] solution(int N, int[] coffee_times) {
        int[] answer = new int[coffee_times.length];
        ArrayList<Integer> coffee = new ArrayList<>();
        int i = 0;

        while(i < coffee_times.length){
            for(int j = 0; j < N; j++){
                coffee_times[j]--;
                if(coffee_times[j] == 0){
                    answer[i] = j;
                    i++;
                }
            }
        }

        return answer;
    }
}
