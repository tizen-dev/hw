import javax.swing.*;

public class EncodeChar {
    /* Method increments unicode character unless it is 'z' or 'Z' or not a letter */
    public static char nextLetter(char c) {
        if (c == 'z' || c == 'Z' || !Character.isLetter(c)) { return 0; }
        return (char) (((int) c) + 1);
    }

    public static void main(String[] args) {
        /* Define nextLetter variable */
        char nextLetter;

        /* Try/Catch checks if user didn't input anything and will throw JOptionPane ERROR_MESSAGE on failure */
        try {
            nextLetter = nextLetter(JOptionPane.showInputDialog(null, "Type a letter", "Input", JOptionPane.QUESTION_MESSAGE).charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No characters typed", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        /* Check if next character is equal to U+0000, which nextLetter() returns if the character provided causes an error */
        if (nextLetter == 0) {
            JOptionPane.showMessageDialog(null, "Invalid Letter", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        /* Show output to user */
        JOptionPane.showMessageDialog(null, "Next letter in alphabet: " + nextLetter, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
