import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null,  address = null;
        int yearofBirth = 0,age;


        do {
            System.out.println("********************MENU********************");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Tính tuổi sinh viên");
            System.out.println("4. Thoat");
            int number = Integer.parseInt(scanner.nextLine());
            switch (number){
                case 1:
                    System.out.println("Nhap ten sinh vien");
                    name = scanner.nextLine();
                    System.out.println("Nhap nam sinh cua sinh vien");
                    yearofBirth = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap dia chi cua sinh vien");
                    address = scanner.nextLine();
                    break;
                case 2:

                    System.out.println("********THONG TIN SINH VIEN********");
                    System.out.println("Name: " + name);
                    System.out.println("Year of Birth: " + yearofBirth);
                    System.out.println("Address: " + address);
                    break;
                case 3:
                    age = 2022 - yearofBirth;
                    System.out.println("tuoi cua sinh vien " + name + " la " + age);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Pleass press 1 - 4");
            }
        }while (true);

    }
}