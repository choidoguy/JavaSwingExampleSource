import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ExBorder extends JFrame {

	public ExBorder() {
		Container container = getContentPane();

		container.add(new JPanel(), BorderLayout.NORTH);
		container.add(new JPanel(), BorderLayout.EAST);
		container.add(new JPanel(), BorderLayout.WEST);
		container.add(new JPanel(), BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(Color.black),"panel"));
		container.add(panel, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ExBorder();
	}

}