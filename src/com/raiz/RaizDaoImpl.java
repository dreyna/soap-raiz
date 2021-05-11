package com.raiz;

import javax.jws.WebService;

@WebService(endpointInterface = "com.raiz.RaizDao")
public class RaizDaoImpl implements RaizDao {

	@Override
	public double raizCalcular(double num) {
		// TODO Auto-generated method stub
		double raiz = Math.sqrt(num);
		return raiz;
	}

}
