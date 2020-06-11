import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame implements ActionListener {
	private JButton schliessen;
	private JButton einstellungen;
	private JButton info;
	private JButton ende;

	
	public Frame(String name){
		super(name);
		
		schliessen = new JButton("Spiel starten");
		schliessen.setBounds(120,40,160,40);
		add(schliessen);
		
		
		einstellungen= new JButton("Einstellungen");
		einstellungen.setBounds(120,120,160,40);
		add(einstellungen);

		
	    info = new JButton("Credits");
		info.setBounds(120,200,160,40);
		add(info);
		
		
		ende = new JButton("Ende");
		ende.setBounds(120,280,160,40);
		add(ende);

		
		public void ActionPerformed(ActionEvent e) {
			
			if (e.getSource()== schliessen) {
				fenster();
			}
			
		}

		
		
	}

	public static void main(String[] args) {
	
		Frame frame = new Frame ("Menue");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		

	}
	

}
