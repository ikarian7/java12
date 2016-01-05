package java12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class H13 extends Applet {
	
private Button bakstenenknop;
private Button betonblokkenknop;
int breedtesteen;
int hoogtesteen;
private int nAantalSteenHor;
private int nAantalSteenver;
Color steenkleur;
Color voegKleur;
boolean tekenmuur;

public void init(){
	setSize(700, 500);
	bakstenenknop = new Button("Bakstenen");
	bakstenenknop.addActionListener(new BaksteenLuisteraar());
	add(bakstenenknop);
	
	betonblokkenknop = new Button("Betonblokken");
	betonblokkenknop.addActionListener(new BetonblokLuisteraar());
	add(betonblokkenknop);
	
	tekenmuur = false;
	voegKleur = Color.BLACK;
	repaint();
}

public void paint(Graphics g){
	int x = 50;
	int y = 50;
	if (tekenmuur){
		for (int i = 0; i < nAantalSteenver; i++){
			for( int j = 0; j < nAantalSteenHor; j++){
				g.setColor(steenkleur);
				g.fillRect(x, y, breedtesteen, hoogtesteen);
				g.setColor(voegKleur);
				g.drawRect(x, y, breedtesteen, hoogtesteen);
				x += breedtesteen;
			}
			y += hoogtesteen;
			x = 50;
		}
		
	}
}

class BaksteenLuisteraar implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		breedtesteen = 40;
		hoogtesteen = 30;
		nAantalSteenHor = 25;
		nAantalSteenver = 20;
		steenkleur = Color.RED;
		tekenmuur = true;
		repaint();
	}
	
}
class BetonblokLuisteraar implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		breedtesteen = 60;
		hoogtesteen = 50;
		nAantalSteenHor = 15;
		nAantalSteenver = 10;
		steenkleur = Color.GRAY;
		repaint();
	}
	
}
}
