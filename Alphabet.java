public class Alphabet{

       
            public static void main(String[] args) {
                // Print A
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        if ((j == 0 || j == 5) && i != 0 || (i == 0 || i == 2) && (j > 0 && j < 5))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
        
                System.out.println();
        
                // Print B
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j <= 5; j++) {
                        if ((j == 0 || j == 5) && i != 6 || i == 6 && (j > 0 && j < 5) || i == 3 && j > 0 && j < 4 || i > 0 && i < 3 && j == 4 || i > 3 && i < 6 && j == 0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
        
                System.out.println();
        
                // Print C
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j <= 5; j++) {
                        if ((j == 0 && i != 0 && i != 6) || (i == 0 || i == 6) && j > 0 && j < 5 || i > 0 && i < 6 && j == 5)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
    