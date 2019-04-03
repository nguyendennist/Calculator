import javax.swing.*;

public class CalculatorDriver {

   public static void main(String[] args) {
      
	   /* Constructing canvas */
      JFrame frame = new JFrame("My Calculator");
      
      /* Canvas Configuration */
      frame.setSize(540, 360);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setContentPane(new Calculator());
      frame.setVisible(true);
      
   }

}