public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        short shortValue = 128;
        System.out.println((byte) shortValue);

        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        byte byteValue = 127;
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        byteValue += 1;
        System.out.println(byteValue);

        //Add 1 to this variable again and print it again
        byteValue += 1;
        System.out.println(byteValue);
    }    
}