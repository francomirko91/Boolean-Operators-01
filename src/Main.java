public class Main {
    public static void main(String[] args) {

        boolean A = 2 <= 2 && !true;
        System.out.println(A);
        //A is always false

        boolean B = !false && 3 > 2;
        System.out.println(B);
        //B is always true

        boolean t = false;
        boolean f = true;

        boolean result = !(!t || f);
        System.out.println(result);
        //result is always false

        boolean result2 = 6 > 6 ^ !(true && true);
        System.out.println(result2);
        //result2 is always false










    }
}
