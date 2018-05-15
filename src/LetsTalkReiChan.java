import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Emotion.Sad;

public class LetsTalkReiChan 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		try
		{
			Scanner sc = new Scanner(System.in);
			PrintWriter pw = new PrintWriter(new File("converse.txt"));
			boolean quit = false;

			System.out.println("\t~<REI has logged on>~");
			System.out.println("\t~<ROPPI has logged on>~");
			System.out.println("ROPPI: Hello Rei, how are you?");
			
			pw.println("\t~<REI has logged on>~");
			pw.println("\t~<ROPPI has logged off>~");
			pw.println("ROPPI: Hello Rei, how are you?");
			
//////////////////////////THE CONVERSATION HAS STARTED///////////////////////////////
			
			String responce = "";
			do
			{
				System.out.print("REI: ");
				pw.print("REI: ");
				responce = sc.nextLine();
				pw.println(responce);
				responce = responce.toLowerCase();
			//end conversation
				if(responce.contains("bye")||responce.contains(" all") || responce.contains("see ya") || responce.contains("talk to you later"))
				{
					quit = true;
				}
				
			//feeling sad today
				else if(responce.contains("sad")||responce.contains("down"))
				{
					String rei = "";
					Sad sad = new Sad();
					System.out.print("ROPPI: What happened?\nREI: ");
					pw.print("ROPPI: What happened?\nREI: ");
					rei = sc.nextLine();
					pw.println(rei);
					
					System.out.print("ROPPI: I see... Will you be alright?\n"
							+ "ROPPI: I can stay a while and chat it out if needed.\nREI: ");
		
					pw.print("ROPPI: I see... Will you be alright?\n"
							+ "ROPPI: I can stay a while and chat it out if needed.\nREI: ");
					
					rei = sc.nextLine();
					pw.println(rei);
					System.out.print(sad.okay(rei));
					pw.print(sad.okay(rei));
					if(sad.badDay())
					{
						rei = sc.nextLine();
						pw.print(rei);
						System.out.println(sad.crying(rei));
						pw.print(sad.crying(rei));
					}
					//explain();
					System.out.println("ROPPI: What else happened? I still got time to talk.");
					pw.println("ROPPI: What else happened? I still got time to talk.");
				}
			//something happened with dad...
				else if(responce.contains("dad")|| responce.contains("parents"))
				{
					
				}
		//GENERAL FILLER CONVERSATION//
				else if(responce.contains("thank"))
				{
					System.out.println("ROPPI: Oh, no need to thank me.  I'm just trying to support.");
					System.out.println("ROPPI: We are here for you after all.  So go ahead a talk if you like.");
					pw.println("ROPPI: Oh, no need to thank me.  I'm just trying to support.");
					pw.println("ROPPI: We are here for you after all.  So go ahead and talk if you like.");
				}
				else if(responce.contains("hi roppi")|| responce.contains("hello roppi"))
				{
					System.out.println("ROPPI: What's up? You usually come to me when there's a problem...");
					pw.println("ROPPI: What's up? You usually come to me when there's a problem.");
				}
				else
				{
					System.out.println("ROPPI: Are you sure?\nROPPI: I am here to talk you know.");
					pw.println("ROPPI: Are you sure?\nROPPI: I am here to talk you know.");
				}
			}
			while(!quit);
			System.out.println("ROPPI: Oh, alright then. I'm here whenever you need me to Rei-chan.");
			System.out.println("ROPPI: Stay safe alright.\nROPPI: And Tsuki sends his support.");
			System.out.println("\t~<ROPPI has logged off>~");
			System.out.println("\t~<REI has logged off>~");
			pw.println("ROPPI: Oh, alright then. I'm here whenever you need me to Rei.");
			pw.println("ROPPI: Stay safe alright.\nROPPI: And Tsuki sends his support.");
			pw.println("\t~<ROPPI has logged off>~");
			pw.println("\t~<REI has logged off>~");
			sc.close();
			pw.close();
		}

		catch(FileNotFoundException x)
		{
			System.out.println("ROPPI: Oh, Rei-chan, you don't have our conversing file.\nROPPI: Could you find it before we start?");
			System.exit(0);
		}
	}
	public static void continuingConversation()
	{
		
	}
}