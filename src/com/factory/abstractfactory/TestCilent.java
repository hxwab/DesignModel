package com.factory.abstractfactory;
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
 * @version 2.0
 * @author win7
 * 
 * @category ���������ݱ�Department������IDepartment��SqlServerDepartment
 *        ��AccessDepartment���ڸ��ӿڣ�����������������Ӧ�ķ���CreateDepartment()
 *        
 *@problem  ����һ�����ݱ�Ҫͬʱ�޸������࣬��Ҫ�޸Ľӿڡ�Υ���˿���--���ԭ��
 *
 *@solution ���ü򵥹������Ľ����󹤳� �� simple version 3
 *
 */
public class TestCilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		Department dept = new Department();
		IFactory factory ;
		IUser iu ;
		IDepartment idept;
		
		user.getId();
		
		
		
		factory = new SqlServerFactory();
		iu = factory.creatUser();
		iu.insert(user);
		iu.getUser(1);
		
		idept = factory.creatDepartment();
		idept.insert(dept);
		idept.getDepartment(1);
		
		
		factory = new AccessFactory();
		iu = factory.creatUser();
		iu.insert(user);
		iu.getUser(1);
		
		idept = factory.creatDepartment();
		idept.insert(dept);
		idept.getDepartment(1);
		
		
		IUser iuser = Reflect.creatUser();
		System.out.println("=========");
		iuser.insert(user);
		
	}

}

/**
 * *        ��Ȼʵ����������������ǿ�ˣ���������ڿ��Ժ����׵������ݿ�֮���л�����
 *        �������Ҫ����һ�����ݿ��Ļ�����Ҫ�����е��������ӶԱ�Ĳ�����
 *        �ⲻ���������󣬶���ҲΥ���˿���--���ԭ��
 *        
 *        ��������ģʽֻ��������һ���������󣨴˴���User���������һ��Department
 *        ��Դ���ĸĶ��ܴ󡣴�ʱӦ���ó��󹤳�ģʽ
 * 
 */
