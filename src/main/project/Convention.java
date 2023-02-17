/**
 * @author N'ZO LAGOU
 * Exercice 4 : Exercice Sur Les Conventions Java
Instructions
Déclarez une classe nommée Personavec trois variables d'instance : firstName, lastNameet age.

Créez un constructeur pour la classe qui prend trois arguments : firstName, lastNameet age. Affectez les arguments aux variables d'instance.

Ajoutez des getters et des setters pour chaque variable d'instance. Les conventions de dénomination des getters et des setters sont les suivantes 
: get + variable namepour les getters et set + variable namepour les setters.

Ajoutez une méthode nommée introducequi renvoie une chaîne présentant la personne au format suivant :"Hello, my name 
is [firstName] [lastName] and I am [age] years old."
 */

package main.project;

public class Convention {
	private String firstName;
    private String lastName;
    private int age;

    public Convention() {
    }

    public Convention(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }

    public static void main(String[] args) {

    	Convention person = new Convention();

        person.setFirstName("N'ZO ");

        person.setLastName("LAGOU ");

        person.setAge(32);

        System.out.println(person.toString());

    }


	
}


