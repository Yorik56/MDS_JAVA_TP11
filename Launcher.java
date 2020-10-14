package fr.mds.java.tp11;

import java.util.List;
import java.util.Scanner;

import fr.mds.java.tp11.util.Conjugateur;

public class Launcher {
	public static void main(String[] args) {
		Conjugateur myConjug = new Conjugateur();
		String[] verbes = new String[] {
				"manger", "bouger", "crier"
		};
		List<String> maListe = myConjug.getArrList();
		for(int i = 0; i< verbes.length; i++) {
			maListe.add(verbes[i]);
		}
		Conjugateur.conjugateur(maListe);
		
		System.out.println();
		System.out.println("Donner moi un verbe à conjuguer");
		Scanner sc = new Scanner(System.in);
		String verbe = sc.nextLine();
		System.out.println(verbe);
		Conjugateur.conjugateur(verbe);
		
		sc.close();
	}
}
