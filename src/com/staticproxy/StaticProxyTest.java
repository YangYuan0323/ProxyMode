package com.staticproxy;

import com.BuyHouseImpl;

public class StaticProxyTest {

	public static void main(String[] args) {
		BuyHouseImpl buyHouse = new BuyHouseImpl();
		BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
		buyHouseProxy.buyHouse();
		
	}

}
