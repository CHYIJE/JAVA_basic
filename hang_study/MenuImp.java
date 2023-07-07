package hang_study;

import java.util.Random;
import java.util.Scanner;

public class MenuImp implements Menu {

    @Override
    public String[] printMenu() {
        // String[] items = {"돈까스","설렁탕","뼈다귀","밀면","햄버거"};
        ArrayList<String> items = new ArrayList<>();
        items.add("돈까스");
        items.add("설렁탕");
        items.add("뼈다귀");
        items.add("밀면");
        items.add("햄버거");
        // 메뉴를 출력
        // System.out.println("1." + items[0]);
        // System.out.println("2." + items[1]);
        // System.out.println("3." + items[2]);
        // System.out.println("4." + items[3]);
        // System.out.println("5." + items[4]);
        for (int i = 0; i < items.length; i++) {
            System.out.println(i+1 + ". " + items[i]); 
        }
        System.out.println("6. 아무거나");
        return items;
            }

    @Override
    public int inputNum() {
        System.out.print("입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        return menu;
        }

    @Override
    public void enterMenu(int menu, String [] items) {
        if(menu == 1) {
            System.out.println("1." + items[0] + "를 선택했습니다");
            System.out.println("다 무라 1");

        }
        }

    @Override
    public void aiPrintMenu() {
        Random random = new Random();
             int rnum = random.nextInt(items.length);

             System.out.println("엄청난 빅데이터로 분석하고 머신러닝으로 학습된 데이터의 결과로");
             System.out.println("추천된 " + items [rnum] + "입니다.");
        }
    
}
