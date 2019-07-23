package com.cglibproxy;

import com.BuyHouse;
import com.BuyHouseImpl;

public class CglibProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		CglibProxy cglibProxy = new CglibProxy();
		BuyHouseImpl  buyHouseCglibProxy   = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
		buyHouseCglibProxy .buyHouse();

	}

}
