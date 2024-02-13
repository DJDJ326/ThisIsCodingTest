package Greedy;

import java.util.Scanner;

public class greedyExample03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 행 2
        int m = sc.nextInt();       // 열 3
        int result = 0;

        for(int i=0; i<n; i++) {
            int minValue = 10001;
            for(int j=0; j<m; j++) {
                int ary = sc.nextInt();
                minValue = Math.min(minValue, ary);
            }
            result = Math.max(result, minValue);
        }
        System.out.println("결과 : " + result);

    }
}
