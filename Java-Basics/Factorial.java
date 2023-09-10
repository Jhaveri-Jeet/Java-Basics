public class Factorial {
    public static void main(String[] args) {
        int fac = 1, i;
        for (i = 1; i <= 5; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}
