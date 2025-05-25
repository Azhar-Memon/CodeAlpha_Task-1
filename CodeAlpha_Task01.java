package codealpha;
import java.util.Scanner;

class Stu_Gr_Calc //Class to do all the calculations
{
	Scanner inp = new Scanner (System.in); //Takes input user
	int no_of_subs; // Saves total nos of subjects
	int [] marks; //Array declaration
	
	
	int subs() // Inputs the num of subjects from user and variable declares the length of array to store marks
	{
		System.out.print("Enter The Number Of Subjects: ");
		no_of_subs = inp.nextInt();
		marks = new int [no_of_subs];
		return no_of_subs;
	}
	
	
	void marks_each_sub() // Takes user input to input marks for each subject and stores in the marks array
	{
		for (int i=0; i<no_of_subs; i++)
		{
			System.out.print("Enter Marks For The #" +(i+1) +" Subject: ");
			 marks[i] = inp.nextInt(); 
		}
	}
	
	
	float average() // Calculates average of marks array
	{
		float sum =0;
		for(int i=0; i<no_of_subs; i++)
		{
		sum = sum + marks[i];
		}
		float average = sum/no_of_subs;
		return average;
	}
	
	
	int max_marks() // Calculates and displays the Highest Score among all the inputted marks 
	{
		int max = marks[0];
		for(int i=1; i<no_of_subs; i++)
		{
			if(marks[i]>max)
			{
				max = marks[i];
			}
		}
		return max;
	}
	
	
	int min_marks() // Calculates and displays the Lowest Score among all the inputted marks 
	{
		int min = marks[0];
		for(int i=1; i<no_of_subs; i++)
		{
			if(marks[i]<min)
			{
				min = marks[i];
			}
		}
		return min;
	}
	
}


public class CodeAlpha_Task01 {

	public static void main(String[] args) {

Stu_Gr_Calc a = new Stu_Gr_Calc(); // Object for the Stu_Gr_Calc Class
System.out.println("----------STUDENT GRADE CALCULATOR----------");
System.out.println("");
a.subs(); // Calls subjects function to input num of subjects
a.marks_each_sub(); // Calls marks function to input marks for the entered number of subjects
System.out.println("");
System.out.println("----------OUTPUT----------");
System.out.println("");
System.out.println("Average: "+a.average() +"%"); // Calls average function to display the average
System.out.println("Highest Score: " +a.max_marks() +" Marks"); // Calls maximum score inputted function and displays it
System.out.println("Lowest Score: " +a.min_marks()+" Marks"); // Calls minimum score inputted function and displays it
	}

}
