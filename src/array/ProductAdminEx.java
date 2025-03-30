package array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] productNames = new String[5];
        int[] productPrice = new int[5];
        int productCount = 0;

        while(true)
        {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.printf("메뉴를 선택하세요 : ");
            int menu = scan.nextInt();

            switch (menu)
            {
                case 1:
                    scan.nextLine();

                    if(productCount == 4)
                    {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        continue;
                    }

                    System.out.printf("상품 이름을 입력하세요 : ");
                    productNames[productCount] = scan.nextLine();




                    System.out.printf("상품 가격을 입력하세요 : ");
                    productPrice[productCount] = scan.nextInt();
                    productCount++;
                    continue;


                case 2:
                    if(productCount == 0)
                    {
                        System.out.println("등록된 상품이 없습니다.");
                        continue;
                    }
                    for(int i =0; i< productCount; i++)
                    {
                        System.out.println(productNames[i] + " : "+productPrice[i]);
                    }
                    continue;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);

            }




        }

    }
}
