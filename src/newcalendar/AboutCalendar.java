package newcalendar;

public class AboutCalendar {
	private static final int[] MAXDAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxOfMonth(int month) {
		
		return MAXDAYS[month-1];
	}
	
	
	
	public void printCalendar(int year, int month) {

		if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 != 0))) {
			MAXDAYS[1] = 29;
		}
			
		System.out.printf(" << %4d년 %3d월 >>",year, month);
		System.out.println();
		System.out.println(" 일 월 화 수 목 금 토 ");
		System.out.println("======================");
		
		int maxOfDays = getMaxOfMonth(month);
		
		for(int i = 1; i <= maxOfDays; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		MAXDAYS[1] = 28;
	}
}
