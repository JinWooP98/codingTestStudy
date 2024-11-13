import java.util.Arrays;

public class Quiz4 {

        public int[] solution(int k, int[] score) {

            int[] answer = new int[score.length];

            int[] goat = new int[k];

            for(int i = 0; i < k; i++) {
                goat[i] = 2001;
            }

            for(int i = 0; i < score.length; i++) {

                if(i<k) {
                    goat[i] = score[i];

                    Arrays.sort(goat);

                    answer[i] = goat[0];

                } else {
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

