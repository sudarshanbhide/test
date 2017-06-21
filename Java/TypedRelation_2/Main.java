package com.sample.test;
public class Main{
	public enum Season{
		DAY,WEEK;
	}
	public Season getSeason(){
		return Season.valueOf("a");
	}
	
}