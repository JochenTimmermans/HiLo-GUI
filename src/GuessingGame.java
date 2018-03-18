import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame {
	private JTextField textField;
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("HiLo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblHiloGuessingGame = new JLabel("HiLo Guessing Game");
		lblHiloGuessingGame.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblHiloGuessingGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblHiloGuessingGame.setBounds(0, 12, 450, 15);
		getContentPane().add(lblHiloGuessingGame);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGuessANumber.setBounds(12, 57, 271, 15);
		getContentPane().add(lblGuessANumber);
		
		textField = new JTextField();
		textField.setBounds(290, 55, 59, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.setBounds(166, 102, 117, 25);
		getContentPane().add(btnGuess);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
