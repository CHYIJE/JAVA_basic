package ch04;
//ctrl + shift + 위아래 (해당 줄 옮기기)
public class S08 {
    public static void main(String[] args) {
        //continue

        int i = 0;

        while(i < 1000){
            i++;
            if(i % 2 != 0){
                // continue를 사용한 위치에서 현재 반복회차를 중지한다
                // 다음 반복으로 넘어간다
                continue;
            }
            System.out.println(i); 
            

        }
    }
}
