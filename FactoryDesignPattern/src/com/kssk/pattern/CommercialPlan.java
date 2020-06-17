package com.kssk.pattern;

public class CommercialPlan implements Plan {

	@Override
	public void getRate() {
		double rate=5.50;
		System.out.println(rate);
	}

}
