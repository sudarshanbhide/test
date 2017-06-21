package com.sample.test;

public class Main
{
    public static void main(String[] args) 
    {
    	Main t = new Main();
    }

    private static void testMethod(){
        abstract class TestMethod{
            int a;
            abstract void implementMe();
        }

        class DummyClass extends TestMethod{
           public void implementMe(){

            }
        }
        DummyClass dummy = new DummyClass();
        dummy.implementMe();
        dummy.a = 8;
    }
    
}