package newcalendar;

import java.util.Scanner;

public class AboutPrompt {
		private final static String PROMPT = "Cal> ";
		
		public void runPrompt() {
			Scanner scanner = new Scanner(System.in);
			AboutCalendar cal1 = new AboutCalendar();
			
			int month = 1;
			int year = 1000;
			
			while(true) {
				
			System.out.println("년도를 입력하시고 엔터하세요(종료 원할시 : -1)");
			System.out.print(PROMPT);
			year = scanner.nextInt();
					
				
			System.out.println("달을 입력하시고 엔터하세요(종료 원할시 : -1)");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			
			
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

