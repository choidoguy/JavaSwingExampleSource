import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExTestLayout {
	// ������Ʈ ����
	JFrame jFrame = new JFrame("BorderLayout in BorderLayout");
	JButton btn1 = new JButton("1����ư");
	JButton btn2 = new JButton("2����ư");
	JButton btn3 = new JButton("3����ư");
	JButton btn4 = new JButton("4����ư");
	JButton btn5 = new JButton("5����ư");
	
	JButton btn01 = new JButton("01");
	JButton btn02 = new JButton("02");
	JButton btn03 = new JButton("03");
	JButton btn04 = new JButton("04");
	JButton btn05 = new JButton("05");

	public ExTestLayout() {
		// ������Ʈ�� ���� �����̳� ���ϱ�
		Container container = jFrame.getContentPane();

		// ������Ʈ�� �����̳ʿ� �߰�
		container.add(btn1, BorderLayout.NORTH);
		container.add(btn2, BorderLayout.EAST);
		
			JPanel panel = new JPanel();
			panel.add(btn01);  
			panel.add(btn02);   
			panel.add(btn05); 
			panel.add(btn03);   
			panel.add(btn04);  
			
				BorderLayout borderLayout = new BorderLayout();
				borderLayout.addLayoutComponent(btn01, BorderLayout.NORTH);
				borderLayout.addLayoutComponent(btn02, BorderLayout.EAST);
				borderLayout.addLayoutComponent(btn05, BorderLayout.CENTER);
				borderLayout.addLayoutComponent(btn03, BorderLayout.WEST);
				borderLayout.addLayoutComponent(btn04, BorderLayout.SOUTH);
			
			panel.setLayout(borderLayout);
		
		container.add(panel, BorderLayout.CENTER);
		
		container.add(btn3, BorderLayout.WEST);
		container.add(btn4, BorderLayout.SOUTH);

		// ������ ũ�� ����
		jFrame.setSize(600, 300);

		// ������ ���̱� ����
		jFrame.setVisible(true);

		// ���� ��ư ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// ����
		new ExTestLayout();
	}

}