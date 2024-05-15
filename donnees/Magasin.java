package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}


	// TODO  ajouter une methode de tri
	public void trierCd() {
		//créez une liste vide destinée à contenir les éléments triés;
		Magasin liste = new Magasin();

		while (this.getNombreCds() > 0) {
			//trouvez dans la liste à trier l'indice du plus petit élément (recherche du minimum);
			int indicePetit = 0;
			for (int i=0; i<this.getNombreCds(); i++) {
				if (this.listeCds.get(indicePetit).comparerCD(this.listeCds.get(i)) < 0) {
					indicePetit = i;
				}
			}

			//insérez cet élément en fin de la nouvelle liste et supprimez le de la liste initiale;
			liste.ajouteCd(this.listeCds.get(indicePetit));
			this.listeCds.remove(this.listeCds.get(indicePetit));
		}
		//recommencez l'opération jusqu'à avoir tout trié.
		this.listeCds = liste.listeCds;
	}


	public void trierArtiste(){
		//créez une liste vide destinée à contenir les éléments triés;
		Magasin liste = new Magasin();

		while (this.getNombreCds() > 0) {
			//trouvez dans la liste à trier l'indice du plus petit élément (recherche du minimum);
			int indicePetit = 0;
			for (int i=0; i<this.getNombreCds(); i++) {
				if (this.listeCds.get(indicePetit).comparerArtiste(this.listeCds.get(i)) < 0) {
					indicePetit = i;
				}
			}

			//insérez cet élément en fin de la nouvelle liste et supprimez le de la liste initiale;
			liste.ajouteCd(this.listeCds.get(indicePetit));
			this.listeCds.remove(this.listeCds.get(indicePetit));
		}
		//recommencez l'opération jusqu'à avoir tout trié.
		this.listeCds = liste.listeCds;
	}
}
