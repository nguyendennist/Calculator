import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JPanel {
   
   private static final long serialVersionUID = 5968989796934511063L;
   private JPanel northPanel;
   private JPanel centerPanel;
   private JButton add;
   private JButton subtract;
   private JButton multiply;
   private JButton divide;
   private JButton percent;
   private JButton reset;
   private JLabel input1;
   private JLabel input2;
   private JLabel answer;
   private JTextField input1Text;
   private JTextField input2Text;
   private JTextField answerText;
   
   public Calculator() {
   
      setLayout(new BorderLayout());
      
      northPanel = new JPanel();
      centerPanel = new JPanel();
      add = new JButton("+");
      subtract= new JButton("-");
      multiply = new JButton("*");
      divide = new JButton("/");
      percent = new JButton("%");
      reset = new JButton("reset");
      input1 = new JLabel("Input #1");
      input2 = new JLabel("Input #2");
      answer = new JLabel("Answer");
      input1Text = new JTextField();
      input2Text = new JTextField();
      answerText = new JTextField();
      
      Color purple = new Color(128, 0, 128);
      
      northPanel.setBackground(Color.blue);
      centerPanel.setBackground(purple);
      
      northPanel.setPreferredSize(new Dimension(100, 200));
      
      input1Text.setPreferredSize(new Dimension(70, 25));
      input2Text.setPreferredSize(new Dimension(70, 25));
      answerText.setPreferredSize(new Dimension(70, 25));
            
      input1.setFont(new Font("Arial", Font.ITALIC, 24));
      input2.setFont(new Font("Arial", Font.ITALIC, 24));
      answer.setFont(new Font("Arial", Font.ITALIC, 24));
      
      input1.setHorizontalAlignment(SwingConstants.LEFT);
      input2.setHorizontalAlignment(SwingConstants.CENTER);
  
  	  add.addActionListener(new AddListener());
	  subtract.addActionListener(new SubtractListener());
	  multiply.addActionListener(new MultiplyListener());
	  divide.addActionListener(new DivideListener());
	  percent.addActionListener(new PercentListener());
	  reset.addActionListener(new ResetListener());
				
      northPanel.add(input1);
      northPanel.add(input1Text);
      northPanel.add(input2);
      northPanel.add(input2Text);
      northPanel.add(answer);
      northPanel.add(answerText);
      centerPanel.add(add);
      centerPanel.add(subtract);
      centerPanel.add(multiply);
      centerPanel.add(divide);
      centerPanel.add(percent);
      centerPanel.add(reset);
      add(northPanel, BorderLayout.NORTH);
      add(centerPanel, BorderLayout.CENTER);
      
   }
   
   /* Event listeners will be attached to buttons on instantiation */
	
	private class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double firstNum = Double.parseDouble(input1Text.getText());
			double secondNum = Double.parseDouble(input2Text.getText());
			String answer = String.format("%5.3f", (firstNum + secondNum));
			answerText.setText(answer);
		}
	}
	
	private class SubtractListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double firstNum = Double.parseDouble(input1Text.getText());
			double secondNum = Double.parseDouble(input2Text.getText());
			String answer = String.format("%5.3f", (firstNum - secondNum));
			answerText.setText(answer);
		}
	}
	
	private class MultiplyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double firstNum = Double.parseDouble(input1Text.getText());
			double secondNum = Double.parseDouble(input2Text.getText());
			String answer = String.format("%5.3f", (firstNum * secondNum));
			answerText.setText(answer);
		}
	}
	
	private class DivideListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double firstNum = Double.parseDouble(input1Text.getText());
			double secondNum = Double.parseDouble(input2Text.getText());
			String answer = String.format("%5.3f", (firstNum / secondNum));
			answerText.setText(answer);
		}
	}
	
	private class PercentListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double firstNum = Double.parseDouble(input1Text.getText());
			String answer = String.format("%5.5f", (firstNum / 100));
			answerText.setText(answer);
		}
	}
	
	private class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input1Text.setText("");
			input2Text.setText("");
			answerText.setText("");
		}
	}
	
}