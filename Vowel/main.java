import java.util.Scanner;

class check_character {

  void check() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the character you want to check : ");
    char letter = sc.next().charAt(0);
    if (
      letter == 'a' ||
      letter == 'A' ||
      letter == 'e' ||
      letter == 'E' ||
      letter == 'i' ||
      letter == 'I' ||
      letter == 'o' ||
      letter == 'O' ||
      letter == 'u' ||
      letter == 'U'
    ) {
      System.out.println("This is an Vowel Character");
    } else {
      System.out.println("This is an Constant Character");
    }
  }
}

class main {

  public static void main(String args[]) {
    check_character c = new check_character();
    c.check();
  }
}
