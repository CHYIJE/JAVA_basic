import java.util.Scanner;

public class S02Quiz {
    public static void main(String[] args) {
        //점수를 입력 받아서
        //90점 이상이면 a
        //80점 이상이면 b
        //70점 이상이면 c
        //60점 이상이면 d
        //60점 미만이면 f

        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();
        if(nextInt >= 90){
            System.out.println("A");
        } else if (nextInt >= 80) {
            System.out.println("B");
        } else if (nextInt >= 70) {
            System.err.println("C");
        } else if (nextInt >= 60) {
            System.err.println("D");
        } else{
            System.out.println("F");
        }
         

        scanner.close();

    }
}