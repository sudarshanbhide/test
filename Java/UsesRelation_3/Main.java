package com.sample.test;

public class Main {

	
	public void testUserRelationFromBase(){
		UsesRelation usesRelation = new UsesRelation();
		String relation = usesRelation.userName;
	}
	
	public void testUserRelationFromDerived(){
		UsesRelationImpl usesRelationImpl = new UsesRelationImpl();
		String relation = usesRelationImpl.userName;
	}
	
	public void testUserRelation(){
		UsesRelation usesRelation = new UsesRelationImpl();
		String relation = usesRelation.userName;
	}
	
	public void testUserRelationForStaticField(){
		String relation = UsesRelationImpl.name;
	}
}
