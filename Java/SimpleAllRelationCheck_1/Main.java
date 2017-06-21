package com.sample.test;

class Main extends MainBase{
	MainBase mainBase;
	public Main(int value){
		super(value);
		this.mainBase = new MainBase(2);
		
	}
}
class MainBase{
	public MainBase(int param){
	}
	public static Mode getMode() {
		return Mode.valueOf("a");
	}
	public enum Mode {
		LOCAL, REMOTE
	}
}

