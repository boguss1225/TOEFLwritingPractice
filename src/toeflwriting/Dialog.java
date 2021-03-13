package toeflwriting;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class HelpDialog{
	public  HelpDialog(JFrame f){
		 	Dialog HelpDia = new Dialog(f,"help",true);
		 	
		 	HelpDia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					HelpDia.dispose();
				}
			});
		 	
		 	HelpDia.setSize(440, 200);
		 	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			int xpos = (int) (screen.getWidth() / 2 - HelpDia.getWidth() / 2);
			int ypos = (int) (screen.getHeight() / 2 - HelpDia.getHeight() / 2);
		 	HelpDia.setLocation(xpos, ypos);
		 	HelpDia.setLayout(new FlowLayout());
		 	
		 	JLabel Hl1 = new JLabel("<<help>>");
			JLabel Hl2 = new JLabel("This program was written on June 1, 18");
			JLabel Hl3 = new JLabel("Heemoon Yoon");
			JLabel Hl4 = new JLabel("If the screen does not appear, please adjust the frame once");
			
			JButton Hb1 = new JButton("Confirm");
			
			class Hb1EventHandler implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent ae){
					HelpDia.dispose();
				}}
			Hb1.addActionListener(new Hb1EventHandler());
			
			Panel HelpP = new Panel();
			HelpP.setLayout(new GridLayout(5,1));
			HelpP.add(Hl1);
			HelpP.add(Hl2);
			HelpP.add(Hl3);
			HelpP.add(Hl4);
			HelpP.add(Hb1);
			HelpDia.add(HelpP, BorderLayout.CENTER);
			HelpDia.setVisible(true);
		 
	 }
	
}

class AuthorDialog{
	public AuthorDialog(JFrame f){
		 	Dialog AuthorDia = new Dialog(f,"Maker information",true);
		 	
		 	AuthorDia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					AuthorDia.dispose();
				}
			});
		 	
		 	AuthorDia.setSize(440, 200);
		 	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			int xpos = (int) (screen.getWidth() / 2 - AuthorDia.getWidth() / 2);
			int ypos = (int) (screen.getHeight() / 2 - AuthorDia.getHeight() / 2);
		 	AuthorDia.setLocation(xpos,ypos);
		 	AuthorDia.setLayout(new FlowLayout());
		 	
		 	JLabel l1 = new JLabel("<<Author Information>>");
			JLabel l2 = new JLabel("Author : Soongsil University 20110452 Heemoon Yoon");
			JLabel l3 = new JLabel("jcjc7890@gmail.com");
			JLabel l4 = new JLabel("2018-6-01 making");
			JButton b1 = new JButton("Confirm");
			
			
			class b1EventHandler implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent ae){
					AuthorDia.dispose();
				}}
			b1.addActionListener(new b1EventHandler());
			
			Panel AuthorP = new Panel();
			AuthorP.setLayout(new GridLayout(5,1));
			AuthorP.add(l1);
			AuthorP.add(l2);
			AuthorP.add(l3);
			AuthorP.add(l4);
			AuthorP.add(b1);
			AuthorDia.add(AuthorP, BorderLayout.CENTER);
			AuthorDia.setVisible(true);
		 
	 }
	
}

class openDialog{
	public openDialog(JFrame f) throws IOException{
		 	FileDialog Dia = new FileDialog(f,"Open Image",FileDialog.LOAD);
		 	Dia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					Dia.dispose();
				}
			});
		 	Dia.setFile("*.*");
		 	Dia.setVisible(true);
		 	String DirName = Dia.getDirectory();
		 	String FileName = Dia.getFile();
		 	String strName = DirName + FileName;
		 	
		 
	}
}

class saveDialog{
	public saveDialog(JFrame f) throws IOException{
		 	FileDialog Dia = new FileDialog(f,"Save Image",FileDialog.SAVE);
		 	Dia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					Dia.dispose();
				}
			});
		 	Dia.setFile("*.jpg");
		 	Dia.setVisible(true);
		 	
		 	String DirName = Dia.getDirectory();
		 	String FileName = Dia.getFile();
		 	String strName = DirName + FileName;
		
	}
}
