package package1;

public class TestCode { 

	  public static void main(){  
		  int a = 5;
		  int b = 5;
		  int minVal = a < b ? a : b;
		  
		  method1();
	  }
	  
	  static boolean method1() {
		  String usrname = "username";
		  String passwd = "password";
		  
		  return (usrname.equals("username") && passwd.equals("password") )?  true : false;
	  }
}
