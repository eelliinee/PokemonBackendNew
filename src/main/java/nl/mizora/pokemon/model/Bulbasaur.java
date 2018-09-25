package nl.mizora.pokemon.model;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bulbasaur extends Pokemon{
	@Id
	@GeneratedValue
	private long id;
	
	private String naam;
	
	private int level;
	
	private String type = "grass";
	
	private int hp = 45;
	
	private int attack = 49;
	
	private int defense = 49;
	
	private int speed = 45;
	
	private int exp = 0;
	
	private HashMap<Integer, Object> learnset;
	
	private String sprite; // aandachtspunt, url aanroepen als string in frontend?? 
	
	// getters en setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public HashMap<Integer, Object> getLearnset() {
		return learnset;
	}
	public void setLearnset(HashMap<Integer, Object> learnset) {
		this.learnset = learnset;
	}
	
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	
}
