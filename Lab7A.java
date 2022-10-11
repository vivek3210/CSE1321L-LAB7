import java.util.Scanner;
public class Lab7A {
    public static void main(String[] args) {
        int sizeValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        sizeValue = input.nextInt();
        System.out.println("This is the requested " + sizeValue + "x" + sizeValue + " box:");

        for(int rowSize = 1; rowSize <= sizeValue; rowSize++)
        {
            for(int columnSize = 1; columnSize <= sizeValue; columnSize++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
