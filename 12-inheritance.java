import java.util.Scanner;


class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
}

class Student extends Person {
    private int[] testScores;
    
    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate() {
        int sumScores = 0;
        float scoreAverage;
        for (int score: testScores) {
            sumScores += score;
        }
        scoreAverage = sumScores / testScores.length;

        if ((scoreAverage >= 90) && (scoreAverage <= 100)) {
            return 'O';
        }
        else if ((scoreAverage >= 80) && (scoreAverage < 90)) {
            return 'E';
        }
        else if ((scoreAverage >= 70) && (scoreAverage < 80)) {
            return 'A';
        }
        else if ((scoreAverage >= 55) && (scoreAverage < 70)) {
            return 'P';
        }
        else if ((scoreAverage >=  40) && (scoreAverage < 55)) {
            return 'D';
        }
        else if ((scoreAverage >= 0) && (scoreAverage < 40)) {
            return 'T';
        }
        else {
            return 0;
        }
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}