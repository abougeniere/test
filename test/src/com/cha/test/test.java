package com.cha.test;

public class test {

	public static void main(String[] args) {

		Ville v = new Ville();
// test github
		System.out.println("0 Le nombre d'instances de la classe Ville est : "		+ Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "		+ Ville.getNombreInstancesBis());
		Ville v1 = new Ville("Marseille", 1236, "France");
		System.out.println("Le nombre d'instances de la classe Ville est : "		+ Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "		+ Ville.getNombreInstancesBis());
		Ville v2 = new Ville("Rio", 321654, "Br�sil");
		System.out.println("Le nombre d'instances de la classe Ville est : "		+ Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "		+ Ville.getNombreInstancesBis());
	}
}
