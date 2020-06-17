package com.kssk.pattern;

import java.util.Scanner;

public class RateOfPlan 
{

	public static void main(String args[])
	{
		GetPlanFactory  pf=new GetPlanFactory();
		System.out.println("Enter Plan Name");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Plan p=pf.getPlan(s);
		System.out.println("Plan Name is "+s);
		p.getRate();
	}
}

