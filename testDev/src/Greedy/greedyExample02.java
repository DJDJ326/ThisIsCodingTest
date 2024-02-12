package Greedy;
import java.util.*;

public class greedyExample02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        System.out.print("n 을 입력하세요 : ");
        int n = sc.nextInt();
        System.out.print("m 을 입력하세요 : ");
        int m = sc.nextInt();
        System.out.print("k 을 입력하세요 : ");
        int k = sc.nextInt();

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        System.out.print("배열 입력값을 입력하세요 : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기 (오름차순)
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println("결과 : "  +result);
    }


}
