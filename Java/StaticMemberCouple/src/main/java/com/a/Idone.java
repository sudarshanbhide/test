/* package whatever; // don't place package name! */
package com.a;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	Class1 c1Obj;
	public static void main (String[] args) throws java.lang.Exception
	{
	}
	
	void func1() {
        c1Obj.staticFunc();
    }

    Object func2()
    {
        return c1Obj.staticVar;
    }
        
    void func3() {
		c1Obj.memberFunc();
    }

    Object func4()
    {
        return c1Obj.memberVar;
    }
}