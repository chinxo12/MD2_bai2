public class Main {
    public static void main(String[] args) {
        int i,j;
        boolean check = true;
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (i=0;i<20;i++){
            if (i<2){
                check = false;
            }else {
                for (j=2;j<=100;j++){
                    i=2;
                    check=true;
                    while (i<j){
                        if (j%i==0){
                            check=false;
                        }
                        i++;
                    }
                    if (check){
                        System.out.printf("%d\t",j);
                    }
                }
            }
        }

    }
}