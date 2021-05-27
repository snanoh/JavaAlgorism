/*
ada
bean
adam
ace
be
ac
=====
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Jeyoung {
    public static void main(String[] args) throws IOException {
        List<String> wordList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(String input = br.readLine(); !input.equals("====="); input = br.readLine()) {
            wordList.add(input);
        }
        //System.out.println(String.join("\n", wordList));

        Comparator<String> comparator = (s1, s2)->s1.compareTo(s2);
        Map<String, Integer> map = new TreeMap<>(comparator);
        for (String word: wordList) {

            for (int i = 1; i<word.trim().length()+1; i++) {
                String str = word.substring(0, i);
                if(map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                }else {
                    map.put(str, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }

    }
}
