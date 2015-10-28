package com.memento.savegame01;

public class GameRole {

	private int vitality;  //生命力
	private int attack;  //攻击力
	private int defense;  //防守力
	
	
	
	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
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
	
	
	public void stateDisplay(){
		
		System.out.println("角色当前状态：");
		System.out.println("体力："+this.vitality);
		System.out.println("攻击力："+this.attack);
		System.out.println("防御力："+this.defense);
		
	}
	
	
	public void getInitState(){
		
		this.vitality = 100;
		this.attack = 100;
		this.defense = 100;
		
	}
	
	public void fight(){
		
		this.vitality = 0;
		this.attack = 0;
		this.defense = 0;
	}
}
