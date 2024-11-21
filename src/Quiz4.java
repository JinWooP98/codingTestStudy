import java.util.Arrays;

public class Quiz4 {

        public int[] solution(int k, int[] score) {

            int[] answer = new int[score.length];

            // 명예의 전당
            int[] goat = new int[k];

            // 일단 아무 수나 할당 (최대점수 2000점)
            for(int i = 0; i < k; i++) {
                goat[i] = 2001;
            }

            for(int i = 0; i < score.length; i++) {

                // 명전 순위보다 점수 매긴자의 수가 적다면 그냥 넣고 정렬한다음 가장 적은 점수를 answer에 서장
                if(i<k) {
                    goat[i] = score[i];

                    Arrays.sort(goat);

                    answer[i] = goat[0];

                } else {

                    // 명전 순위보다 점수 매긴자의 수가 많다면
                    // 우선 명전의 최소점수보다 현재 점수가 크다면 현재 점수로 바꿔주기
                    // 그 뒤 점수 정렬한다음
                    // 최소점수를 answer에 저장
                    Arrays.sort(goat);

                    if(goat[0] < score[i]) {
                        goat[0] = score[i];

                        Arrays.sort(goat);
                    }

                    answer[i] = goat[0];
                }

            }

            return answer;
        }
    }

