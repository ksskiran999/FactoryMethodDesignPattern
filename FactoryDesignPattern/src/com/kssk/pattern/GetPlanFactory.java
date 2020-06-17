
//Factory Method Pattern allows the sub-classes to choose the type of objects to create.

/**
    When a class doesn't know what sub-classes will be required to create
    When a class wants that its sub-classes specify the objects to be created.
    When the parent classes choose the creation of objects to its sub-classes.
 * 
 * 
 */
package com.kssk.pattern;

public class GetPlanFactory {

	
	public Plan getPlan(String planType)
	{
		if(planType==null)
		{
			return null;
		}
		else if(planType.equalsIgnoreCase("DOMESTICPLAN"))
		{
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
		{
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN"))
		{
			return new InstitutionalPlan();
		}
		return null;
		
	}
	
}
