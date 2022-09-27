import java.util.Scanner;

public class hienthiSNTNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số n");
        int n = scanner.nextInt();
        boolean check;
        if (n>=2){
            System.out.printf("Cac so nguyen to tu 0 den %d la: \n",n);
            for (int i = 2; i <=n ; i++) {
                //Kiem tra i co phai la so nguyen to hay khong?
                check = false;
                for (int j = 2; j <=Math.sqrt(i) ; j++) {
                    if(i % j==0){
                        //j la uoc cua i
                        check = true;
                        break;
                    }
                }
                if(!check){
                    //i la so nguyen to
                    System.out.printf("%d\t",i);
                }
            }
            System.out.printf("\n");
            }
        }
    }

