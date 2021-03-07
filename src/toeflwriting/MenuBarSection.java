package toeflwriting;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MenuBarSection{
	MenuBarSection() {}
	
	public void MakeMenuBar(JFrame f){
		//////////////////////////////////Menu_bar///////////////////////////////////////
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("����");
		JMenu edit = new JMenu("����");
		JMenu help = new JMenu("����");
		//<<<<<<<<<<<<File Menu>>>>>>>>>>>>
		JMenuItem open = new JMenuItem("����");
		JMenuItem save = new JMenuItem("����");
		JMenuItem exit = new JMenuItem("���α׷� ����");
		
		JMenuItem helpwords = new JMenuItem("�����");
		JMenuItem author = new JMenuItem("����������");
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		help.add(helpwords);
		help.add(author);
		//<<<<<<<<<<<<Menu_SetUp>>>>>>>>>>>>
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		
		//<<<<<<<<<<<<MenuItem_Action>>>>>>>>>>>>
		//open
		class openEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new openDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		open.addActionListener(new openEventHandler());
		//save
		class saveEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new saveDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		save.addActionListener(new saveEventHandler());
		//���� �޴�������
		class exitEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}}	
		exit.addActionListener(new exitEventHandler());		
		//���� �޴�������
		class helpEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new HelpDialog(f);
			}}
		helpwords.addActionListener(new helpEventHandler());
		//������ �޴�������
		class authorEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new AuthorDialog(f);
			}}	
		author.addActionListener(new authorEventHandler());
		
		//menubar.setOpaque(true);
		f.setJMenuBar(menubar);
		f.setVisible(true);
	}	
}
