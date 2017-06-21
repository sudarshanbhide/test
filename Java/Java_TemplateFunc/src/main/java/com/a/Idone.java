/* package whatever; // don't place package name! */
package com.a;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Idone <T2>
{
    T2 mine;
	
	public E static < E > void SomeFunc( ) {
      E a;
   }
	
	// generic method printArray
   public static < E > void printArray( E[] inputArray ) {
      <Idone>SomeFunc();
	  <Integer>SomeFunc();
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }
   
   public static < E > void printArray2( E Obj ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
   }
   
   public void func1() {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      printArray(intArray);   // pass an Integer array
	  printArray(doubleArray);   // pass a Double array
	  printArray(charArray);   // pass a Character array
   }
	
}
