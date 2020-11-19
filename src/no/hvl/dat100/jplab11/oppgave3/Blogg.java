package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg [] innleggstabell;
	private int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg [lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int indeks = -1;
		for (int i = 0; i < nesteledig; i++) {
			if(innleggstabell[i].erLik(innlegg)) {
				return indeks = i;
			}
		}
		return indeks;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i < nesteledig; i++) {
			if(innleggstabell[i] != null && innleggstabell[i].erLik(innlegg)) {
				return finnes = true;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggstabell.length) {
			return true;
		} else {
			
			return false;
			
		}

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(!finnes(innlegg) && ledigPlass() ) {
			innleggstabell[nesteledig] = innlegg;
			nesteledig ++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String streng = "" + nesteledig + "\n";
		for(Innlegg element: innleggstabell) {
			streng += element.toString();
		}
	return streng;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}