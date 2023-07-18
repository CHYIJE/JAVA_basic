package ch00;
// 싱글톤 예
class Sun{

    // 생성자를 private으로 만들어서 new를 막는다
    private Sun () {
    };

    private static Sun sun = null;
    
    public static Sun getSun() {
        if(sun == null) {
            sun = new Sun();
        }
        return sun;
    }

}


public class Study12{

public static void main(String[] args) {
    
    System.out.println(Sun.getSun());
    System.out.println(Sun.getSun());
    System.out.println(Sun.getSun());
    System.out.println(Sun.getSun());
    System.out.println(Sun.getSun());
    System.out.println(Sun.getSun());
    }

}