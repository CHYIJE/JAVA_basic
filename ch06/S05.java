package ch06;

class CalcUtil {
    public static int add(int a, int b){
        return a + b;
    }
}

public class S05 {
    public static void main(String[] args) {
        
        int result = CalcUtil.add(2,3);

        System.out.println(result);

    }
}
