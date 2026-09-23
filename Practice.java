import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame{
}

class Practice{
	public static void main(String[] args) {
		
		Calculator c1=new Calculator();

		c1.setSize(300,300);
		c1.setTitle("Calculator");
		c1.setLocationRelativeTo(null);
		c1.setDefaultCloseOperation(Calculator.DISPOSE_ON_CLOSE);
		c1.setLayout(new BorderLayout());
		
		
		JTextField txtb=new JTextField();
		txtb.setFont(new Font("",Font.BOLD,25));
		
		JButton[] buttonArray=new JButton[16];
		String[] buttonName={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		
		JPanel centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(4,2,2,2));
		
		for (int i = 0; i < 16; i++){
			buttonArray[i]=new JButton(buttonName[i]);
			buttonArray[i].setFont(new Font("",Font.BOLD,25));
			centerPanel.add(buttonArray[i]);
		}
		
		c1.add("North",txtb);
		c1.add("Center",centerPanel);
		c1.setVisible(true);
		
		
		
	}

}
