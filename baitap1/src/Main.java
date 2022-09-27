import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j;

        do {
            System.out.println("*****************MENU****************");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    for (i=0;i<5;i++){
                        for (j=0;j<10;j++){
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    System.out.println("1. Print the square triangle  top-left");
                    System.out.println("2. Print the square triangle top-right");
                    System.out.println("3. Print the square triangle botton-left");
                    System.out.println("4. Print the square triangle botton-right");
                    int nums = scanner.nextInt();
                    if (nums == 1){
                        for (i=0;i<5;i++){
                            for (j=10;j<1;j--){
                                System.out.print("*");
                            }
                            System.out.println("*");
                        }
                    }

                    break;
                case 3:

                    break;
                case 4:
                    break;
                default:
                    System.err.println("Please press 1 - 4");
            }
        }while (true);
    }
}