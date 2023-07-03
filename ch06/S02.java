// package ch06;

// // 이름에 대고 shift + f6  (관련된 이름 전체 바꾸기)
// class King {
//     String name;
//     int position;
//     // alt + insert  - 제너럴 컨스트럭션 (생성자 생성 툴)    
//     public King(String name, int position) {
//         this.name = name;
//         this.position = position;
//         System.out.println(this.name + "가 태어났습니다");
//     }
    
//     public King(String name){
//         this(name, 0);
//     }

//     public void moveRight(){
//         this.position++;
//         System.out.println(this.name + "가 오른쪽으로 이동");
//     }
    
//     public void moveLeft(){
//         this.position--;
//         System.out.println(this.name + "가 왼쪽으로 이동");
//     }
// }

// public class S02 {
//     public static void main(String[] args) {
//         // 이성계 생성
//         King king = new King("이성계");
        
//         // 유저가 이성계를 움직임
//         king.moveRight();
//         king.moveRight();

//         // 이성계 위치 확인
//         System.out.println(king.position);

//     }
// }

