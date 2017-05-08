import java.util.Random;

import javax.swing.JOptionPane;

public class ari {
public static void main(String[] args) {
	Random randy = new Random();
	int x = randy.nextInt(100)+ 1;
	String ans = JOptionPane.showInputDialog("guess a number between 1-100");
	
	
int ansAsInt = Integer.parseInt(ans);
	
	
	
	
	
	for (int i = 0; i <100; i++) {
	
	
	{
		if (ansAsInt == x){
		JOptionPane.showMessageDialog (null, "congrats thats right");
		
		}
		
	if(ansAsInt > x){
		JOptionPane.showInputDialog(null, "guess lower");
		
	}
if(ansAsInt < x) {
	JOptionPane.showInputDialog(null, "guess higher");

}
	}
	}
}
}

	