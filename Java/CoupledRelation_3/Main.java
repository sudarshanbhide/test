package com.sample.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class Main {
	
	public void testCoupledRelationForMethod(){
		String stringVar;
		int intVar;
		List listVar;
		CoupedRelationBase coupedRelationBase;
		CoupledRelationDerived coupledRelationDerived;
		List<List<List<String>>> listVarCollection;
		Map<List<Integer>, Map<Long, Map<Double, Byte>>> mapVar;
		
	}
	
	public BigDecimal testCoupledRelationForReturnType(){
		return new BigDecimal(1);
	}
	
	public void testCoupledRelationForParameter(BigInteger bigInteger){
		
	}
	
	public void testCoupleRelation(){
		new CoupedRelationBase();
	}
	
	public void testCoupleRelation1(){
		new CoupedRelationBase().relation();
	}

}

