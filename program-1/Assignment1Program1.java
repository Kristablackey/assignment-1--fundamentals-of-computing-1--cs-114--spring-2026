import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {

  //*************************************
  // Print fist and last initials in large block letters
  //*************************************
    {
      System.out.println("K    K   BBBBB");
      System.out.println("K   K    B    B");
      System.out.println("K  K     B   B");
      System.out.println("KKK      BBBBB");
      System.out.println("K. K     B   B");
      System.out.println("K   K    B    B");
      System.out.println("K    K   BBBBB");
    }
  //*************************************
  // Enter a 5-Character string
  //*************************************
    {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a 5-character string:");
    String str = input.nextLine();

    if (str.length()== 5) {
    String trimmedRevered =
    new StringBuilder(str.substring(1,4)) .reverse().
    toString();

    System.out.println("Step 1 result"+ trimmedRevered);}

    input.close();
    }
  }
}
