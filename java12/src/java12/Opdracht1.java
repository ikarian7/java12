package java12;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
	double gemiddelde;
	int teller, salaris[], optellen, beginGetal, totaalSalaris;


	public void init() {
		setSize(400, 400);
		optellen = 100;
		beginGetal = 100;
		totaalSalaris = 0;
		salaris = new int[10];
        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = optellen * teller + beginGetal;
            totaalSalaris += salaris[teller];
    }
}


	public void paint(Graphics g) {
		gemiddelde = totaalSalaris / salaris.length;
		for (int teller = 0; teller < salaris.length; teller ++) {
	            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
	            g.drawString ("Gemiddelde is: " + gemiddelde, 50, 220); 
		} 
	}
}