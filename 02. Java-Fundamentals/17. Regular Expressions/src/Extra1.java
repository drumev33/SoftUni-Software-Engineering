public class Extra1 {
    public static void main(String[] args) {
        String text = "Hello regular expressions, " +
                "this is l3cture number 7 in the java " +
                "fundamentals cour at SoftUni in 2020";

        StringBuilder currentNumberString = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            //find Uppercase
            if (Character.isUpperCase(currentChar)) {
                currentNumberString.append(currentChar);
            } else if (Character.isAlphabetic(currentChar)
                    && currentNumberString.length() > 0) {
                currentNumberString.append(currentChar);
            } else if (currentNumberString.length() > 0) {
                System.out.println(currentNumberString);
                currentNumberString = new StringBuilder();
            }

            // Find numbers
            /*if (Character.isDigit(currentChar)) {
                currentNumberString.append(currentChar);
            } else if (currentNumberString.length() != 0) {
                System.out.println(currentNumberString);
                currentNumberString = new StringBuilder();
            }*/
        }

        if (currentNumberString.length() != 0) {
            System.out.println(currentNumberString);
        }
    }
}
