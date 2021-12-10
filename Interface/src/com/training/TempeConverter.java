package com.training;

import com.training.ifaces.Function;

public class TempeConverter implements Function {
//cel to faren
	@Override
	public double apply(double arg) {
		
		return (arg* 9/5)+32;
	}

}
