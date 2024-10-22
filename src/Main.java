

public class Main {
    public static void main(String[] args) {

        KakaoBlindRecruitment.Solution solution = new KakaoBlindRecruitment.Solution();
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };

        String[] result = solution.solution(record);

        // 결과 출력
        for (String res : result) {
            System.out.println(res);
        }

    }
}