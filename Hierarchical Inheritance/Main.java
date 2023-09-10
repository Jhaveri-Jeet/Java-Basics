class input {

  protected int a = 10, b = 3;
}

class add extends input {

  add() {
    int add = super.a + super.b;
    System.out.println("addition = " + add);
  }
}

public class Main {

  public static void main(String args[]) {
    add a = new add();
  }
}
