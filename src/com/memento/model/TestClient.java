package com.memento.model;
/**
 * @discribe  ����¼ģʽ��ģ�� 
 * 
 * 
 * @author win7
 *
 */

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Originor originor = new Originor();
		
		originor.setState("on");
		originor.show();
		Memento m =originor.creatMemento();

		originor.setState("off");
		originor.show();
		originor.getMemento(m);
		originor.show();
		
	}

}
