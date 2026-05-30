import java.util.*;

public class Module1CaseStudy1BSIT27ASUS{ //variable declaration 
    public ArrayList<Integer> allScores; 
    public ArrayList<ArrayList<Integer>> sectionScores;

    public Module1CaseStudy1BSIT27ASUS() { //Constructor
        this.allScores = new ArrayList<>();
        this.sectionScores = new ArrayList<>();
    }

    public void addScoreSection(int numScores) { //Method for adding Scores per Section 
        ArrayList<Integer> sectionScore = new ArrayList<>(); 
        Scanner sectionInput = new Scanner(System.in);
        
		for (int cycleOne = 0; cycleOne < numScores; cycleOne++) {
            System.out.print("Enter exam score for section " + (sectionScores.size() + 1) + ": ");
            int score = sectionInput.nextInt();
            sectionScore.add(score);
            allScores.add(score);
			 
		} 	
		
        sectionScores.add(sectionScore);
    } //end of addScoreSection

    public double calculateAverage() { //Method for calculating the Average of all Scores 
        int sum = 0;
        for (int score : allScores) {
            sum += score;
        }
        return (double) sum / allScores.size();
       
    } //end of calculateAverage

    public ArrayList<Double> calculateSectionAverages() { //Method for calculating the Average per Section using data type double in ArrayList
        ArrayList<Double> averages = new ArrayList<>();
		for (int cycleTwo = 0; cycleTwo < sectionScores.size(); cycleTwo++) {
            ArrayList<Integer> sectionScore = sectionScores.get(cycleTwo);
            int sum = 0;
            for (int score : sectionScore) {
                sum += score;
            }
            averages.add((double) sum / sectionScore.size()); 
        }
		return averages;
    } //end of calculateSectionAverages

    public int findHighestScore() { //Method for finding highest score in all sections 
        int highestScore = allScores.get(0);
        for (int score : allScores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }
		return highestScore;
    } //end of findHighestScore

    public int findLowestScore() { //Method for finding lowest score in all sections 
        int lowestScore = allScores.get(0);
        for (int score : allScores) {
            if (score < lowestScore) {
                lowestScore = score;
            }
        }
        return lowestScore;
    } //end of findLowestScore

    public int findMode() { //Method for finding the most score number repeated in all sections 
        int maxCount = 0;
        int mode = 0;
        for (int score : allScores) {
            int count = 0;
            for (int otherScore : allScores) {
                if (otherScore == score) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = score;
            }
        }
        return mode;
    } //end of findMode

    public double findMedian() { //Method for finding the middle score numbers of all sections 
        ArrayList<Integer> sortedScores = new ArrayList<>(allScores);
        Collections.sort(sortedScores);
        int middleIndex = sortedScores.size() / 2;
        double median;
        if (sortedScores.size() % 2 == 0) {
            median = (sortedScores.get(middleIndex - 1)  + sortedScores.get(middleIndex)) / 2.0; //even
        } else {
            median = sortedScores.get(middleIndex); //odd
        }
        return median;
    } //end of findMedian

    public static void main(String[] args) {
        Module1CaseStudy1BSIT27ASUS analyzeList = new Module1CaseStudy1BSIT27ASUS();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of sections: ");
        int numSections = userInput.nextInt();
        for (int cycleThree = 0; cycleThree < numSections; cycleThree++) {
            System.out.print("Enter number of students in section " + (cycleThree + 1) + ": ");
            int numStudents = userInput.nextInt();
            analyzeList.addScoreSection(numStudents);
        }
		
		double average = analyzeList.calculateAverage();
		ArrayList<Double> sectionAverages = analyzeList.calculateSectionAverages();
		int highestScore = analyzeList.findHighestScore();
		int lowestScore = analyzeList.findLowestScore();
		int mode = analyzeList.findMode();
		double median = analyzeList.findMedian();
		
        System.out.println("The average exam score for each individual section: ");
		for(int cycleFour = 0; cycleFour < sectionAverages.size(); cycleFour++) {
			System.out.println("Section " + (cycleFour + 1) + ": " + sectionAverages.get(cycleFour));
		}
		
		System.out.println("The average exam score for all the students in all sections: " + average);
		System.out.println("The highest exam score among all sections: " + highestScore);
		System.out.println("The lowest exam score among all sections: " + lowestScore);
		System.out.println("The exam score that appears most frequently among all sections: " + mode);
		System.out.println("The middle exam score among all sections: " + median);
		
    } //end of main method
} //end of class 