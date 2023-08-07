import java.util.Scanner;

public class Marks{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        //check name input
        if(name.equals("")){
            System.out.println("Invalid Name");
            System.exit(0);
        }else if(name.startsWith(" ") & name.endsWith(" ")){
            System.out.println("Invalid Name");
            System.exit(0);
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        //Age check
        if(age < 10 | age > 18){
            System.out.println("Invalid age");
            System.exit(0);
        }

        System.out.print("Enter your Subject 1: ");
        String sub1 = scanner.nextLine();
        //Subject Name Check
        if(!sub1.strip().startsWith("SE-")){
            System.out.println("Invalid Subject");
            System.exit(0);
        }
        if((sub1.charAt(sub1.length()-1) >65 & sub1.charAt(sub1.length()-1)< 90)| (sub1.charAt(sub1.length()-1) >97 & sub1.charAt(sub1.length()-1)< 122) ){
            System.out.println("Invalid Subject");
            System.exit(0);
        } 
        System.out.print("Enter your Mark 1: ");
        double mark1 = scanner.nextDouble();
        scanner.nextLine();
        //Marks check
        if (mark1 < 0 & mark1 > 100){
            System.out.println("Invalid Marks");
            System.exit(0);
        }


        System.out.print("Enter your Subject 2: ");
        String sub2 = scanner.nextLine();
        //Subject Name Check
        if(!sub2.strip().startsWith("SE-")){
            System.out.println("Invalid Subject");
            System.exit(0);
        }
        if((sub2.charAt(sub2.length()-1) >65 & sub2.charAt(sub2.length()-1)< 90)| (sub2.charAt(sub2.length()-1) >97 & sub2.charAt(sub2.length()-1)< 122) ){
            System.out.println("Invalid Subject");
            System.exit(0);
        } 
        if(sub2.equals(sub1)){
            System.out.println("Duplicate Subject");
            System.exit(0);
        }
        System.out.print("Enter your Mark 2: ");
        double mark2= scanner.nextDouble();
        scanner.nextLine();
        //Marks check
        if (mark2 < 0 | mark2 > 100){
            System.out.println("Invalid Marks");
            System.exit(0);
        }

        System.out.print("Enter your Subject 3: ");
        String sub3 = scanner.nextLine();
        //Subject Name Check
        if(!sub3.strip().startsWith("SE-")){
            System.out.println("Invalid Subject");
            System.exit(0);
        }
        if((sub3.charAt(sub3.length()-1) >65 & sub3.charAt(sub3.length()-1)< 90)| (sub3.charAt(sub3.length()-1) >97 & sub3.charAt(sub3.length()-1)< 122) ){
            System.out.println("Invalid Subject");
            System.exit(0);
        } 
        if(sub3.equals(sub2) | sub3.equals(sub1)){
            System.out.println("Duplicate Subject");
            System.exit(0);
        }
        System.out.print("Enter your Mark 3: ");
        double mark3 = scanner.nextDouble();
        scanner.nextLine();
        //Marks check
        if (mark3 < 0 | mark3 > 100){
            System.out.println("Invalid Marks");
            System.exit(0);
        }
        
        
        //Total avg and status
        double total = mark1 + mark2 + mark3;
        double average  = total /3;

        String status = average > 75 ? "DP" : average > 65 ? "CP" : average > 55 ? "P" : "F";
        String status1 = mark1 > 75 ? "DP" : mark1> 65 ? "CP" : mark1> 55 ? "P" : "F";
        String status2 = mark2 > 75 ? "DP" : mark2> 65 ? "CP" : mark2> 55 ? "P" : "F";
        String status3 = mark3 > 75 ? "DP" : mark3> 65 ? "CP" : mark3> 55 ? "P" : "F";

        // Print Details
        final String BOLD = "\033[37;1m";
        final String RESET = "\033[0m";
        final String LINE ="\033[38;5;172m";
        final String NUM ="\033[38;5;216m";
        final String GREEN ="\033[38;5;22m";
        final String BLUE = "\033[38;5;19m";
        final String YELLOW = "\033[33m";
        final String RED = "\033[31m";

        String statusCol = average > 75 ? BLUE : average > 65 ? GREEN: average > 55 ? YELLOW: RED;
        String status1Col = mark1 > 75 ? BLUE : mark1 > 65 ? GREEN: mark1 > 55 ? YELLOW: RED;
        String status2Col = mark2> 75 ? BLUE : mark2 > 65 ? GREEN: mark2 > 55 ? YELLOW: RED;
        String status3Col = mark3 > 75 ? BLUE : mark3> 65 ? GREEN: mark3 > 55 ? YELLOW: RED;

        //System.out.printf();
        System.out.println();
        System.out.printf("Name : %s%s%s%s\n",BOLD,BLUE,name.toUpperCase(),RESET);
        System.out.printf("Age : %s years old\n",age);
        System.out.printf("Status : %s%s%s\n",statusCol,status,RESET);
        System.out.printf("Total Marks : %.2f\t\t",total);
        System.out.printf("Total Marks : %.2f\t\t\n",average);

        
        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"----------","--------","------------");
        System.out.printf("|%s%3$-10s%2$s%6$s|%2$s%1$s%4$-8s%2$s%6$s|%2$s%1$s%5$-12s%2$s%6$s|\n",BOLD,RESET," SUBJECT"," MARKS"," STATUS",LINE);
        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"----------","--------","------------");
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%2$-8.2f%5$s|%4$s%6$s%3$11s %5$s|\n",sub1,mark1,status1,RESET,LINE,status1Col,status1Col);
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%2$-8.2f%5$s|%4$s%6$s%3$11s %5$s|\n",sub2,mark2,status2,RESET,LINE,status2Col,status2Col);
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%2$-8.2f%5$s|%4$s%6$s%3$11s %5$s|\n",sub3,mark3,status3,RESET,LINE,status3Col,status3Col);
        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"----------","--------","------------");


    }
}