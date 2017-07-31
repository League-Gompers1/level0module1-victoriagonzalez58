package for_loops;

import java.net.URI;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class crazycatlady {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog(null, "How many cats do you have?");
		int ans2 = Integer.parseInt(ans);

		if (ans2 >= 3) {
			JOptionPane.showMessageDialog(null, "your a crazy cat lady!");
		} else if (ans2 <= 3 && ans2!=0) {
			playVideo("https://www.youtube.com/watch?v=5dsGWM5XGdg");
		} else if (ans2 == 0) {
			playVideo("https://www.youtube.com/watch?v=ZJT9CeEhM10");

		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
