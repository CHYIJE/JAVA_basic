package ch05;

public class S02 {
    public static void main(String[] args) {
        // 배열의 값을 교환하기
        int[] intArry = new int[2];
        intArry[0] = 1;
        intArry[1] = 2;
        
        // 임시 저장 int
        int temp = intArry[0];

        intArry[0] = intArry[0];
        intArry[1] = intArry[1];
        intArry[1] = temp;
    }
}
