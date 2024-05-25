import java.util.HashMap;
import java.util.Scanner;
public class GpaCalc {
	private static HashMap<String, Double> gradeMap = new HashMap<>();
	public static void main(String[] args) {
		gradeMap.put("a+", 10d);
        gradeMap.put("a", 9d);
        gradeMap.put("b+", 8d);
        gradeMap.put("b", 7d);
        gradeMap.put("c+", 6d);
        gradeMap.put("c", 5d);
        gradeMap.put("d", 4d);
        gradeMap.put("e", 0d);
        gradeMap.put("f", 0d);
        gradeMap.put("i", 0d);
		Scanner sc = new Scanner(System.in);
		System.out.print("Total Subjects: ");
		int n = sc.nextInt();
		double maxObtained = 0;
		double totalObtained = 0;
		String currGrade = "";
		int currCredit = 0;
		for(int i = 0; i < n; i++) {
			currGrade = "0";
			do {
				System.out.print("Grade for subject " + (i + 1) + ": ");
				currGrade = sc.next().toLowerCase();
				if(gradeMap.containsKey(currGrade) == false) {
					System.out.println("Error: invalid grade");
				}
			}while(gradeMap.containsKey(currGrade) == false);
			System.out.print("Total credit for subject " + (i+1) + ": ");
			currCredit = sc.nextInt();
			maxObtained += currCredit*10;
			totalObtained += gradeMap.get(currGrade) * currCredit;
		}
		System.out.println("GPA: " +String.format( "%.2f", (totalObtained/maxObtained*10)));
		sc.close();
	}
}
