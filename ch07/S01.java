package ch07;

class 초보자 {
    String skill1 = "달팽이던지기";
}

class 마법사 extends 초보자{
    String skill2 = "매직클로";
        
}

// 썬콜 전직 / skill3  썬더볼트
class 썬콜 extends 마법사{
    String skill3 = "썬더볼트";
}


public class S01 {
    public static void main(String[] args) {
        마법사 magic1 = new 마법사();

        System.out.println(magic1.skill1);
        System.out.println(magic1.skill2);
        System.out.println(magic1.skill);

    }
}
