package com.extend;

public class Test extends AbstractSuper {
	public static void main(String[] args) {
		
		AbstractSuper as = new AbstractSub();
		as.show();
		System.out.println(as.num);
		
		Base base = new BaseSub();
		base.show();
		base.display();
		System.out.println(base.num);
		base.result();
		
		Inter in = new InterSub();
		in.show();
		System.out.println(in.num);
	}
}
