/**
 * @author N'ZO LAGOU
 *  Exercice 2 : Calculer Le Produit
Instructions
Écrivez un programme Java qui prend trois entrées de l'utilisateur et calcule le produit :

moyenne,
somme,
le plus grand et le plus petit des trois nombres.
Utiliser les java.mathbibliothèques
 */

package exercice1;

import generateur.Main;

public class PerimetreDeCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println(new Convention().aire(4));

	    System.out.println(new Convention().perimetre(4));
	    
	}
	    
	    /**
	     * @param rayon
	     * @return area
	     */
	    public String  aire (double rayon) {
	        
	        double aire = Math.PI * Math.pow(rayon, 2);

	        return "Aire du cercle est : " + aire;
	        
	    }

	     /**
	     * @param rayon
	     * @return perimetre
	     */
	    public String  perimetre (double rayon) {
	        
	        double perimetre = Math.PI * 2 * rayon;

	        return "Perimetre du cercle est : " + perimetre;
	        
	    }

	}

