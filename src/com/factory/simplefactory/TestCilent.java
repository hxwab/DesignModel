package com.factory.simplefactory;
/**
 * ����������Ŀǰ�ͻ�����Ϊ����SqlServer���ݿ⡣�����ǵ��ͻ��п��ܸ������ݿ�
 *       �������Ϊ�˷�ֹ���Ĵ����Ĵ��룬���ǲ��ö�̬����һ���ӿڣ�����
 *       �����ʵ������һ���ࡣ
 * 
 * ��������ģʽ������һ�����ڴ�������Ľӿڣ����������ʵ������һ��
 *        �ࡣ����������һ�����ʵ�����ӳٵ�������
 *        
 * ���������⣺�ͻ�����Ҫ����ʵ������һ��������ʵ�����ݿ�ĵ���
 *        ѡ���жϵ����⻹�Ǵ��ڵġ�Ҳ����˵�����������Ѽ򵥹����ڲ�
 *        �߼��ж��Ƶ��˿ͻ��˴��������С�����Ҫ�ӹ��ܣ������Ǹù���
 *        ��ģ����������޸Ŀͻ���
 *        
 * @version 3.0
 * @author win7
 * 
 * @category ���������ݿ���ʹ�����DataAccess�࣬ɾ���˹����ࡣ���������һ������
 *      	 ��ֻ������Access��SqlServer����Ӧ�࣬������DataAccess�������ж����
 *        
 *@problem  �����Ҫ����һ�����ݿ�Oracle,�ڳ��󹤳���Ҫ����Oracle�����༰���࣬���������࣬���ɱ���
 *       ��������ԭ��
 *		      �ڼ򵥹����д���ʵ����Ҫ��DataAccess�е�swicth �������ж���䣨Υ���˷��ԭ��
 *
 *@solution ���÷�����ƽ��ʵ���������⣬����DB�Ĳ�ֱͬ�ӷ��ش�������
 *			��version 4.0
 *
 */
public class TestCilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		Department dept = new Department();
		
		
		IUser iu ;
		IDepartment idept;
		
		iu = DataAccess.creatUser();// ֱ�ӵõ����ݿ���ʵ�ʵ��
		                            //���κ������������ڿͻ������ء��ﵽ����Ŀ��
		iu.insert(user);
		iu.getUser(1);
		
		idept = DataAccess.creatDepartment();
		idept.insert(dept);
		idept.getDepartment(1);
		
		
		IUser iuser = Reflect.creatUser();
		System.out.println("=========");
		iuser.insert(user);
		
	}

}

