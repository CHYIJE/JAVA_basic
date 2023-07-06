package ch00;

import java.util.Optional;

public class Study10 {
    public static void main(String[] args) {

        String str = null;

        // null 값이 들어올 수 있는 변수는 null 처리를 해주는 것이 좋다
        if(str == null) {
            System.out.println("데이터가 null 입니다");
        } else{

            System.out.println(str.length());
        }


        // null 값이 들어올 수 있는 변수를 컨트롤 할 때 사용한다.
        // null 처리를 강제할 수 있다
        Optional<String> OptionalStr = Optional.of("ㅁㄴㅇㄹ");

        if(OptionalStr.isEmpty()){
            System.out.println("데이터가 null입니다");
        } else{
            System.out.println(OptionalStr.get().length());
        }

        System.out.println(OptionalStr.orElse("값이 없습니다"));
    }
}
