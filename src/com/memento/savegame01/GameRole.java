package com.memento.savegame01;

public class GameRole {

	private int vitality;  //������
	private int attack;  //������
	private int defense;  //������
	
	
	
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
		
		System.out.println("��ɫ��ǰ״̬��");
		System.out.println("������"+this.vitality);
		System.out.println("��������"+this.attack);
		System.out.println("��������"+this.defense);
		
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
