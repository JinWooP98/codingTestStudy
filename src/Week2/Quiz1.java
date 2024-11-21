package Week2;

class Quiz1 {

    public int solution(int number, int limit, int power) {

        int answer = 0;

        // 수를 1부터 순회로 약수 개수 세기
        for(int i = 1; i <= number; i++) {

            // 약수의 개수
            int count = 0;

            // 제곱이하의 수들로만 약수개수 파악
            // 제곱일 경우 count 가 1만 증가
            // 나눴을때 나머지가 0이라면 count 2 증가 // 제곱 이하의 수들로만 파악하기 때문에
            for(int j = 1; j * j <= i; j ++ ) {

                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }

            // count가 limit보다 크면 power을 더해주고 아니라면 count를 더해줌
            if(count > limit) {
                answer += power;
            } else {
                answer += count;
            }

        }




        return answer;
    }
}
