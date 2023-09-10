class Add {

  Add(int a, int b) {
    int ans = a + b;
    System.out.println("ans=" + ans);
  }

  Add(int a, int b, int c) {
    int ans = a + b + c;
    System.out.println("ans=" + ans);
  }

  Add(int a, int b, int c, int d) {
    int ans = a + b + c + d;
    System.out.println("ans=" + ans);
  }
}

class Main {

  public static void main(String args[]) {
    Add a = new Add(5, 5);
    Add b = new Add(5, 5, 5);
    Add c = new Add(5, 5, 5, 5);
  }
}
