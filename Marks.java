import java.util.Scanner;

public class Marks{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Subject 1: ");
        String sub1 = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Enter your Mark 1: ");
        double mark1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your Subject 2: ");
        String sub2 = scanner.nextLine();

        System.out.print("Enter your Mark 2: ");
        double mark2= scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your Subject 3: ");
        String sub3 = scanner.nextLine();

        System.out.print("Enter your Mark 3: ");
        double mark3 = scanner.nextDouble();
        scanner.nextLine();

        //check name input
        if(name.equals("")){
            System.out.println("Invalid Name");
            System.exit(0);
        }else if(name.startsWith(" ") & name.endsWith(" ")){
            System.out.println("Invalid Name");
            System.exit(0);
        }

        //

    }
}