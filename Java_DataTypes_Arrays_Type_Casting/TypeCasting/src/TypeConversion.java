public class TypeConversion {
    public static void main(String[] args) {
        int integerValue=128;
        char characterValue=(char)integerValue;
        short shortValue=(short)characterValue;
        byte byteValue=(byte)shortValue;
        System.out.println("integer "+integerValue+" is converted to char as "+characterValue+"  then its converted to short as "+shortValue +" then into bytes as "+byteValue);
    }
}
