/*
Нарисовать треугольники
 */

public class Ex8 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3 - i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 4; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < 4 - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

        /*
         //var 2
        String x = "*";
        int n = 1;
        for (int i = 1; i <= 4; i++) {
                System.out.println(x);
                x += " *";
            }
        }
    }
*/

/*
        String x = "*";
        int n = 3;
        for (int i = 0; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print("*");
                }
            System.out.println("*");
            }
        }
    }
*/




