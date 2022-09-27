import java.util.Scanner;

public class hienThi20SoNguyenTo {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.printf(" 20 số nguyên tố đầu tiên là\n" );
                boolean check ;



                int N = 2;
                int count = 0;
                while (count < 20) {
                    check = true;
                    for (int i = 2; i <= N; i++)
                        if (N % i == 0) {
                            check = false;
                            break;
                        }
                    if (check) {
                        System.out.printf("%d ",N);
                        count++;
                    }
                    N++;
                }

            }
        }
