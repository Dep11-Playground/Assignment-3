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

        //Age check
        if(age < 10 && age > 18){
            System.out.println("Invalid age");
            System.exit(0);
        }
        
        //Subject Name Check
        if(!sub1.strip().startsWith("SE-")){
            System.out.println("Invalid Subject");
            System.exit(0);
        }
        if((sub1.charAt(sub1.length()) >65 & sub1.charAt(sub1.length())< 90)| (sub1.charAt(sub1.length()) >97 & sub1.charAt(sub1.length())< 122) ){
            System.out.println("Invalid Subject");
            System.exit(0);
        } 

        if(sub2.equals(sub1)){
            System.out.println("Duplicate Subject");
            System.exit(0);
        }
        if(sub3.equals(sub2) | sub3.equals(sub1)){
            System.out.println("Duplicate Subject");
            System.exit(0);
        }

        //Marks check
        if (mark1 < 0 | mark1 > 100){
            System.out.println("Invalid Marks");
            System.exit(0);
        }
        
        //Total avg and status
        double total = mark1 + mark2 + mark3;
        double average  = total /3;

        String Status = average > 75 ? "DP" : average > 65 ? "CP" : average > 55 ? "P" : "F";

        // Print Details
        


    }
}