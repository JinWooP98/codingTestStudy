package Week2;

import java.util.*;

public class Quiz2 {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        // 각 수포자의 정답 패턴 설정
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        // 정답 맞춘 횟수를 score에 저장
        for(int i=0; i < answers.length; i++) {

            if(answers[i] == pattern1[i % pattern1.length]) score[0]++;
            if(answers[i] == pattern2[i % pattern2.length]) score[1]++;
            if(answers[i] == pattern3[i % pattern3.length]) score[2]++;

        }

        // 최고점수 확인
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        // 최고점수랑 같은 유저번호 가져오기
        for(int i =0; i < 3; i++) {
            if(score[i] == maxScore) {
                answer.add(i+1);
            }
        }

        // List를 int[]로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
