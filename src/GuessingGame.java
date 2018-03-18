import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		int guess = Integer.parseInt(guessText);
		if (guess < theNumber)
			message = guess + " is too low. Try again.";
		else if (guess > theNumber)
			message = guess + " is too high. Try again.";
		else {
			message = guess + " is correct. You win!";
			newGame();
		}
		lblOutput.setText(message);
		txtGuess.requestFocus();
		txtGuess.selectAll();
	}
	
	public void newGame() {
		theNumber = (int) (Math.random() * 100 + 1);
	}
	
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
		
		txtGuess = new JTextField();
		txtGuess.setBounds(290, 55, 59, 19);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(166, 102, 117, 25);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setBounds(75, 171, 300, 15);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
	}
}
