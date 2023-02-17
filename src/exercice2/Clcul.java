package exercice2;

import java.util.Scanner;

public class Clcul {
	
	public static void main(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre 1");

        double number1 = scanner.nextDouble();

        System.out.println("Entrez le nombre 2");

        double number2 = scanner.nextDouble();

        System.out.println("Entrez le nombre 3");

        double number3 = scanner.nextDouble();

        System.out.println("Les 3 number1, number2, number3 " + number1 + " ," + number2 + " ," + number3);

        System.out.println("Le produit des 3 nombres est : " + product(number1, number2, number3));

        System.out.println("Le somme des 3 nombre est : " + sum(number1, number2, number3));

        System.out.println("Le moyenne des 3 nombre est : " + moyenne(sum(number1, number2, number3)));

        System.out.println("Le moyenne des 3 nombre est : " + Math.min(Math.min(number1, number2), number3));

        System.out.println("Le moyenne des 3 nombre est : " + Math.max(Math.max(number1, number2), number3));
    }

    public static double sum(double number1, double number2, double number3) {

        return Double.sum(Double.sum(number1, number2), number3);
    }

    public static double product(double number1, double number2, double number3) {

        return number1 * number2 * number3;
    }

    public static double moyenne(double sum) {

        return sum / 3;
    }

	
	
	
	
	
	
	
	
	

	/*
	public static void calcule() {

		Scanner scCal = new Scanner(System.in);
		System.out.println("Enter first nuber");
		int sum1 = scCal.nextInt();

		System.out.println("Enter second nuber");
		int sum2 = scCal.nextInt();

		System.out.println("Enter 3iem nuber");
		int sum3 = scCal.nextInt();
// somme des notes
		int sumTotal = sum1 + sum2 + sum3;
		System.out.println("la somme est : " + sumTotal);

		// calcule de moyenne
		int moyenne = sumTotal / 3;
		System.out.println("La moyenne est : " + moyenne);

		// calcule de comparaison
		int largest = Math.max(Math.max(sum1, sum2), sum3);
		int smallest = Math.max(Math.max(sum1, sum2), sum3);
		
		System.out.println("Le plus grand est : " + largest);
		System.out.println("Le plus petit est : " + smallest);
		
	}
	*/
}
