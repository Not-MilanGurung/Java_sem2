package week2.java_data_types_tasks;
import java.util.Calendar;

enum Days{
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THRUSDAY(5), FRIDAY(6), SATURDAY(7),
	NODAY(-1);
	final int day;
	Days(int day) {
		this.day = day;
	}
	
	public static Days valueOfDay(int day) {
		for (Days a: values()) {
			if (day == a.day) {
				return a;
			}
		}
		return NODAY;
	}
	public static boolean weekend(Days day) {
		if (day.day == 1 || day.day == 7) {
			return true;
		}
		return false;
	}
}

public class EnumsS {
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Days day = Days.valueOfDay(today.get(Calendar.DAY_OF_WEEK));
		System.out.println("Today is: "+ day);
		boolean weekend = Days.weekend(day);
		System.out.println("Is it a weekend? "+weekend);
		
	}
}
