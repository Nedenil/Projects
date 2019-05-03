import javax.swing.JFrame;


public class Main extends JFrame{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chaos Game");
		frame.setSize(1720,940);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Triangle());
		frame.setVisible(true);

	}

}
