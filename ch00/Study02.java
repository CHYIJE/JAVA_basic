package ch00;
public class Study02 {
    // 한 프로그램 내에 여러 main함수가 있을 수 없다.
    public static void main(String[] args) {
        // 변수
        // 데이터를 java 프로그램이 살아있는 동안 유지

        // 정수형 데이터를 저장할 때 int를 사용한다.
        // 소수가 없는 숫자
        // -1 -2 0 1 2 100 2000
        // +-21억 정도 까지 저장된다
        int num = 1;
        // 정수형 데이터 int보다 큰 숫자를 저장할 때 사용
        // L을 붙여도 되고 안붙여도 됨
        long longNum = 2L;

        // 실수형 데이터 (무조건 F를 붙여야함)
        float floatNum = 1.2F;
        // 실수형 데이터 더 큰 것
        double doubleNum = 1.2;

        // 논리형 데이터
        boolean bool = true; // 또는 false

        // 문자 데이터 (캐릭터의 줄임말 char)
        // 홀 따옴표로 감싼다.
        char ch = 'a';

        // 문자열 데이터
        String str = "hellow world";
    

    }

}