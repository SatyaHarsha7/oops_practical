package practial;
import java.util.*;
public class calendar {
public static void main(String args[])
{
	Calendar c=Calendar.getInstance();
	Date d=c.getTime();
	System.out.println(d);
	c.set(2025,c.AUGUST,22);
	int year=c.getWeekYear();
	System.out.println(year);
	int h=c.getFirstDayOfWeek();
	System.out.println(h);
}
}
