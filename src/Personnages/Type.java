package Personnages;

public enum Type {
	Feu("Feu"),
	Eau("Eau"),
	Plante("Plante");
	
	String nomType;
	
	//Constructeur
	Type (String nom) {
		this.nomType = nom;
	}
	
	public String toString(){
		return "Je suis de type "+this.nomType;
	}

	//Getter
	public String getNomType() {
		return nomType;
	}
	
	

}
