import java.io.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.event.*;
import javax.swing.event.*;
public class HPage {
	ArrayList alist ;
	HPage()
	{
		alist = new ArrayList();
		loadEvents() ;
	}
	
	/*For Designs*/
	JFrame frame1 ;
	Container c1 ;
	JLabel New1 ;
	Font font = new Font("Copperplate Gothic Bold" , Font.BOLD , 15);
	/*for search Panel*/
	JButton bSEARCH , back ;
	JTextField stf ;
	JPanel sp ;
	JLabel l1  , l2 , l3 , l4 , l5 , l6 , l7 ,l8 ;
	
	/*for add Panel*/
	JButton bADD ;
	JTextField tf1 , tf2 , tf3 , tf4 ;
	
	/*for delete panel*/
	JButton bDELETE ;
	JTextField dtf ;
	
	/*Show All*/
	JButton bNext , bPre , bSHOW ;

	
	
	/*For Main Page*/
	JFrame frame ;
	Container c ;
	JLabel New ; // for Background image.
	
	/*Popups' Components*/
	JButton b , b_add , b_search , b_delete , b_show ;
	JPanel p_add ;
	JPanel p_search ;
	JLayeredPane lp ;
	
	
/*===========================MAIN PAGE============================================================*/
	
	public void Draw()
	{
		frame =new JFrame();
		c1 = new Container();
		c1 = frame.getContentPane();
		frame.setLayout(null);
		c1.setBackground(new Color(176,169,49));
		
		try {
			ImageIcon background = new ImageIcon("F:\\JavaEclipse\\GUI\\src\\EMS_Project_Design\\3.jpg");
			Image img = background.getImage();
			Image temp = img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
			background = new ImageIcon(temp); // Again stored image into background.
			New1 = new JLabel(background); // Adding image to a label.
			New1.setBounds(0,0,900,600);
			New1.setLayout(null);			
		}
		catch(Exception i)
		{
			JOptionPane.showMessageDialog(null , i.getMessage());
		}
		/*Main/Base Layered Panel*/
		lp = new JLayeredPane();
		lp.setSize(600,600);
		lp.setBounds(0, 0, 900, 600);
		lp.setLayout(null);
		
		/*Header Paenl*/
		JPanel header = new JPanel();
		header.setBackground(new Color(0,0,0,100));
		header.setBounds(0, 0, 900, 50);
		header.setLayout(new FlowLayout());
		JLabel title = new JLabel("Event Management System");
		Font font = new Font("elephant" , Font.BOLD , 30);
		title.setFont(font);
		title.setForeground(Color.white);
		header.add(title);
		
		
		/*Menue Panel*/
		JPanel menue = new JPanel();
		menue.setBackground(new Color(0,0,0,100));
		menue.setBounds(50, 80, 200, 450);
		menue.setLayout(null);
		
		
		/*Buttons*/
		Font bFont = new Font("Comic Sans MS" , Font.BOLD , 15);		
		b_add = new JButton(" ADD ");
		b_add.setBounds(20, 60 , 150, 40);
		b_add.setFont(bFont);
		//b_add.setBorder(new BevelBorder(BevelBorder.RAISED , Color.blue, Color.black));    
		
		b_search = new JButton("SEARCH");
		b_search.setBounds(20, 160 , 150, 40);
		b_search.setFont(bFont);
		
		b_delete = new JButton("DELETE");
		b_delete.setBounds(20, 260 , 150, 40);
		b_delete.setFont(bFont);
		
		b_show = new JButton("SHOW ALL");
		b_show.setBounds(20, 360 , 150, 40);
		b_show.setFont(bFont);
		
		menue.add(b_add);
		menue.add(b_search);
		menue.add(b_delete);
		menue.add(b_show);
	
		
		/* Buttons Registerations */
		ActionHandler ah = new ActionHandler();
		b_add.addActionListener(ah);
		b_search.addActionListener(ah);
		b_delete.addActionListener(ah);
		b_show.addActionListener(ah);
		
		/*Adding to container and Layered Panel*/
		lp.add(menue , BorderLayout.WEST);
		c1.add(lp);
		lp.add(header);
		lp.add(New1); // adding label of background image to the main Panel;
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(900,600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setBounds(300, 100, 900, 600);
		
	}
	
	
/*===========================ADDING DESIGN=========================================================*/
	
	/*For Designing*/
	
		public void ADD()
	{
		frame1 = new JFrame("Adding...") ;
		Container c = frame1.getContentPane();
		frame1.setBounds(500, 100, 600, 600);
		c.setLayout(null);
		
		/*Background*/
		c.setBackground(new Color(255,80,200));
		try {
			ImageIcon background = new ImageIcon("F:\\JavaEclipse\\GUI\\src\\EMS_Project_Design\\8.jpg");
			Image img = background.getImage();
			Image temp = img.getScaledInstance(600,500,Image.SCALE_SMOOTH);
			background = new ImageIcon(temp); // Again stored image into background.
			New1 = new JLabel(background); // Adding image to a label.
			New1.setBounds(0,0,600,500);
			New1.setLayout(null);			
		}
		catch(Exception i)
		{
			JOptionPane.showMessageDialog(null , i.getMessage());
		}
		
		/*Components*/
		bADD = new JButton("ADD");
		bADD.setBounds(300, 400, 100, 30);
		
		back = new JButton("BACK");
		back.setBounds(170, 400, 100, 30);
		
		
		/*Panel*/
		sp = new JPanel();
		sp.setBounds(100, 50, 400, 300);
		sp.setLayout(null);
		sp.setSize(400,300);
		sp.setBackground(new Color(0,0,0,80));
		 
		l1 = new JLabel("NAME : ");
		l1.setBounds(80, 70, 80, 20);
		l1.setForeground(Color.white);
		l1.setFont(font);
		tf1 = new JTextField(20);
		tf1.setBounds(190, 70, 100, 20);
		
		l2 = new JLabel("VENUE : ");
		l2.setBounds(80, 120, 80, 20);
		l2.setForeground(Color.white);
		l2.setFont(font);
		tf2 = new JTextField(20);
		tf2.setBounds(190, 120, 100, 20);
		
		l3 = new JLabel("DATE : ");
		l3.setBounds(80, 170, 100, 20);
		l3.setForeground(Color.white);
		l3.setFont(font);		
		tf3 = new JTextField(20);
		tf3.setBounds(190, 170, 100, 20);
		
		l4 = new JLabel("Time :");
		l4.setBounds(80, 220, 100, 20);
		l4.setForeground(Color.white);
		l4.setFont(font);		
		tf4 = new JTextField(20);
		tf4.setBounds(190, 220, 100, 20);
		
		/*Registeration*/
		ActionHandler ah = new ActionHandler();
		bADD.addActionListener(ah);
		back.addActionListener(ah);
		
		/*Addditions*/
		c.add(sp);
		sp.add(l3);
		sp.add(tf3);
		sp.add(l2);
		sp.add(tf2);
		sp.add(tf1);
		sp.add(l1);
		sp.add(l4);
		sp.add(tf4);
		c.add(bADD);
		c.add(back);
		c.add(New1);
		frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
		frame1.setSize(600,500);
		frame1.setVisible(true);
		frame1.setResizable(false);
		
	}
	
/*=====================SEARCHING DESIGN===========================================================*/		
		
	
		/*Search Design*/
		public void search()
		{
			frame1 = new JFrame("Searching...") ;
			c = frame1.getContentPane();
			frame1.setBounds(500, 100, 600, 600);
			c.setLayout(null);
			
			/*Background*/
			c.setBackground(new Color(255,80,200));
			try {
				ImageIcon background = new ImageIcon("F:\\JavaEclipse\\GUI\\src\\EMS_Project_Design\\1.jpg");
				Image img = background.getImage();
				Image temp = img.getScaledInstance(600,500,Image.SCALE_SMOOTH);
				background = new ImageIcon(temp); // Again stored image into background.
				New = new JLabel(background); // Adding image to a label.
				New.setBounds(0,0,600,500);
				New.setLayout(null);			
			}
			catch(Exception i)
			{
				JOptionPane.showMessageDialog(null , i.getMessage());
			}
			
			
			/*Components*/
			bSEARCH = new JButton("SEARCH");
			bSEARCH.setBounds(290, 400, 100, 30);
			back = new JButton("BACK");
			back.setBounds(170, 400, 100, 30);
			
			JLabel sl = new JLabel("Enter Name : ");
			sl.setBounds(150, 10, 130, 30);
			sl.setFont(font);
			sl.setForeground(Color.white);
			
			stf = new JTextField(50);
			stf.setBounds(280, 10, 150, 30);
			
			
			/*Panel*/
			sp = new JPanel();
			sp.setLayout(null);
			sp.setSize(400,300);
			sp.setBackground(new Color(0,0,0,80));
			 
			l1 = new JLabel("NAME : ");
			l1.setBounds(80, 70, 100, 20);
			l1.setFont(font);
			l1.setForeground(Color.white);
			l2 = new JLabel("??????");
			l2.setBounds(190, 70, 150, 20);
			l2.setFont(font);
			l2.setForeground(Color.white);
					
			l3 = new JLabel("VENUE : ");
			l3.setBounds(80, 120, 100, 20);
			l3.setFont(font);
			l3.setForeground(Color.white);
			l4 = new JLabel("??????");
			l4.setBounds(190, 120, 150, 20);
			l4.setFont(font);
			l4.setForeground(Color.white);
			
			l5 = new JLabel("DATE : ");
			l5.setBounds(80, 170, 100, 20);
			l5.setFont(font);
			l5.setForeground(Color.white);
			l6 = new JLabel("??????");
			l6.setBounds(190, 170, 150, 20);
			l6.setFont(font);
			l6.setForeground(Color.white);
			
			l7 = new JLabel("TIME : ");
			l7.setBounds(80, 220, 100, 20);
			l7.setFont(font);
			l7.setForeground(Color.white);
			l8 = new JLabel("??????");
			l8.setBounds(190, 220, 150, 20);
			l8.setFont(font);
			l8.setForeground(Color.white);
			
			/*Registeration*/
			ActionHandler ah = new ActionHandler();
			back.addActionListener(ah);
			bSEARCH.addActionListener(ah);
			
			/*Additions*/
			sp.add(l3);
			sp.add(l4);
			sp.add(l5);
			sp.add(l6);
			sp.add(l1);
			sp.add(l2);
			sp.add(l7);
			sp.add(l8);
			c.add(stf);
			c.add(sl);
			c.add(bSEARCH);
			c.add(back);
			c.add(New);
			frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
			frame1.setSize(600,500);
			frame1.setVisible(true);
			frame1.setResizable(false);
			
		}
	
		
/*============================DELETE DESIGN======================================================*/		
		/*Delete Designing*/
		
		public void delete()
		{
			frame1 = new JFrame("Deleting...") ;
			c = frame1.getContentPane();
			frame1.setBounds(500, 100, 600, 600);
			c.setLayout(null);
			
			/*Background*/
			c.setBackground(new Color(255,80,200));
			try {
				ImageIcon background = new ImageIcon("F:\\JavaEclipse\\GUI\\src\\EMS_Project_Design\\2.jpg");
				Image img = background.getImage();
				Image temp = img.getScaledInstance(600,500,Image.SCALE_SMOOTH);
				background = new ImageIcon(temp); // Again stored image into background.
				New = new JLabel(background); // Adding image to a label.
				New.setBounds(0,0,600,500);
				New.setLayout(null);			
			}
			catch(Exception i)
			{
				JOptionPane.showMessageDialog(null , i.getMessage());
			}
			
			
			/*Components*/
			bDELETE = new JButton("DELETE");
			bDELETE.setBounds(290, 400, 100, 30);
			back = new JButton("BACK");
			back.setBounds(170, 400, 100, 30);
			
			JLabel sl = new JLabel("Enter Name : ");
			sl.setBounds(150, 10, 130, 30);
			sl.setFont(font);
			sl.setForeground(Color.black);
			
			dtf = new JTextField(50);
			dtf.setBounds(280, 10, 150, 30);
			
			
			/*Panel*/
			sp = new JPanel();
			sp.setLayout(null);
			sp.setSize(300,300);
			sp.setBackground(new Color(0,0,0,80));
			 
			l1 = new JLabel("DELETED !");
			l1.setBounds(50, 100, 200, 100);
			Font font1 = new Font("Cooper Black" , Font.BOLD , 30);
			l1.setFont(font1);
			l1.setForeground(Color.red);
			
			
			/*Registeration*/
			ActionHandler ah = new ActionHandler ();
			back.addActionListener(ah);
			bDELETE.addActionListener(ah);
			
			/*Additions*/
			sp.add(l1);
			c.add(dtf);
			c.add(sl);
			c.add(bDELETE);
			c.add(back);
			c.add(New);
			frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
			frame1.setSize(600,500);
			frame1.setVisible(true);
			frame1.setResizable(false);
			
		}
		
/*======================SHOW ALL DESIGN==========================================================*/
		/* Show All's Designing*/
		public void show()
		{
			frame1 = new JFrame("Showing All...") ;
			c = frame1.getContentPane();
			frame1.setBounds(500, 100, 600, 600);
			c.setLayout(null);
			
			/*Background*/
			c.setBackground(new Color(255,80,200));
			try {
				ImageIcon background = new ImageIcon("F:\\JavaEclipse\\GUI\\src\\EMS_Project_Design\\4.jfif");
				Image img = background.getImage();
				Image temp = img.getScaledInstance(600,500,Image.SCALE_SMOOTH);
				background = new ImageIcon(temp); // Again stored image into background.
				New = new JLabel(background); // Adding image to a label.
				New.setBounds(0,0,600,500);
				New.setLayout(null);			
			}
			catch(Exception i)
			{
				JOptionPane.showMessageDialog(null , i.getMessage());
			}
			
			
			/*Components*/
			back = new JButton("BACK");
			back.setBounds(250, 420, 100, 30);
			
			/*Panel*/
			/*sp = new JPanel();
			sp.setLayout(new FlowLayout());
			sp.setSize(300,300);
			sp.setBackground(new Color(0,0,0,80));
			sp.setBounds(50, 30, 500, 380);
			c.add(sp);*/
			 
			
			String MainLabel [] = { " NAME " , " VENUE " , " DATE " , " TIME "};
			String Data [][] = new String[alist.size()][4];
			
			for(int i=0 ; i<alist.size() ; i++)
			{
				EventInfo ei = (EventInfo)alist.get(i);
				for(int j=0 ; j<4 ; j++)
				{
					if(j==0)
					{
						Data[i][j] = ei.getName(); 
					}
					if(j==1)
					{
						Data[i][j] = ei.getVanue(); 
					}
					if(j==2)
					{
						Data[i][j] = ei.getDate(); 
					}
					if(j==3)
					{
						Data[i][j] = ei.getTime();
					}
				}
			}
			JTable jt = new JTable(Data , MainLabel);
			jt.setRowHeight(30);			
			jt.setBackground(new Color(204,255,255));
			jt.setBorder(new BevelBorder(BevelBorder.LOWERED , Color.blue, Color.black , Color.BLUE ,Color.black ));			
			JScrollPane pane = new JScrollPane(jt);
			pane.setSize(200,200);
			pane.setBackground(new Color(255,0,0));
			pane.setBounds(50,30,500,380);
			
			frame1.add(pane);
			
			/*Registeration*/
			ActionHandler ah = new ActionHandler();
			back.addActionListener(ah);
			
			/*Additions*/
			c.add(back);
			c.add(New);		
			frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
			frame1.setSize(600,500);
			frame1.setVisible(true);
			frame1.setResizable(false);
			
		}

/*=====================SAVING EVENTS==============================================================*/		
		
		/* Saving Events */
		public void SaveEvents() 
		{
			try
			{
				FileWriter fw = new FileWriter("F:\\JavaEclipse\\GUI\\src\\EMS_Project_Design\\SAVED.txt");
				PrintWriter pw = new PrintWriter(fw);
				
				for(int i=0 ; i<alist.size() ;  i++)
				{
					EventInfo ei = (EventInfo) alist.get(i);
					String line = ei.getName()+"  "+ei.getVanue()+"  "+ei.getDate()+"  "+ei.getTime();				
					pw.println(line);
				}
				pw.flush();
				pw.close();
				fw.close();
			}
			catch(IOException ie)
			{
				System.out.println("IOException cougth.");
			}
		}
		
/*=====================LOAD EVENTS==============================================================*/
	
		/* Loading Events */
		public void  loadEvents()
		{
			try{
				FileReader fr = new FileReader ("F:\\Projects_2nd_Semester\\EMS_Project_GUI\\SAVED.txt");
				BufferedReader br = new BufferedReader(fr);
				String line  = br.readLine();
				String [] tokens ; // For breaking the lines in a file.
				
				while(line != null) // while line is not an empty.
				{
					tokens = line.split("  "); //For breaking name and vanue at new line. 
					
					String name = tokens[0];
					///JOptionPane.showMessageDialog(null, name);					
					String vanue = tokens[1];
					String dt = tokens[2];
					String t = tokens[3];
					
					EventInfo ei = new EventInfo(name,vanue,dt,t);
					alist.add(ei);
					line = br.readLine(); // Again reading line.
				}				
				br.close();
				fr.close();
			}
			catch(IOException ie)
			{
				System.out.println("IOException caugth.");
			}
			catch(ArrayIndexOutOfBoundsException ao)
			{
				System.out.println("Array out of Bound  "+ao.getMessage());
			}
		}
		
		
/*=====================EVENT HANDLING==============================================================*/	
	
	
	
	/*Events Handling for the  */
	private class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b_add )
			{				
				ADD();				
				frame.dispose();
			}
			else if(e.getSource() == b_search)
			{
				search();
				frame.dispose();
			}
			else if(e.getSource() == b_delete)
			{
				delete();
				frame.dispose();
			}
			else if(e.getSource() == b_show)
			{
				show();
				frame.dispose();
			}
			else if(e.getSource() == bADD)
			{
				if(tf1.getText().equalsIgnoreCase("") || tf2.getText().equalsIgnoreCase("") || tf3.getText().equalsIgnoreCase("") || tf4.getText().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Fill out the Fields !");
				}
				else if(tf1.getText() != ""){
					String a1 , a2, a3 ,a4 ;
					a1 = tf1.getText();
					a2 = tf2.getText();
					a3 = tf3.getText();
					a4 = tf4.getText();
					
					EventInfo ei = new EventInfo(a1,a2,a3, a4);
					alist.add(ei);
					SaveEvents();
					JOptionPane.showMessageDialog(null, "Event Added Successfully !");				
					Draw();
					frame1.dispose();					
				}			
			}
			else if(e.getSource() == bSEARCH)
			{
				if(stf.getText().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Enter Name of an Event !");
				}
				else if(stf.getText() != ""){	
					String sName = stf.getText();
					boolean flag = false ;
					for(int i=0 ; i<alist.size() ; i++)
					{
						EventInfo ei = (EventInfo) alist.get(i);
						if(sName.equalsIgnoreCase(ei.getName()))
						{
							flag=true ;
							l2.setText(ei.getName());
							l4.setText(ei.getVanue());
							l6.setText(ei.getDate());
							l8.setText(ei.getTime());
							break;
						}
					}
					if(flag==false)
					{
						JOptionPane.showMessageDialog(null, "Sorry ! Not Present.");
					}
					else {
						New.add(sp);
						sp.setBounds(100, 50, 400, 300);
					}					
				}
			}
			else if(e.getSource() == bDELETE)
			{
				if(dtf.getText().equalsIgnoreCase("")){
					JOptionPane.showMessageDialog(null, "Enter Name of an Event !");
				}
				else if(dtf.getText() != ""){
					String dName = dtf.getText();
					boolean flag = false ;
					boolean spwindow = false ;
					int a ;
					for(int i=0 ; i<alist.size() ; i++)
					{
						EventInfo ei = (EventInfo)alist.get(i);
						if(dName.equalsIgnoreCase(ei.getName()))
						{			
							flag=true ;
							a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete  ' "+ ei.getName()+" '");							
							if(a==0)
							{
								l1.setText("DELETED !");
								alist.remove(i);
								SaveEvents();								
							}
							if(a==1) {
								l1.setText("");
								spwindow = true ;
							}
							
							break;
						}
					}
					if(flag==false)
					{
						JOptionPane.showMessageDialog(null, "Sorry ! Not Present.");
					}
					if(flag==true && spwindow == false){
						New.add(sp);				
						sp.setBounds(140, 50, 300, 300);
					}					
				}
			}
			else if(e.getSource() == back) {
				Draw();
				frame1.dispose();
			}
		
		
		
		}// End of ActionHandler Method
	}// End of Inner Class.
}// End of Main Page class.

/*File is the abstraction of Hard Desk
 * same for the network , abstraction is the socket to access the network.*/

