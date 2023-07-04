class Slave{
    String name;

    public Slave(String name){
        this.name = name;
    }
}
public class S10 {
    public static void main(String[] args) {
        Slave slave1 = new Slave("춘식이");
        // 참조형 변수를 아래처럼 사용하면
        // 복사의 개념이 아니라 같은 객체에
        // 별명을 하나 더 붙여 준 것과 비슷하다
        Slave slave2 = slave1;

        // slave2의 내용을 바꾸면
        slave2.name = "점례";

        // slave1의 내용도 바뀐다 (slave1과 slvae2는 같은 객체이기 때문)
        System.out.println(slave1.name);
    }
}
