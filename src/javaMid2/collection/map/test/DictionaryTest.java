package javaMid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> dict = new HashMap<>();


        System.out.println("==단어 입력 단계==");
        while(true)
        {
            System.out.printf("영어 단어를 입력하세요 (종료는 'q'): ");
            String Eng = sc.nextLine();
            if(Eng.equals("q"))
            {
                break;
            }
            System.out.printf("한글 뜻을 입력하세요 (종료는 'q'): ");
            String Kor = sc.nextLine();
            if(Kor.equals("q"))
            {
                break;
            }
            dict.put(Eng,Kor);


        }

        System.out.println("==단어 검색 단계==");

        while(true)
        {
            System.out.printf("영어 단어를 검색하세요 (종료는 'q'): ");
            String input = sc.nextLine();
            if(input.equals("q"))
            {
                break;
            }


            if(dict.containsKey(input))
            {
                System.out.println(input+"의 뜻: " + dict.get(input));
            }
            else
            {
                System.out.println(input +"은(는) 사전에 없는 단어 입니다.");
            }
        }

    }
}
