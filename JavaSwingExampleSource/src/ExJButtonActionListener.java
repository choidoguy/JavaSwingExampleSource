import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ExJButtonActionListener extends JFrame {
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "버튼을 누르셨군요", "Message", JOptionPane.ERROR_MESSAGE);
		}
    }
	
	public ExJButtonActionListener() {
        JButton btn = new JButton("버튼");
        ActionListener listener = new MyActionListener();
        btn.addActionListener(listener);
        
        JPanel panel = new JPanel();
        panel.add(btn);
        
        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        
        setTitle("ExJButtonActionListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
    	setVisible(true);
	}
	
    public static void main(String[] args) {
    	new ExJButtonActionListener();
    }
}
