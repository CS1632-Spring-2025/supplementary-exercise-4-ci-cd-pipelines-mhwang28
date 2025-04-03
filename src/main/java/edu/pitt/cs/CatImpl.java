package edu.pitt.cs;

public class CatImpl implements Cat {

	int identification;
	String catName;
	boolean rented;


	public CatImpl(int id, String name) {
		identification = id;
		catName = name;
		rented = false;
	}

	public void rentCat() {
		rented = true;
	}

	public void returnCat() {
		rented = false;
	}

	public void renameCat(String name) {
		catName = name;
	}

	public String getName() {
		return catName;
	}

	public int getId() {
		return identification;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		return "ID " + identification + ". " + catName;
	}

}