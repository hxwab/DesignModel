package com.memento.savegame01;

/**
 * @discribe 游戏进度的存储
 * 
 * @problem 细节过多的暴露在客户端
 * 
 * @category 细节封装在类外，采用备忘录模式
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
		//backUp=player; //此处backUp 引用的还是存储在player中的对象，故状态跟player一致
		backUp.setAttack(player.getAttack());
		backUp.setDefense(player.getDefense());
		backUp.setVitality(player.getVitality());
		
		
		player.fight();
		player.stateDisplay();
		
		
		player = backUp;
		player.stateDisplay();
		
		
		
	}
}
