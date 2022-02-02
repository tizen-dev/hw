import javax.swing.*;

public class ConvertChars {
    public static void main(String[] args) {
        while (true) {
            /* Define inputChar variable */
            char inputChar;

            /* Try/Catch if user's input is empty */
            try {
                inputChar = JOptionPane.showInputDialog(null, "Input a character").charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Error: Please input a character");
                continue;
            }

            /* Flags for character */
            boolean isLetter = Character.isLetter(inputChar);
            boolean isDigit = Character.isDigit(inputChar);
            boolean isWhitespace = Character.isWhitespace(inputChar);

            /* Exit program if character doesn't meet requirements */
            if (!(isLetter || isDigit || isWhitespace)) { break; }

            /* Create StringBuilder for output to be conditionally appended to */
            StringBuilder output = new StringBuilder();

            /* Check what type the character is */
            if (isLetter) {
                output.append("Output is a letter: ");
                output.append(Character.toUpperCase(inputChar));
                output.append('\n');
            }

            if (isDigit) {
                output.append("Output is a digit: √x = ");
                output.append(Math.sqrt(Double.parseDouble(String.valueOf(inputChar))));
                output.append('\n');
            }

            if (isWhitespace) {
                output.append("Output is white space: ");
                output.append(String.format("U+%04d", (int) inputChar));
                output.append('\n');
            }

            /* Display output */
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
