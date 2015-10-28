package com.iterator;

public class MyCollection implements Collection{

	public String str[] = {"A","B","C","D"};
	
	
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}

	@Override
	public Object getElement(int i) {
		// TODO Auto-generated method stub
		return str[i];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return str.length;
	}

	
	
}
