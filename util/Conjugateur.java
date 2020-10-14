package fr.mds.java.tp11.util;

import java.util.ArrayList;
import java.util.List;

public class Conjugateur {
	private static final String[] PRONOMS = {"je", "tu", "il", "nous", "vous", "ils"};
	private static final String[] SUFFIXES = {"e", "es", "e", "ons", "ez", "ent"};
	private static final String[] TERMINAISONS = {"er","ir","oir"};
	private static List<String> arrList = new ArrayList<String>(); 

	
	
	public static void conjugateur(List<String> arrList){
		System.out.println();
		for(String str:arrList) {
			conjugateur(str);
		}

	}
	
	public static void conjugateur(String verbe){
		String res = verbe.substring(0,verbe.length()-2);
		for (int i = 0; i < SUFFIXES.length; i++) {
			System.out.println(PRONOMS[i] + " " + res + SUFFIXES[i]);
		}
		System.out.println();
	}


	public  List<String> getArrList() {
		return arrList;
	}


	public static void setArrList(List<String> arrList) {
		Conjugateur.arrList = arrList;
	}


	public static String[] getPronoms() {
		return PRONOMS;
	}


	public static String[] getSuffixes() {
		return SUFFIXES;
	}
	
	
	
}
