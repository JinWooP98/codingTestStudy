package Week2;

public class Quiz7 {

    public int solution(int n) {
        int answer = 0;

        int[] numbers = new int[n + 1];

        numbers[0] = 0;
        numbers[1] = 1;

        for(int i = 2; i <= n; i++) {
            numbers[i] = (numbers[i - 2] + numbers[i - 1]) % 1234567;
        }

        answer = numbers[n];

        return answer;
    }
}
