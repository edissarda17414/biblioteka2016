package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(Knjiga knjiga);
	public void obrisiKnjigu(Knjiga knjiga);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac);
	
}
