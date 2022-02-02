import javax.swing.*;

public class CountLetterDigits {
    public static void main(String[] args) {
        /* Define inputString variable */
        String inputString = new String();

        /* Search for the character 'x' in inputString */
	    while (true) {
            if (inputString.toLowerCase().indexOf('x') != -1) { break; }
            inputString = JOptionPane.showInputDialog("Type something that contains \'x\'").toUpperCase();
        }

        /* Variables for counts */
        int charCount = inputString.length();
        int letterCount = 0;
        int digitCount = 0;

        /* Loop through characters and increment counts based on type of character */
        for (int i = 0; i < charCount; i++) {
            char c = inputString.charAt(i);
            if (Character.toLowerCase(c) != 'x') {
                if (Character.isLetter(c)) {
                    letterCount++;
                }

                if (Character.isDigit(c)) {
                    digitCount++;
                }
            }
        }

        /* Subtract from total to get count of other characters */
        int otherCount = charCount - digitCount - letterCount;

        /* Display counts to user */
        JOptionPane.showMessageDialog(null, "Message \'" + inputString + "\' contains\nLetters: " +  letterCount + "\nDigits: " + digitCount + "\nOther Characters: " + otherCount);
    }
}
