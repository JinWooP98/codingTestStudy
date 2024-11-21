import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        /**

         결과는 2진수를 "#", " "의 형태로 변환해야함.
         접근 ↓
         그러기 위해선 10진수 배열 arr1, arr2을 2진수로 바꿔야하고,
         or 연산을 통해서 한쪽이라도 1이면  벽("#")으로 표시
         예외 ↓
         지도가 5*5 인데 이진수는 110 처럼 값이 나올 수도 있으니
         그럴 경우 while문을 통해서 앞에 공백을 추가
         */

        String[] answer = new String[n]; // 결과 배열

        for (int i = 0; i < n; i++) {
            String binary =
                    Integer.toBinaryString(arr1[i] | arr2[i]).toString().replaceAll("1", "#").replaceAll("0", " ");
            // 길이가 n보다 짧을 경우 앞에 공백 추가
            while (binary.length() < n) {
                binary = " " + binary;
            }
            answer[i] = binary;
        }

        return answer;
    }
}