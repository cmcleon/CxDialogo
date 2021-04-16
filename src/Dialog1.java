import javax.swing.JOptionPane;

public class Dialog1 {
	public static void main (String[] args) {
		String name = 
				JOptionPane.showInputDialog("What is your name?");
		
		String message = 
				String.format(name + " , Welcome to Java!");
		
		JOptionPane.showMessageDialog(null, message);
	}

}
