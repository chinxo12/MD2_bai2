import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so bat ky");
        int n = scanner.nextInt();
        int i;
        int result = 0, result2=0;
        do {
            System.out.println("1. In ra các số chẵn và tính tổng trong khoảng 0...n ");
            System.out.println("2. In ra các số lẻ và tính tổng trong khoảng 0...n ");
            System.out.println("3. Kiểm tra n có phải số nguyên tố không ");
            System.out.println("4. Kiểm tra n có phải số hoàn hảo không ");
            System.out.println("5. In ra các số nguyên tố trong khoảng 0...n ");
            System.out.println("6. In ra các ước số của n và tính tổng");
            System.out.println("7. Thoát");
            int number = scanner.nextInt();
            boolean check = true;
            switch (number){
                case 1:
                    for ( i=0;i<=n;i++){
                        if (i%2==0){
                            result += i;
                            System.out.printf("%d\t",i);
                        }
                    }
                    System.out.println("La cac so chan trong day tu 0 - " + n );
                    System.out.println("Tong cac so chan trong day la: " + result);
                    break;
                case 2:
                    for (i=0;i<=n;i++){
                        if (i%2!=0){
                            result2 +=i;
                            System.out.printf("%d\t",i);
                        }
                    }
                    System.out.println("La cac so le trong day tu 0 - " + n );
                    System.out.println("Tong cac so le trong day la: " + result2);
                    break;
                case 3:
                    if (number<2){
                        check=false;
                    }else {
                        i =2;
                        check = true;
                        while (i<n){
                            if (n%i==0){
                                check = false;
                                break;
                            }
                            i++;
                        }
                    }
                    if (check){
                        System.out.println("so vua nhap la so nguyen to");
                    }else {
                        System.out.println("so vua nhap khong phai so nguyen to");
                    }
                    break;
                case 4:
                   int sum =0;
                   for (i=1;i<n/2;i++){
                       if (n%i==0){
                           sum+=i;
                       }
                   }
                   if (sum==n){
                       System.out.println("so vua nhap la so hoan hao");
                   }else {
                       System.out.println("so vua nhap khong phai la so hoan hao");
                   }
                    break;
                case 5:
                    for (int cont = 2; cont <=n; cont++){
                        i = 2;
                        check = true;
                        while (i<cont){
                            if (cont%i==0){
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check){
                            System.out.printf("%d\t",cont);
                        }
                    }
                    System.out.println("La cac so nguyen to tu 0 den " + n);
                    break;
                case 6:
                    int sum2=0;
                    for (i=1;i<=n;i++){
                        if (n%i==0){
                            sum2 +=i;
                            System.out.printf("%d\t",i);
                        }
                    }
                    System.out.println("la cac uoc so cua " + n);
                    System.out.println("Tong cua cac uoc so cua " + n + " la: " + sum2);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Hay nhap cac so tu 1-7");
            }
        }
        while (true);
    }
}