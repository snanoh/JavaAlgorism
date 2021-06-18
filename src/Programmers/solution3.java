package Programmers;

public class solution3 {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(solution(n));
    }

    private static int solution(int n ) {
        int answer = 0;
        while(true){
            if(n % 5 == 0){
                answer += (n/5);
                break;
            }
            n -= 3;
            answer += 1;
            if( n < 0){
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
