
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // ask the user how many times the text should be printed
        System.out.println("How many?");
        int i = 0;
        int iteration = Integer.parseInt(reader.nextLine());
        // use the while structure to call the printText method several times
        while (i<iteration) {
            printText();
            i++;
        }
    }
}