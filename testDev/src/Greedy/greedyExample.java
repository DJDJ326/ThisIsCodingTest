package Greedy;

public class greedyExample {

    public static void main(String[] args) {
        int n = 1260;       // 총 금액
        int cnt = 0;        // 동전 최소 개수
        int[] coinTypes = {500, 100, 50, 10};   // 동전 리스트 - 큰 순서대로

        for (int i = 0; i < 4; i++) {           //  동전 리스트 만큼 반복
            int coin = coinTypes[i];            //  사용할 동전
            cnt += n / coin;                    //  cnt 몫 저장, 초기값 n
            n %= coin;                          //  n -> 나머지
        }

        System.out.println(cnt);                // 프린트
    }
}
