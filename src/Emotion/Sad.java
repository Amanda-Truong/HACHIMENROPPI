package Emotion;
import java.util.Scanner;
public class Sad 
{
	Scanner sc = new Scanner(System.in);
	String roppi;
	String rei;
	String answer;
	private boolean badDay = false;
	public boolean badDay()
	{
		return badDay;
	}
	public String crying(String rei)
	{
		rei = rei.toLowerCase();
		if(rei.contains("yes")|| rei.contains("i am")||rei.contains("yea"))
		{
			return ("ROPPI: Damn, this is why I hate Humans.");
		}
		else //if(answer.contains("no"))
		{
			return ("ROPPI: Well that's good I guess...");
		}
	}
	public String okay(String rei)
	{
		rei.toLowerCase();
		if(rei.contains("yes")||rei.contains("okay")||rei.contains("fine")||rei.contains("yea")|| rei.contains("i will"))
		{
			return "ROPPI: Okay, if you say so...\n";
		}
		else
		{
			badDay = true;
			return "ROPPI: That's horrible!\nROPPI: Are you alright? You're not crying are you?\nREI: ";
		}
	}
	
}
