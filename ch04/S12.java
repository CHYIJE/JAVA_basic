package ch04;

public class S12 {
    public static void main(String[] args) {
        //for, while 문을 이요해서 별찍기
        // "*****" x "*" o

        // 1
        // *****
        // *****
        // *****
        // *****

        // 2
        // *        
        // **        
        // ***       
        // ****        
        // *****
        
        // 3
        // *****
        // ****
        // ***
        // **
        // *

        // 4
        // *****
        //  ***
        //   *

        
        // 5 
        // *****
        // *   *
        // *   *
        // *   *
        // *****

        //  // 1
        // for(int i=0;i<5;i++){
		//     System.out.print("*");
        //     System.out.print("*");
        //     System.out.print("*");
        //     System.out.print("*");
        //     System.out.println("*");


        //2
        //  for (int i = 0; i < 5; i++) {
        //     System.out.print("*");
        //   if (i == 4){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.print("*");
        //   if (i == 3){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.print("*");
        //   if (i == 2){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.print("*");
        //   if (i == 1){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.println("*");
          
        // }

        // // (3)
        //  for (int i = 5; i > 0; i--) {
        //     System.out.print("*");
        //   if (i == 1){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.print("*");
        //   if (i == 2){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.print("*");
        //   if (i == 3){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.print("*");
        //   if (i == 4){
        //     System.out.println();
        //     continue;
        //   }
        //   System.out.println("*");
          
        // }

        // // (4)
        for (int i = 5; i > 0; i--) {
            System.out.print("*");
            if (i == 3) {
                System.out.println("*");
                continue;
            }

            
        }

    }
}