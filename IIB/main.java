public class main {

  main() {
    System.out.println("This is the Constructor");
  }

  {
    System.out.println("This is the IIB Block");
  }

  public static void main(String args[]) {
    main i1 = new main();
    // main i2 = new main();
  }
}
