package ch06;

class Slave {
    String name;
    int hp;
    int position;

    public Slave(String name, int hp, int position) {
        this.name = name;
        this.hp = hp;
        this.position = position;
    }

    // 이름만 받고 피 100 포지션 0
    public Slave (String name){
        this(name, 100, 0);
    }

    public void moveRight () {
        this.position++;
        System.out.println(this.name + "가 오른쪽으로 도망갔습니다");
        reduceHP();        
    }

    public void moveLeft () {
        if(this.position < 1){
            System.out.println(this.name + "는 왼쪽에 땅굴을 파지 못합니다");
            // 함수(메소드)에서 return을 만나면 아래 코드는 실행되지 않는다.
            return;
        }
        this.position--;
         System.out.println(this.name + "가 왼쪽으로 도망갔습니다");
         reduceHP();
    }

    public void reduceHP(){
        this.hp--;
        System.out.println(this.name + "의 체력이 내려갔습니다");
    }

    public void rice(int food){
        this.hp = this.hp + food;
        System.out.println(this.name + "가 밥을 먹었습니다");
    }

    public String  dong() {
        return "흔적";
    }

}

public class S03 {
    public static void main(String[] args) {
        Slave slave = new Slave("개똥이");
        
        slave.moveLeft();
        slave.moveRight();
        slave.rice(5);
        System.out.println(slave.hp);
        System.out.println(slave.dong());
    
    }
}
