package ch04;

public class S03temp {
    public static void main(String[] args) {
        int num = -2;

        System.out.println(num % 2);
        System.out.println(num % 3);

        switch(num % 2 + num % 3){
            case -1:
            case -2:
            case -3:
                System.out.println("잘못 입력했다.");
                return;
            default:
                System.out.println("잘 입력함");
        }

    }
}
