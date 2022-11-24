package Personnages;

import java.util.Random;

public abstract class Pokemon {
	//Attributs
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private static final int niveauMax = 10;
	private Type TypePokemon;
	private static Random r = new Random();
	
	//Constructeurs
	public Pokemon (String nom , Type type ) {
		this.nom = nom;
		this.niveau = r.nextInt(1,11);;
		this.hp = (this.niveau * 2);
		this.atk = (this.niveau/2)+1;
		this.TypePokemon = type;
		
	}

	//Accesseurs
	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}
	
	public Boolean isKO() {
		if (hp == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void soigner() {
		hp = niveau*2;
	}
	
	public abstract void attaquer( Pokemon p);

	@Override
	public String toString() {
		return "Je m'appelle "+ nom +"! \n je suis de niveau "+ niveau+" \n j'ai "+ hp+" points de vie \n mon attaque de base est "+ atk;
	}
	
	public void log(String msg) {
		String x = "[Pokemon "+ nom +"] :";
		x+= msg;
		System.out.println(x);
	}
	
	public abstract void subir(Pokemon p);
	
	/**private  String prefixe() {
		return null;
	}**/
	
	
	
	

}
