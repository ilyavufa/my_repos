import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?\n" +  "Enter text: ");
        String userName = scanner.nextLine();
        System.out.println("Hello and welcome! " + userName);
    }
}