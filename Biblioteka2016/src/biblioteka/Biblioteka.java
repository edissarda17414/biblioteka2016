package biblioteka;
import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	// Ovo je lista svih knjiga u biblioteci
	private LinkedList<Knjiga> knjige = new LinkedList<>();
	
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		//ne smeju se dodavati null knjige
		if (knjiga == null || knjige.contains(knjiga))
			throw new RuntimeException("Greska pri unosu knjige.");
		
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		if (knjiga == null || !knjige.contains(knjiga))
			throw new RuntimeException("Greska pri brisanju knjige.");
		
		knjige.remove(knjiga);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		
		if (naslov == null || naslov.isEmpty()) {
			throw new RuntimeException("Naslov je prazan.");
		}
		
		LinkedList<Knjiga> rezultat = new LinkedList<>();
		
		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov)) {
				rezultat.add(knjige.get(i));
			}
		}
		
		return rezultat;
	}

}
