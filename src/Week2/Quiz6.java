package Week2;

public class Quiz6 {

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        int turn = 1;
        int user = 2;

        Boolean isFinish = false;

        String[] answers = new String[words.length];

        answers[0] = words[0];

        for(int i = 1; i < words.length; i++) {

            char lastWord = words[i-1].charAt(words[i-1].length() - 1);

            char firstWord = words[i].charAt(0);

            if(lastWord == firstWord) {

                for(int j = 0; j < i; j ++) {
                    if(answers[j].equals(words[i])) {
                        answer[0] = user;
                        answer[1] = turn;
                        isFinish = true;
                        break;
                    }
                }

                answers[i] = words[i];

                if(user == n) {
                    user = 1;
                    turn++;
                } else {
                    user++;
                }

            } else {
                answer[0] = user;
                answer[1] = turn;
                isFinish = true;
                break;
            }

            if(isFinish) {
                break;
            }


        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
