/*
- 파일명 : BOJ_Step07_11719.java
- 작성자 : YJY
- 작성일자 : 2019.05.23.
- 문제 : BOJ 8단계 입/출력 받아보기 
        11719번 그대로 출력하기2 (https://www.acmicpc.net/problem/11719)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String input = "";
        while ((input =reader.readLine()) != null) {
        	System.out.println(input);
        }
        
        
    }
}
