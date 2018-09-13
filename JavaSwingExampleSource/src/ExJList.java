import java.awt.Label;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

class JFrameTest extends JFrame{
    String []str = {"HTML", "XML", "C", "C++", "자바", "오라클", "COM"};
    Vector vec;
    JList list;     //JList 객체 변수 선언
    
    public JFrameTest(){
        add(new Label("ListBox"),"North");
        vec = new Vector();
        list = new JList();     //JList 객체 생성
        for (int i = 0; i<str.length; i++)  //벡터에 요소 추가
            vec.addElement(str[i]);
        list.setListData(vec);      //JList 컴포넌트에 아이템을 추가
        //JScrollPane 클래스의 생성자에 JList의 객체 변수를 넣어 스크롤바가 나타나도록 한다.
        add(new JScrollPane(list), "Center");
        
        list.setSelectedIndex(0);       //리스트 컴포넌트의 첫번째 항목이 선택되도록 한다.
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);
        setVisible(true);
    }
}

public class ExJList {
    public static void main(String[] args) {
        JFrame jf = new JFrameTest();
        jf.setLocationRelativeTo(null);
    }
}
