package com.sample.test;

class Main {

	public int[][] test2DArray(){
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		return arr;
	}

	public int returnValueOne(){
		return 1;
	}

	public int returnValueTwo(){
		return 1;
	}
	public void test2DArrayInit(){
		int test2DArrayInitVar[][]=new int[returnValueOne()][3];  
		for(int i=0;i<2;i++){  
			for(int j=0;j<3;j++){  
				test2DArrayInitVar[i][j]=test2DArrayInitVar[i][j]+test2DArrayInitVar[i][j];  
			}  
		}  
	}

	public void test2DArrayVal(){
		int test2DArrayVal[][] = new int[new Main().returnValueTwo()][];  
	}
}
