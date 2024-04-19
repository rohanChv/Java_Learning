import java.util.Scanner;

public class DoubleToInt {
    public static void main(String[] args) {
        double inputDouble;
        Scanner sc=new Scanner(System.in);
        int intgerCastedDouble;
        inputDouble=sc.nextDouble();
        intgerCastedDouble=(int)inputDouble;
        System.out.println(intgerCastedDouble);
    }
}
