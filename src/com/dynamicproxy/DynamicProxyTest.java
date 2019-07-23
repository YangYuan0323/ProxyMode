package com.dynamicproxy;

import java.lang.reflect.Proxy;

import com.BuyHouse;
import com.BuyHouseImpl;

public class DynamicProxyTest {
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		/**
		 * ClassLoader loader:ָ����ǰĿ�����ʹ�õ��������,��ȡ�������ķ����ǹ̶���
		 * Class<?>[] interfaces:ָ��Ŀ�����ʵ�ֵĽӿڵ�����,ʹ�÷��ͷ�ʽȷ������
		 * InvocationHandler:ָ����̬��������ִ��Ŀ�����ķ���ʱ,�ᴥ���¼��������ķ���
		 */
		BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
		proxyBuyHouse.buyHouse();
	
	}
}
