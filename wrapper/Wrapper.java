public class Wrapper{
    public static void main(String[] args) {
        // Integer wrapper class example
        int intValue = 42;
        Integer integerValue = Integer.valueOf(intValue); // Wrapping int to Integer
        System.out.println("Integer Value: " + integerValue);

        // Double wrapper class example
        double doubleValue = 3.14;
        Double doubleWrapper = Double.valueOf(doubleValue); // Wrapping double to Double
        System.out.println("Double Value: " + doubleWrapper);

        // Character wrapper class example
        char charValue = 'A';
        Character charWrapper = Character.valueOf(charValue); // Wrapping char to Character
        System.out.println("Character Value: " + charWrapper);

        // Boolean wrapper class example
        boolean booleanValue = true;
        Boolean booleanWrapper = Boolean.valueOf(booleanValue); // Wrapping boolean to Boolean
        System.out.println("Boolean Value: " + booleanWrapper);

        // Unwrapping examples
        int unwrappedInt = integerValue.intValue(); // Unwrapping Integer to int
        double unwrappedDouble = doubleWrapper.doubleValue(); // Unwrapping Double to double
        char unwrappedChar = charWrapper.charValue(); // Unwrapping Character to char
        boolean unwrappedBoolean = booleanWrapper.booleanValue(); // Unwrapping Boolean to boolean

        System.out.println("Unwrapped Int Value: " + unwrappedInt);
        System.out.println("Unwrapped Double Value: " + unwrappedDouble);
        System.out.println("Unwrapped Char Value: " + unwrappedChar);
        System.out.println("Unwrapped Boolean Value: " + unwrappedBoolean);
    }
}
