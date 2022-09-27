import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*********************Menu********************");
            System.out.println("1 In hình chữ nhật");
            System.out.println("2 In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3 In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4 thoát");
            System.out.println("sự lựa chọn của bạn là");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
//                    System.out.println("nhập vào chiều rộng");
//                    int chieuRong = scanner.nextInt();
//                    System.out.println("nhập vào chiều daì");
//                    int chieuDai = scanner.nextInt();
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2 :
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    for (int i = 5; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("mời nhập số từ 1-4");


            }

        }while (true);


    }
}




//        System.out.println("nhập vào chiều rộng");
//        int chieuRong =scanner.nextInt();
//        System.out.println("nhập vào chiều dài");
//        int chieuDai = scanner.nextInt();
//        for (int i = 0; i < chieuRong; i++) {
//            for (int j = 0; j < chieuDai; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }




