package com.memento.savegame01;

/**
 * @discribe ��Ϸ���ȵĴ洢
 * 
 * @problem ϸ�ڹ���ı�¶�ڿͻ���
 * 
 * @category ϸ�ڷ�װ�����⣬���ñ���¼ģʽ
 * 
 * @version 1.0
 * 
 * @author win7
 *
 */
public class TestCilent {

	
	public static void main(String[] args) {
	
		
		GameRole player = new GameRole();
		player.getInitState();
		player.stateDisplay();
		
		
		GameRole backUp = new GameRole();
		//backUp=player; //�˴�backUp ���õĻ��Ǵ洢��player�еĶ��󣬹�״̬��playerһ��
		backUp.setAttack(player.getAttack());
		backUp.setDefense(player.getDefense());
		backUp.setVitality(player.getVitality());
		
		
		player.fight();
		player.stateDisplay();
		
		
		player = backUp;
		player.stateDisplay();
		
		
		
	}
}
