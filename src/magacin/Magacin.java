package magacin;

import java.util.LinkedList;

import magacin.interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {
		
	private LinkedList<Artikal> artikli = new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		
		if(artikal == null)
			return;
		
		for (Artikal a : artikli) {
			if(a.getSifra() == artikal.getSifra()) {
				a.setKolicina(a.getKolicina()+1);
				return;
			}
		}
		artikli.add(artikal);
	}
	@Override
	public void izbaciArtikal(Artikal artikal) {

	}

	@Override
	public LinkedList<Artikal> vratiArtikal(int sifra) {
		
		return null;
	}

}
