import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so bat ky");
        int n = scanner.nextInt();
        int i=0;
        int result = 0;
        for ( i=0;i<=n;i++){
            if (i%2==0){
                result += i;
            }
        }
        System.out.println(result);


    }
}