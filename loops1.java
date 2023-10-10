import java.util.Scanner;

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
        int i = 1;
        while (i <= 10) {
            System.out.println(i * i);
            i++;
        }
    }

    public static void problem5() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i * i;
            i++;
        }
        System.out.println(sum);
    }

    public static void problem6() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i * (i + 1));
            i++;
        }
    }

    public static void problem7() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i * (i + 1);
            i++;
        }
        System.out.println(sum);
    }

    public static void problem8() {
        int i = 1;
        while (i <= 10) {
            System.out.println(Math.pow(2, i));
            i++;
        }
    }

    public static void problem9() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += Math.pow(2, i);
            i++;
        }
        System.out.println(sum);
    }

    public static void problem10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(Math.pow(-1, i) * i);
            i++;
        }
    }

    public static void problem11() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += Math.pow(-1, i) * i;
            i++;
        }
        System.out.println(sum);
    }

    public static void problem12() {
        int i = 1;
        while (i <= 10) {
            System.out.println(Math.pow(i, 3));
            i++;
        }
    }

    public static void problem13() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += Math.pow(i, 3);
            i++;
        }
        System.out.println(sum);
    }

    public static void problem14() {
        int i = 1;
        while (i <= 10) {
            System.out.println(Math.pow(-1, i + 1) * Math.pow(i, 2));
            i++;
        }
    }

    public static void problem15() {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += Math.pow(-1, i + 1) * Math.pow(i, 2);
            i++;
        }
        System.out.println(sum);
    }

    public static void problem16() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
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