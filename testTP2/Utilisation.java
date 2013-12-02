package testTP2;

import java.util.ArrayList;

import tp2.Animal;
import tp2.Chat;
import tp2.Chien;

public class Utilisation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Chien caniche = new Chien(2, "biloute", "Castafiore");
		System.out.println(caniche);
		Animal animal = new Animal(100, "Un animal inconnu");
		Chien dogue = new Chien(12, "qui mord", "Haddock");
		Chien foxTerrier = new Chien(5, "milou", "Tintin");
		
		Animal[] animaux = new Animal[4];
		animaux[0] = caniche;
		animaux[1] = animal;
		animaux[2] = dogue;
		animaux[3] = foxTerrier;
		
		for(int i=0; i<animaux.length; i++){
			System.out.println("Noms animaux[" + i + "] = " + animaux[i].getNom());
		}
		
		ArrayList<Animal> mesAnimaux = new ArrayList<Animal>();
		mesAnimaux.add(caniche);
		mesAnimaux.add(animal);
		mesAnimaux.add(dogue);
		mesAnimaux.add(foxTerrier);
				
		Chat chat = new Chat(2, "méchant", "Siamois");
		mesAnimaux.add(chat);
		
		System.out.println(mesAnimaux);

	}

}
