import java.io.*;

/*
 * Instance variables
 */

public class Histograms {
	static int score0 = 0;
	static int score1 = 0;
	static int score2 = 0;
	static int score3 = 0;
	static int score4 = 0;
	static int score5 = 0;
	static int score6 = 0;
	static int score7 = 0;
	static int score8 = 0;
	static int score9 = 0;
	static int score10 = 0;
	static String tempString = "";

	/*
	 * Main method. Fairly self explanatory.
	 */

	public static void main(String[] args) {
		try {
			File midtermScores = new File("MidtermScores.txt");
			FileReader fileScan = new FileReader(midtermScores);
			BufferedReader bufferRead = new BufferedReader(fileScan);
			while ((tempString = bufferRead.readLine()) != null) {
				int score = Integer.parseInt(tempString);
				if (score < 10) {
					score0++;
				} else if (score < 20) {
					score1++;
				} else if (score < 30) {
					score2++;
				} else if (score < 40) {
					score3++;
				} else if (score < 50) {
					score4++;
				} else if (score < 60) {
					score5++;
				} else if (score < 70) {
					score6++;
				} else if (score < 80) {
					score7++;
				} else if (score < 90) {
					score8++;
				} else if (score < 100) {
					score9++;
				} else if (score == 100) {
					score10++;
				}
			}
			System.out.println("00-09: " + scoreString(score0));
			System.out.println("10-19: " + scoreString(score1));
			System.out.println("20-29: " + scoreString(score2));
			System.out.println("30-39: " + scoreString(score3));
			System.out.println("40-49: " + scoreString(score4));
			System.out.println("50-59: " + scoreString(score5));
			System.out.println("60-69: " + scoreString(score6));
			System.out.println("70-79: " + scoreString(score7));
			System.out.println("80-89: " + scoreString(score8));
			System.out.println("90-99: " + scoreString(score9));
			System.out.println("  100: " + scoreString(score10));
			bufferRead.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Incorrect type.");
		}
	}

	/*
	 * Class methods
	 */

	public static String scoreString(int x) {
		String scoreList = "";
		for (int i = 0; i < x; i++) {
			scoreList += "*";
		}
		return scoreList;
	}
}