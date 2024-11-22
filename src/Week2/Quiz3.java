package Week2;

import java.util.Arrays;

public class Quiz3 {
        public int solution(int n) {
            int answer = 0;

            boolean[] isPrime = new boolean[n+1];

            Arrays.fill(isPrime, true);

            isPrime[0] = isPrime[1] = false;

            // 에라토스테나스의 체 사용
            //1)지워지지 않는 가장 작은 수를 찾는다.(보통 2부터 시작)
            //2)해당 수는 소수이다.
            //3)해당수의 배수들을 모두 지운다.
            // 이건 검색 없었으면 효율성때문에 못풀었다...... 기억하자
            for(int i = 2; i * i <= n; i++){
                if(isPrime[i]){

                    for(int j = i*i; j<= n; j += i){

                        isPrime[j] = false;

                    }

                }
            }

            for(int i = 0; i < isPrime.length; i++) {

                if(isPrime[i]) {
                    answer++;
                }
            }

            return answer;
        }
    }

