package toeflwriting;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class TxtFrame extends JTextArea{
	public TxtFrame(){
		//setSize(100, 500);
	    setLineWrap(true);
	    JScrollPane tableScrollPane = new JScrollPane();
	    add(tableScrollPane);
	    setVisible(true);
	}
}
class JpgFrame extends JFrame{
	static JLabel words;
    public JpgFrame(String string) {
    	//JFrame f = new JFrame(string);
    	this.setTitle(string);
    	addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
    	setSize(800, 550);
    	MenuBarSection m = new MenuBarSection();
		m.MakeMenuBar(this);    	
		
		
		TxtFrame txts = new TxtFrame();
    	//키보드 리스너
    	class kl implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int i = 0;
			String str = txts.getText();
			String str1[] = str.split(" ");//핵심 설정
			String str2[] = str.split("\\n");//핵심 설정
			int count = 0;
			for(i = 0; i<str1.length;i++){
				count++;
				System.out.println(i);
			}
			for(i=0; i<str2.length;i++){
				count++;
				System.out.println(i);
			}
			count--;
			str = String.valueOf(count);
			words.setText(str);
			words.repaint();
			//toeflwriting.jpgFrame.repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}}	
    	txts.addKeyListener(new kl());		
    	
		words = new JLabel("000");
		words.setHorizontalAlignment(JLabel.RIGHT);
		JLabel right = new JLabel(" ");
		JLabel left = new JLabel(" ");
		JLabel down = new JLabel(" ");
		this.add(words,BorderLayout.NORTH);
		this.add(txts,BorderLayout.CENTER);
		this.add(right,BorderLayout.WEST);
		this.add(left,BorderLayout.EAST);
		this.add(down,BorderLayout.SOUTH);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2 - getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - getHeight() / 2);
		setLocation(xpos, ypos-30);
		setVisible(true);				
	}
}
public class toeflwriting {
    static JpgFrame jpgFrame;
    static JPanel staticp2;

    public static void main(String[] args) {
    	
    	toeflwriting toeflwriting = new toeflwriting();
    	toeflwriting.jpgFrame = new JpgFrame("TOEFL Writing");
    	
    	toeflwriting.jpgFrame.repaint();
    	

	}

}
