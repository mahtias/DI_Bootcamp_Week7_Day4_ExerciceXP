/**
 * @author N'ZO LAGOU
 * Exercice 3 : Générateurs De Nombres
Instructions
1. À l'aide de la classe java.util.Random, mettez en œuvre les exercices suivants.

La classe est documentée ici.

Notez en particulier les méthodes suivantes :

nextInt()
nextInt(int bound)
nextBoolean()
nextDouble()

2.Imprimez des nombres aléatoires

Imprimez N nombres, où chaque nombre est un nombre aléatoire 
de 1 à X. N et X sont des valeurs que vous devriez demander aux utilisateurs.

ASTUCES:

Créez un générateur de nombres aléatoires en utilisant new Random().
pour obtenir un nombre aléatoire de 0 à x - 1, utilisez la méthode
 nextInt(x).

REMARQUE : l'exercice vous demande d'imprimer des nombres aléatoires 
de 1 à X, tandis que la méthode nextInt() renvoie des nombres de 0 à X - 1
 */

package generateur;

import java.util.Random;
import java.util.Scanner;

public class GenerateurDeNombre {
	public static void main(String[] args) {
		GenerateurDeNombre();

	}

	public static void GenerateurDeNombre() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrer un nombre");

		int X = sc.nextInt();

		System.out.println("Entrer un nombre");

		int N = sc.nextInt();

		Random r = new Random();

		int[] tab = new int[N];

		for (int i = 0; i < N; i++) {

			tab[i] = r.nextInt(X - 1) + 1;

			System.out.println(tab[i]);

		}

	}

}
