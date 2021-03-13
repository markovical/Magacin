package magacin;

import java.util.LinkedList;

import magacin.interfejs.MagacinInterface;

public class Magacin implements MagacinInterface {

	private LinkedList<Artikal> artikli = new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {

		if(artikal == null)
			throw new NullPointerException("Artikal ne sme biti null!");

			for (Artikal a : artikli) {
				if(a.getSifra() == a.getSifra()) {
					
					a.setKolicina(a.getKolicina()+1); 
					System.out.println("Poveæana kolièina artikla");
					return;
				}
	}
			artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		
			if(artikal == null)
				throw new NullPointerException("Artikal ne sme biti null!");
			
			 if(!artikli.contains(artikal)) 
				 throw new RuntimeException("Artikal nije u magacinu!");

			 for (Artikal a : artikli) {
				 
					if(a.getSifra() == artikal.getSifra() && a.getKolicina() > 0) {
						a.setKolicina(a.getKolicina()-1); 
						System.out.println("Smanjena kolièina artikla");
						return;
					}
				}
	}

	@Override
	public LinkedList<Artikal> vratiArtikal(int sifra) {
		LinkedList<Artikal> rezultat = new LinkedList<Artikal>();
		if(sifra <= 0)
			throw new RuntimeException("Sifra artikla ne sme biti negativna ili 0");
		
		for (Artikal a : artikli) {
			if(a.getSifra()  == sifra)
				rezultat.add(a);
				return rezultat;
	}
		return null;
}
}
