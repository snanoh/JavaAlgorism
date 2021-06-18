package Programmers;


public class solution2 {
    public static void main(String[] args) {
        int[] grade = {1,1,3};
        solution(grade);
    }

    private static int[] solution(int[] grade) {
        int[] answer = new int[grade.length];
        for(int i = 0 ; i < grade.length ; i++){
            int rank = 1;
            for(int j = 0 ; j < grade.length ; j++){
                if(grade[i] < grade[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}
