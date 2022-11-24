package histoire;
import java.util.Random;
import java.util.random.*;

public class Pokemon0 {
	//Attributs
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	//Constructeurs
	public Pokemon0 (String nom) {
		this.nom = nom;
		Random r = new Random();
		this.niveau = r.nextInt(1,11);;
		this.hp = (this.niveau * 2);
		this.atk = (this.niveau/2)+1;
		
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
	
	public void attaquer( Pokemon0 p) {
		p.hp = p.getHp() - this.atk;
	}

	@Override
	public String toString() {
		return "Je m'appelle "+ nom +"! \n je suis de niveau "+ niveau+" \n j'ai "+ hp+"points de vie \n mon attaque de base est "+ atk;
	}
	
	public void log(String msg) {
		String x = "[Pokemon "+ nom +"] :";
		x+= msg;
		System.out.println(x);
	}
	

}
