package newcalendar;

public class Calendar {

	public static void main(String[] args) {

		String[] month = { "일", "월", "화", "수", "목", "금", "토" };
		int[][] days = { 
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 8, 9, 10, 11, 12, 13, 14 }, 
				{ 15, 16, 17, 18, 19, 20, 21 },
				{ 22, 23, 24, 25, 26, 27, 28 } 
				};

		for (int i = 0; i < 7; i++) {
			System.out.print(month[i] + " ");
		}
		System.out.println("");
		System.out.print("--------------------");
		System.out.println("");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(days[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
