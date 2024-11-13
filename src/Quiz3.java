public class Quiz3 {

    public static void main(String[] args) {

        int a = 9;



        String b = Integer.toBinaryString(a);

        System.out.println("b = " + b);

        System.out.println(b.length());

        String c = "안녕하세요";

        System.out.println("c.length() = " + c.length());


        for (char digit : b.toCharArray()) {
            System.out.println(digit);
        }

        System.out.println("0" + "1");
    }
}
