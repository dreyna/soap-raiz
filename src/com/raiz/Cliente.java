package com.raiz;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaizDaoImplService rdis = new RaizDaoImplService();
		RaizDao rdao = rdis.getRaizDaoImplPort();
		System.out.println(rdao.raizCalcular(81));
	}

}
