package com.sample.test;

public class Main {

	
	public void testCoupledRelationFromBase(){
		CoupledRelation usesRelation = new CoupledRelation();
	}
	
	public void testCoupledRelationFromDerived(){
		CoupledRelationImpl usesRelationImpl = new CoupledRelationImpl();
	}
	
	public void testCoupledRelation(){
		CoupledRelation usesRelation = new CoupledRelationImpl();
	}
	
	public void testCoupledRelationForStaticField(){
		String relation = CoupledRelationImpl.name;
	}
	
	public CoupledRelation testCoupledRelationForReturn(){
		return new CoupledRelation();
	}
}
