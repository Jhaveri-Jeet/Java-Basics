public class Fibonacci {
    public static void main(String[] args){
        int no1=0,no2=1,no3;
        System.out.println(no1 + "\n" + no2);
        for (int i = 0; i <=5; i++){
            no3=no1+no2;
            System.out.println("" + no3);
            no1=no2;
            no2=no3;
        }
    }
}
