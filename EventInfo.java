
import javax.swing.*;  // For JOptionPane
class EventInfo{
	String name ;
	String vanue;
	String  D ;
	String time ;
	
	EventInfo() // default constructor.
	{
		name = "" ;
		vanue = "" ;
		D = "";
		time = "";
	}
	EventInfo(String name , String vanue ,String D , String time) // parameterized constructor
	{
		this.name = name ;
		this.vanue = vanue  ;
		this.D = D ; 
		this.time = time ;
	}
	public String getName(){return  name;} // TO retrieve name for searching and storing in arraylist.
	public String getVanue(){return  vanue;} // To retrieve vanue for storing in arraylist.
	public String getDate(){return  D;}	// To retrieve date and store it in ArraryList.
	public String getTime() {return time ;}
	public void Print() /* It will call only with the EventInfo's object */
	{
//		JOptionPane.showMessageDialog(null ,"Name of the Event : "+name+"\nVanue of the Event : "+vanue+"\nDate of the Event : "+D);
		
		
	}
}