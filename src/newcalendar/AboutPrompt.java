package newcalendar;

import java.util.Scanner;

public class AboutPrompt {
		private final static String PROMPT = "Cal> ";
		
//		public int startDay(String week) {
//			if(week.equals("일")) return 0;
//			else if(week.equals("월")) return 1;
//			else if(week.equals("화")) return 2;
//			else if(week.equals("수")) return 3;
//			else if(week.equals("목")) return 4;
//			else if(week.equals("금")) return 5;
//			else if(week.equals("토")) return 6;
//			else return 0;
//		}
		
		public void runPrompt() {
			Scanner scanner = new Scanner(System.in);
			AboutCalendar cal1 = new AboutCalendar();
			
			int month = 1;
			int year = 1000;
			
			while(true) {
				
			System.out.println("년도를 입력하시고 엔터하세요");
			System.out.print(PROMPT);
			year = scanner.nextInt();
					
				
			System.out.println("달을 입력하시고 엔터하세요(종료 원할시 : -1)");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			
//			System.out.println("첫번째 요일을 입력하세요!");
//			System.out.print(PROMPT);
//			String firstDay = scanner.next();
//			int week = startDay(firstDay);
			
			if(month > 12) {
				System.out.println("옳지 않습니다, 다른 숫자를 입력하세요.");
				continue;
			}
			
			if(month == -1) {
				break;
			}
						
			cal1.printCalendar(year, month);
			
		}
			System.out.print("프로그램 종료");
	}
				
}

