import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBase {
    static String findBase(int decimal){
        String base = "";
        while(decimal>0){
            base+=decimal%2;
            decimal/=2;
        }
        StringBuilder baseVal = new StringBuilder();
        baseVal.append(base);
        baseVal.reverse();
        return baseVal.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        System.out.println(findBase(decimal));
    }
}
