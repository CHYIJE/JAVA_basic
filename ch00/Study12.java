package ch00;
// 싱글톤
class Sun{

    // 생성자를 private으로 만들어서 new를 막는다
    private Sun () {
    };

    private static Sun sun = null;
    
    public static Sun getSun() {
        if(sun == null) {
            // 객체를 한번만 생성
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
// 싱글톤 만드는 이유
// 메모리를 적게 먹는다
// 여러개를 만들어 메모리를 크게 먹기 보다 여러번 쓸 수 있는 한개를 계속 쓰는 방법