package java12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class Opdracht5 extends Applet {
	
    boolean gevonden;
    double[] salaris = { 100.0, 100.0, 100.0, 200.0, 500.0, 400.0, 400.0,  300.0 }; 
    double gezocht;
    int zelfde;
    Button knop;
    TextField tekstvak;
    String s;
	
    public void init() {
    	setSize(600, 600);
    	
    	zelfde = 0;
    	
    	knop = new Button("Ok");
    	knop.addActionListener(new KnopLuisteraar());
    	add(knop);
    	
    	tekstvak = new TextField("", 20);
    	add(tekstvak);
        gevonden = false;
        
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is " + zelfde + "x gevonden", 20, 50); 
            gevonden = false;
            zelfde = 0;
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
    class KnopLuisteraar implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		String s = tekstvak.getText();
    		gezocht = Double.parseDouble( s );
    		int teller = 0;
            while(teller < salaris.length) {
                if(salaris[teller] == gezocht) {
                    gevonden = true;
                   zelfde++;
                }
                teller++;
            }
            repaint();
    	}
}
}