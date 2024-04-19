import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long longValue=300L;
        int integerCasterLongValue=(int)longValue;
        byte byteCastedIntegerValue=(byte)integerCasterLongValue;
        Scanner sc= new Scanner(System.in);
        double floatValue=sc.nextDouble();
        int answer=(int)(floatValue/2);
        System.out.println(answer);
        //Conversion of Long to Byte with intermedtiatary int.
        System.out.println(byteCastedIntegerValue);
    }
}
