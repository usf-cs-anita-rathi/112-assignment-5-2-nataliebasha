import java.util.Scanner;
import java.lang.Math;
public class StudentRecord
{
	public int quiz1,quiz2,quiz3,midterm,finalExam;
	public double overallGrade, quizAvg;
	public String finalLetterGrade;
		public void numericGrade()
		{
			System.out.println("Quiz 1 score: "+quiz1);
			System.out.println("Quiz 2 score: "+quiz2);
			System.out.println("Quiz 3 score: "+quiz3);
			System.out.println("Midterm score: "+midterm);	
			System.out.println("Final Exam score: "+finalExam);

			quizAvg=(((quiz1*100)/10)+((quiz2*100)/10+(quiz3*100)/10)/3);
			System.out.println();
			overallGrade= ((finalExam*40)+(midterm*35)+quizAvg);
		}

		public void finalLetter()
		{
			if (overallGrade >90)
			{
				System.out.println("The student got an A!");
			}
			else if (overallGrade<90 && overallGrade > 80) 
			{
				System.out.println("The student got a B!");
			}
			else if (overallGrade< 80 && overallGrade> 70) 
			{
				System.out.println("The student got a C!");
			}
			else if (overallGrade< 70 && overallGrade > 60) 
			{
				System.out.println("The student got a D!:(");
			}
			else if (overallGrade< 60) 
			{
				System.out.println("The student got an F...:[");
			}
		}
		public boolean equals(StudentRecord student)
			{
				if((finalLetterGrade.equals(student.finalLetterGrade)))
					return true;
				else
					return false;
			}
			
		public String toString() 
    		{ 
        		return quiz1 + " " + quiz2 + " " + quiz3 + " " + midterm + " " + finalExam+ " " +overallGrade;
    		}
}