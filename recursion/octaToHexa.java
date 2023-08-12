package recursion;
public class octaToHexa {
    public static String octalToHexadecimal(int octalNumber) {
        // Base case: octal number is 0
        if (octalNumber == 0) {
            return "";
        }

        // Extract the last digit
        int digit = octalNumber % 10;

        // Remove the last digit
        octalNumber = octalNumber / 10;

        // Convert octal digit to hexadecimal
        String hexadecimalDigit;
        if (digit >= 0 && digit <= 9) {
            hexadecimalDigit = String.valueOf(digit);
        } else {
            switch (digit) {
                case 10:
                    hexadecimalDigit = "A";
                    break;
                case 11:
                    hexadecimalDigit = "B";
                    break;
                case 12:
                    hexadecimalDigit = "C";
                    break;
                case 13:
                    hexadecimalDigit = "D";
                    break;
                case 14:
                    hexadecimalDigit = "E";
                    break;
                case 15:
                    hexadecimalDigit = "F";
                    break;
                default:
                    hexadecimalDigit = "";
                    break;
            }
        }

        // Recursively call octalToHexadecimal with the updated octal number
        return octalToHexadecimal(octalNumber) + hexadecimalDigit;
    }

    public static void main(String[] args) {
        int octalNumber = 175;
        String hexadecimalNumber = octalToHexadecimal(octalNumber);
        System.out.println("Hexadecimal number: " + hexadecimalNumber);
}
}
