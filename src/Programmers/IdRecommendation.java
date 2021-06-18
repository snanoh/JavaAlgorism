package Programmers;

public class IdRecommendation {

    public static void main(String[] args) {
        String new_id = "z-+.^.";
        solution(new_id);
    }

    private static void solution(String new_id) {
        System.out.println("0단계 : " + new_id);

        new_id = new_id.toLowerCase();
        System.out.println("1단계 : " + new_id);

        new_id = new_id.replaceAll("[^\uAC00-\uD7A3xfe0-9a-z\\-_.]", "");
        System.out.println("2단계 : " + new_id);

        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }
        System.out.println("3단계 : " + new_id);

        if(new_id.length() > 0){
            if(new_id.charAt(0) == '.'){
                new_id = new_id.substring(1, new_id.length());
            }else if(new_id.charAt(new_id.length()-1) == '.'){
                new_id = new_id.substring(0, new_id.length() -1);
            }
        }
        System.out.println("4단계 : " + new_id);

        if("".equals(new_id)){
            new_id = "a";
        }
        System.out.println("5단계 : " + new_id);

        if(new_id.length() >= 16){
            if(new_id.charAt(14) == '.'){
                new_id = new_id.substring(0, 14);
            }else{
                new_id = new_id.substring(0, 15);
            }
        }
        System.out.println("6단계 : " + new_id);

        if(new_id.length() <= 2){
            char a = new_id.charAt(new_id.length()-1);
            while(new_id.length() < 3){
                new_id += a;
            }
        }
        System.out.println("7단계 : " + new_id);

    }
}
