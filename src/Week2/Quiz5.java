package Week2;

public class Quiz5 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        int c1 = 0;

        int c2 = 0;

        for(int i = 0; i < goal.length; i++) {

            if(c1 < cards1.length && goal[i].equals(cards1[c1])) {
                c1++;
                answer = "Yes";
            } else if(c2 < cards2.length && goal[i].equals(cards2[c2])) {
                c2++;
                answer = "Yes";
            } else {
                answer = "No";
                break;
            }


        }

        return answer;
    }
}
