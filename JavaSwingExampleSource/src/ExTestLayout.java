import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExTestLayout {
	// 컴포넌트 생성
	JFrame jFrame = new JFrame("BorderLayout in BorderLayout");
	JButton btn1 = new JButton("1번버튼");
	JButton btn2 = new JButton("2번버튼");
	JButton btn3 = new JButton("3번버튼");
	JButton btn4 = new JButton("4번버튼");
	JButton btn5 = new JButton("5번버튼");
	
	JButton btn01 = new JButton("01");
	JButton btn02 = new JButton("02");
	JButton btn03 = new JButton("03");
	JButton btn04 = new JButton("04");
	JButton btn05 = new JButton("05");

	public ExTestLayout() {
		// 컴포넌트를 넣을 컨테이너 구하기
		Container container = jFrame.getContentPane();

		// 컴포넌트를 컨테이너에 추가
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

		// 프레임 크기 지정
		jFrame.setSize(600, 300);

		// 프레임 보이기 설정
		jFrame.setVisible(true);

		// 종료 버튼 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// 실행
		new ExTestLayout();
	}

}