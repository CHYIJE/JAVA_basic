package ch04;

public class S14 {
    public static void main(String[] args) {
        
        // 2
        // *        
        // **        
        // ***       
        // ****        
        // *****
        // 행이 5개네
        // 처음 열은 1개 1개씩 늘어나네
        // for (int i = 0; i < 5 ; i++) {
        //    //1
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        // // 0 1 2 
        //     }
        //     System.out.println();
        // }

        // 4
        // *****
        //  ***
        //   *
        // 행이 3개
        // 열에 있는 공백이 0개 1개 2개
        // 열이 있는 별이 5개 3개 1개
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // i     == 0 1 2
            // i * 2 == 0 2 4
            // 5 4 3 2 1
            // 5 4 3
            // 5
            for (int j = 5; j > i * 2; j--) {
                System.out.print("*");
                
            }
            System.out.println();
        }


        // 구구단
        // 2 * 1 = 2
        // ...
        // 9 * 9 = 81

        // for (int i = 2; i < 10; i++) {
        //     for (int j = 1; j < 10 ; j++) {
        //         // System.out.println(i*j);
        //         System.out.println( i + "x" + j + "=" + i*j);

                
        //     }
        //     System.out.println();
        // }
        
    }
}
