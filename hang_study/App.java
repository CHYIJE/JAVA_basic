package hang_study;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    
        System.out.println("오늘 뭐 먹지?");
        Menu menu = new MenuImp();
        String[] items = menu.PrintMenu();
        int menu = menu.inputNum();
        menu.enterMenu(menu, items);
        // // 메뉴 작성
        // String[] items = {"돈까스","설렁탕","뼈다귀","밀면","햄버거"};
        // // 메뉴를 출력
        // // System.out.println("1." + items[0]);
        // // System.out.println("2." + items[1]);
        // // System.out.println("3." + items[2]);
        // // System.out.println("4." + items[3]);
        // // System.out.println("5." + items[4]);
        // for (int i = 0; i < items.length; i++) {
        //     System.out.println(i+1 + ". " + items[i]); 
        // }
        // System.out.println("6. 아무거나");

        // // 사용자에게 입력받고
        // System.out.print("입력하세요 : ");
        // Scanner sc = new Scanner(System.in);
        // int menu = sc.nextInt();
            
        // 만약에 1번을 누르면 선택된 메뉴가 출력
        // if(menu == 1) {
        //     System.out.println("1.돈까스를 선택했습니다");
        //     System.out.println("다 무라 1");

        // }
        // // 만약에 2번을 누르면 선택된 메뉴가 출력
        // if(menu == 2) {
        //     System.out.println("2.설렁탕를 선택했습니다");
        //     System.out.println("다 무라 1");

        // }
        // // 아무거나 선택가능(AI)
        // if(menu == 6) {
        //     Random random = new Random();
        //     int rnum = random.nextInt(items.length);

        //     System.out.println("엄청난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
        //     System.out.println("추천된 " + items [rnum] + "입니다.");

        // }
        
        // 선택된 메뉴 출력 

    
}


}