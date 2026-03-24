import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

    //*************************************
    // Base Conversion Program
    //*************************************
    Scanner input = new Scanner(System.in);

    System.out.print("Base Conversion Program");

    System.out.print("Enter a base (2-9): ");
    int base = input.nextInt();

    int maxNumber = (int) Math.pow(base, 4) - 1;
    System.out.println("The maximun 4-digit, base 10 number in base " + base + " is: " + maxNumber + ".");

    System.out.print("Now enter a base 10 number in base" + maxNumber +  ".");
    int number = input.nextInt();

    int d1 = number / (base * base * base);
    int remainder1 = number % (base * base * base);

    int d2 = remainder1 / (base * base);
    int remainder2 = remainder1 % (base * base);

    int d3 = remainder2 / base;
    int d4 = remainder2 % base;

    System.out.println("The base " + base + " representation of " + number + " is: " + d1 + d2 + d3 + d4);

    input.close();
  }

}
