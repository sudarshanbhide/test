package com.sample.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	   public static void main(String args[]){
	      List<String> names1 = new ArrayList<String>();
	      List<String> names2 = new ArrayList<String>();
	      Main tester = new Main();
	      tester.sortUsingJava7(names1);
	      tester.sortUsingJava8(names2);
	   }
	   
	   //sort using java 7
	   private void sortUsingJava7(List<String> names){   
	      Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   
	   //sort using java 8
	   private void sortUsingJava8(List<String> names){
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	   }
	}