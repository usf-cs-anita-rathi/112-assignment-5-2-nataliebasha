public class StudentRecordDemo
{
	public static void main(String[] args)
	{
		StudentRecord student;
		student= new StudentRecord();
		student.quiz1= 9;
		student.quiz2= 8;
		student.quiz3= 6;
		student.finalExam= 75;
		student.midterm=90;
		student.numericGrade();
		student.finalLetter();
	}
}