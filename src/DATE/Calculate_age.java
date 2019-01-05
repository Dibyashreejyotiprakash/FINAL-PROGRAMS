package DATE;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Calculate_age {
	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1977, Month.DECEMBER, 6);
		LocalDate now = LocalDate.of(2016, Month.OCTOBER, 11);

		// using period
		Period period = Period.between(birthday, now);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println("age: " + period.getYears());  // prints "age: 26"

		// using chrono unit
		System.out.println("age: " + ChronoUnit.YEARS.between(birthday, now));  // prints "age: 26"
	}

}
