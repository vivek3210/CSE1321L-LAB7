import java.util.Scanner;
public class Lab7B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int sizeValue = scan.nextInt();
        int rowSize;
        int colSize;
        System.out.println("This is the requested " + sizeValue + "x" + sizeValue + " right-triangle: ");
        for (rowSize = 0; rowSize < sizeValue; rowSize++){
            for (colSize = 1; colSize >= sizeValue; colSize--){
                System.out.print(" ");
            }
            for (colSize = 0; colSize <= rowSize; colSize++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
