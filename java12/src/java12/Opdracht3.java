package java12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.applet.*;

public class Opdracht3 extends Applet {

	TextField[] tekstvak = new TextField[5];
	Button knop;
	int[] getal = new int[5];
	String z;

	public void init() {
		setSize(600, 500);

		for (int teller = 0; teller < 5; teller ++) {	            
			tekstvak[teller] = new TextField("");				 
			add(tekstvak[teller]);		 			 
		}

		knop = new Button("Getallen invoeren");
		add(knop);

		knop.addActionListener (new Listener());
	}

	class Listener implements ActionListener  {

		public void actionPerformed( ActionEvent e) {
			for (int teller = 0; teller < tekstvak.length; teller ++) {
				z = tekstvak[teller].getText();	
				getal[teller] = Integer.parseInt( z);
			}
			Arrays.sort(getal);
			repaint();
		}
	}


	public void paint(Graphics g) {
		for (int teller = 0; teller < getal.length; teller ++) {
			g.drawString("" + getal[teller], 50, 20 * teller + 20);
		}
	}

}