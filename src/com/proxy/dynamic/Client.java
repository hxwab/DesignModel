package com.proxy.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * http://www.360doc.com/content/14/0801/14/1073512_398598312.shtml
 * @author csdc
 *
 */
public class Client {
	
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		/*ElectricCar car = new ElectricCar();
		
		ClassLoader loader = car.getClass().getClassLoader();
		
		Class[] inter =  car.getClass().getInterfaces();
		
		InvokHanderImp handerImp = new InvokHanderImp(car);
		
		Object  o = Proxy.newProxyInstance(loader, inter, handerImp);*/
		
		InvokHanderImp handerImp = new InvokHanderImp(new ElectricCar() );
		Object o  = handerImp.creatProxy();
		
		Vehicle vehicle = (Vehicle) o;
		vehicle.drive();
		
		Rechargeable rechargeable = (Rechargeable) o;
		rechargeable.recharge();
		
		
		Method m =  o.getClass().getDeclaredMethod("drive");
		m.invoke(o);
		
		
		}

}
