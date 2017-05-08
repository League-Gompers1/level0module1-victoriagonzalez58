package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String Blue = " superpower is superior Intellegence";
String Matt = " superpower is flying";
String Red = " superpower is invisability";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String ans = JOptionPane.showInputDialog(null,"Enter one of these names: name \n Matt \n Avery \n Ted");

        // 3. Show the superpower in a pop-up, depending on the name entered. 
if(ans.equals("Matt")){
JOptionPane.showMessageDialog(null,ans + Matt );

}
if(ans.equals("Ted")){
JOptionPane.showMessageDialog(null,  ans + Blue);


}

if(ans.equals("Avery")){
JOptionPane.showMessageDialog(null, ans + Red);
}
}
}






