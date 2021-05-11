package com.raiz;

import javax.xml.ws.Endpoint;

public class RaizPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Endpoint.publish("http://localhost:2828/soap/raiz", new RaizDaoImpl());
			System.out.println("Inicado");
	}

}
