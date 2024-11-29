package Week2;

public class Quiz8 {

    public int solution(int n) {
        int count = 0;

        for (int m = 1; m * (m - 1) / 2 < n; m++) {
            // n - m * (m-1) / 2 가 m으로 나누어 떨어지는지 확인
            int numerator = n - (m * (m - 1)) / 2;
            if (numerator % m == 0) {
                count++;
            }
        }

        return count;
    }

}
