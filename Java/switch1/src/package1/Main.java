package package1;

import package1.TestCode.Day;

public class Main {
	
	public class EnumTest {
	    Day day;
	    Day day2;
	    
	    public EnumTest(Day day) {
	    	Day day1 = day.SATURDAY;
	    }
	    
	    public void tellItLikeItIs() {
	        switch (day) {
	            case MONDAY:
	                break;
	            case SUNDAY:
	                break;	
	            default:
	        }
	    }
	}
	
	Day getDay() {
		Day day = Day.MONDAY;
		return day;
	}
}
