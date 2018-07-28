import javax.swing.JOptionPane;

public class Sum {

	public static void main(String[] args) {
		
		int in1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int in2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		JOptionPane.showMessageDialog(null,"The number is "+(in1+in2),"Sum",JOptionPane.PLAIN_MESSAGE);

	}

}
