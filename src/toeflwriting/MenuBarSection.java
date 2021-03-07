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
		JMenu file = new JMenu("파일");
		JMenu edit = new JMenu("편집");
		JMenu help = new JMenu("도움말");
		//<<<<<<<<<<<<File Menu>>>>>>>>>>>>
		JMenuItem open = new JMenuItem("열기");
		JMenuItem save = new JMenuItem("저장");
		JMenuItem exit = new JMenuItem("프로그램 종료");
		
		JMenuItem helpwords = new JMenuItem("도움글");
		JMenuItem author = new JMenuItem("제작자정보");
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
		//종료 메뉴아이템
		class exitEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}}	
		exit.addActionListener(new exitEventHandler());		
		//도움말 메뉴아이템
		class helpEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new HelpDialog(f);
			}}
		helpwords.addActionListener(new helpEventHandler());
		//저작자 메뉴아이템
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
