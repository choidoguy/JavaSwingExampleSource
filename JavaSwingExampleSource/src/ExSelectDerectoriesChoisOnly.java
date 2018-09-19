import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ExSelectDerectoriesChoisOnly extends JFrame {

	public ExSelectDerectoriesChoisOnly() {
		Container container = getContentPane();

		JLabel label = new JLabel("출력경로 : ");
		container.add(label);
		JTextField oututPathTF = new JTextField();
		oututPathTF.setEnabled(false);
		container.add(oututPathTF);
		JButton btn = new JButton("선택");
		btn.addActionListener(e -> {
			JFileChooser jfc = new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			jfc.showDialog(this, null);
			File dir = jfc.getSelectedFile();
			oututPathTF.setText(dir==null?"":dir.getPath());
		});
		container.add(btn);
		
		BorderLayout outPathLayout = new BorderLayout();
		outPathLayout.addLayoutComponent(label, BorderLayout.WEST);
		outPathLayout.addLayoutComponent(oututPathTF, BorderLayout.CENTER);
		outPathLayout.addLayoutComponent(btn, BorderLayout.EAST);
		container.setLayout(outPathLayout);
		
		setSize(300, 60);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ExSelectDerectoriesChoisOnly();
	}
	
}
