import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien bạn muốn gửi (Đơn vị: Triệu đồng): ");
        double money = scanner.nextDouble();
        System.out.println("Nhạp vào số tháng bạn muốn gửi");
        double month = scanner.nextDouble();
        System.out.println("Nhập vào lãi suất hiện tại (Đơn vị: %)");
        double laiSuat = scanner.nextDouble();
        double tienLai;
        tienLai = money * Math.pow(1+laiSuat/100/12,month);
        System.out.println(tienLai);


    }
}