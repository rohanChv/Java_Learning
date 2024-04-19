public class JavaDataTypes {
    public static void main(String[] args) {
        //Integer Data Types
        byte byteDataType=2; //Byte width is 8 bits.
        short shortDataType=2;//short width is 16 bits/2 bytes
        int integerDataType=32;//int represents integer Data type with width 32 bit/4 bytes
        long longDataType=2304_10293_248_3498L;// long represents integer data with 64 bit length. prefix L is added to specify that the number is of type long

        //Floating Point Data types.
        float floatDataType=23.343f;//Float has length of 32 bits.f prefix is added to specify it's a floating point data.Default is double
        double doubleDataType=2342903.93457349959;// double is 64 bit
        //other data types
        boolean booleanDataType=false;// Single bit
        char characterDataType=76;//char is 16 bit data type represents characters.

        System.out.println("Hello ! I have started Learning Java.(Again ...)");
        System.out.println("First we are learning about the Data Types");
        System.out.println("We need the primitive data types to Store the data as per the type of variable. This is needed as Java is strongly typed Language");
        System.out.println("there are 8 primitive types of data");
        System.out.println("\nInteger Type =>");
        System.out.println("byte :"+"Byte width is 8 bits.Example is "+byteDataType);
        System.out.println("short :"+"short width is 16 bits/2 bytes.Example is "+shortDataType);
        System.out.println("int :"+"int represents integer Data type with width 32 bit/4 bytes.Example "+integerDataType);
        System.out.println("long :"+" long represents integer data with 64 bit length. prefix L is added to specify that the number is of type long . Example "+longDataType);
        System.out.println("\nFloating Point Data types =>");
        System.out.println("float :"+"Float has length of 32 bits.f prefix is added to specify it's a floating point data.Default is double.Example :"+floatDataType);
        System.out.println("double :"+"double is 64 bit . provides more floating point numbers. Example :"+doubleDataType);
        System.out.println("\nother DataTypes =>");
        System.out.println("boolean :"+"single bit true/false.Example :"+booleanDataType);
        System.out.println("char :"+"character datatype 16 bit value .:Example :"+characterDataType);

    }
}
