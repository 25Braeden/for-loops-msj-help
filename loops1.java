import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class loops1 {
    public static void waitForUserInput(Scanner scanner) {
        System.out.print("Press 'Enter' to continue...");
        scanner.nextLine();
    }

    public static void problem1() {
        int i = 2;
        while (i <= 15) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public static void problem2() {
        int i = 2;
        int sum = 0;
        while (i <= 15) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println(sum);
    }

    public static void problem3() {
        int i = 40;
        int j = 10;
        while (i > j) {
            i = i - 10;
            System.out.println(i);
        }
    }

    public static void problem4() {
        int i = 40;
        int j = 10;
        while (i > j) {
            System.out.println(i);
            i = i - 10;
        }
    }

    public static void problem5() {
        int i = 30;                     
        int j = 10;                         
        if (i > 10 + j) {                
            while (i > j) {                   
                i = i - 10;                     
                System.out.println(i);         
            }                               
        } else {                            
            while (j >= i) {                  
                j = j - 10;                     
                System.out.println(j);          
            }
        }
    }

    public static void problem6() {
        int i = 10;
        int j = 10;
        if (i > 10 + j) {
            while (i > j) {
                i = i - 10;
                System.out.println(i);
            }
        } else {
            while (j >= i) {
                j = j - 10;
                System.out.println(j);
            }
        }
    }

    public static void problem7() {
        int i = 30;                     
        int j = 10;                         
        while (i >= j) {                     
            if (i > j + 10) {                
                System.out.println("yes");      
            } else {                            
                System.out.println("no");        
            }   
            i = i - 10;                     
        }
    }

    public static void problem8() {
        for (int i = 1; i <= 10; i++) {
            if (i == 2) {
                System.out.println("hello");
            } else if (i == 3) {
                System.out.println("goodbye");
            } else if (i == 4) {
                System.out.println("why");
            }
            if (i < 5) {
                System.out.println("help");
            }
            if (i > 6) {
                System.out.println("blue");
            }
        }
    }

    public static void problem9() {
        int w = 0;
        for (int h = -2; h <= 5; ++h) {
            w = w + h;
        }
        System.out.println(w);
    }

    public static void problem10() {
        int w = 0;
        for (int h = 10; h > 0; --h) {
            System.out.print(w);
        }
    }

    public static void problem11() {
        int n = 1;
        for (int k = 2; k <= 5; k++) {
            n = k - 2 * 3;
            System.out.println(k + "  " + n);
        }
    }

    public static void problem12() {
        for (int x = 1; x <= 5; x++) {
            System.out.println(x);
        }
        // x is not accessible outside the for loop
    }

    public static void problem13() {
        List<Integer> values = new ArrayList<>();
        values.add(9);
        values.add(-3);
        values.add(4);
        values.add(6);
        values.add(0);
        values.add(5);
        values.add(6);
        values.add(0);
        values.add(5);
    
        int sum = 0;
        boolean finished = false;
        int count = 0;
    
        for (int number : values) {
            if (number > 0)
                sum += number;
            else if (number == 0)
                finished = true;
            count++;
        }
    
        System.out.println(sum + "  " + count);
    }

    public static void problem14() {
        System.out.println("This sorts characters into three categories: punctuation, letters, and digits. It will tell the user what type of character they entered until they press /");
    }

    public static void problem15() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(character);
        }
    }

    public static void problem16() {
        Scanner getkeybd = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = getkeybd.nextInt();
        int totpay = 0;
        int empCount = 0;

        while (empCount < numEmployees) {
            System.out.println("Hours (enter a negative value to stop): ");
            int hours = getkeybd.nextInt();

            // Check for the sentinel value (negative hours)
            if (hours < 0) {
                break; // Exit the loop if hours are negative
            }

            System.out.println("Rate: $");
            double rate = getkeybd.nextDouble();
            double pay = hours * rate;
            System.out.println("Employee pay is : $ " + pay);
            totpay += pay;
            empCount++;
        }

        System.out.println("Total payroll is $ " + totpay);
    }

    public static void problem17() {
        Scanner scanner = new Scanner(System.in);
        int outstandingCount = 0;
        int satisfactoryCount = 0;
        int unsatisfactoryCount = 0;
    
        while (true) {
            System.out.print("Enter an exam score (0-100, negative value to exit): ");
            if (scanner.hasNextInt()) {
                int score = scanner.nextInt();
                // Clear the newline character left in the input stream
                scanner.nextLine();
    
                if (score < 0) {
                    break;
                } else if (score >= 0 && score <= 100) {
                    if (score >= 90) {
                        System.out.println("Outstanding");
                        outstandingCount++;
                    } else if (score >= 70) {
                        System.out.println("Satisfactory");
                        satisfactoryCount++;
                    } else {
                        System.out.println("Unsatisfactory");
                        unsatisfactoryCount++;
                    }
                } else {
                    System.out.println("Invalid score. Please enter a score between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer score.");
                // Clear the invalid input
                scanner.nextLine();
            }
        }
    
        System.out.println("Outstanding scores: " + outstandingCount);
        System.out.println("Satisfactory scores: " + satisfactoryCount);
        System.out.println("Unsatisfactory scores: " + unsatisfactoryCount);
    }   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'y' to continue: ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("y")) {
                break;
            }

            problem1();
            waitForUserInput(scanner);
            problem2();
            waitForUserInput(scanner);
            problem3();
            waitForUserInput(scanner);
            problem4();
            waitForUserInput(scanner);
            problem5();
            waitForUserInput(scanner);
            problem6();
            waitForUserInput(scanner);
            problem7();
            waitForUserInput(scanner);
            problem8();
            waitForUserInput(scanner);
            problem9();
            waitForUserInput(scanner);
            problem10();
            waitForUserInput(scanner);
            problem11();
            waitForUserInput(scanner);
            problem12();
            waitForUserInput(scanner);
            problem13();
            waitForUserInput(scanner);
            problem14();
            waitForUserInput(scanner);
            problem15();
            waitForUserInput(scanner);
            problem16();
            waitForUserInput(scanner);
            problem17();
            waitForUserInput(scanner);
        }
    }

}