package labs;

import java.util.Scanner;

public class MakeChange {
		public static void main(String[] args) {
				Scanner scanner = new Scanner (System.in);
				
				int numOfPennies;
				int numOfNickels;
				int numOfDimes; 
				int numOfQuarters; 
				int numOfOnes; 
				int numOfFives;
				int numOfTens; 
				int numOfTwenties;
				
				
				printMenu();
				double itemPrice = scanner.nextDouble();
				
//				this is user story 1 ^
				
				printMenu2();
				double cashInserted = scanner.nextDouble();
				
//				this is user story 2 ^
				
				
				while (itemPrice > cashInserted) {
					System.out.println("=====================================");
					System.out.println("                                     ");
					System.out.println("    You have not fed me enough $$$.  ");
					System.out.println("    How much cash are you paying     ");
					System.out.println("               with today?           ");
					System.out.println("                                     ");
					System.out.println("=====================================");
					cashInserted = scanner.nextDouble();
					
				}
				
				if (itemPrice == cashInserted) {
					printMenu3();
				}
//				this is user story 3
			
				double changeExpected  = (cashInserted* 100)- (itemPrice*100);
				
				scanner.close();
				
//				System.out.println("Changed Expected ( in pennies ): " + changeExpected);
				
//				^^ added this in only to see what the issue was and to see what the program is calculating
				
				
				numOfTwenties = (int) Math.floor(changeExpected/2_000);
				numOfTens = (int) Math.floor((changeExpected - (numOfTwenties* 2_000))/1_000);
				numOfFives = (int) Math.floor((changeExpected- (numOfTwenties* 2_000) - (numOfTens* 1_000))/500);
				numOfOnes = (int) Math.floor((changeExpected - (numOfTwenties*2_000) - (numOfTens* 1_000) - (numOfFives* 500))/100);
		        
				double penniesLeft = (changeExpected) - (numOfTwenties*2_000) - (numOfTens*1_000) - (numOfFives*500) - (numOfOnes*100);
//				System.out.println("Coins left (in pennies) : " + penniesLeft);
				numOfQuarters =  (int) Math.floor(penniesLeft/25);
				
				double penniesLeft2 = (changeExpected) - (numOfTwenties*2_000) - (numOfTens*1_000) - (numOfFives*500) - (numOfOnes*100) - (numOfQuarters*25);
//				System.out.println("Coins left (in pennies) after the quarters get taken away : " + penniesLeft2);
				numOfDimes = (int) Math.floor(penniesLeft2/10);
				
				double penniesLeft3 = (penniesLeft2- (numOfDimes*10));
				numOfNickels = (int) Math.floor(penniesLeft3/5);
				
				double penniesLeft4 = (penniesLeft3 - (numOfNickels*5));
				numOfPennies = (int) Math.floor(penniesLeft4);
				
//				This is to return the largest bill/coin less than or equal to what is changeExpected,
//				before moving onto the next lower bill and repeating. 

				
				
				
				if (changeExpected > 0) {
					System.out.println("=====================================");
					System.out.println("                                     ");
					System.out.println("        Your change will be:         ");
				}
				
				if (numOfTwenties > 0)
				{
					System.out.println(numOfTwenties + " $20's");
				}
					
				if (numOfTens > 0)
				{
					System.out.println(numOfTens + " $10's");
				}
					
				if (numOfFives > 0)
				{
					System.out.println(numOfFives + " 5's");
				}	
				
				if (numOfOnes > 0)
				{
					System.out.println(numOfOnes + " $1's");
				}	
				
				if (numOfQuarters > 0)
				{
					System.out.println(numOfQuarters + " quarters");
				}	
					
				if (numOfDimes > 0)
				{
					System.out.println(numOfDimes + " dimes");
				}
				
				if (numOfNickels > 0)
				{
					System.out.println(numOfNickels + " nickels");
				}
				
				if (numOfPennies > 0)
				{
					System.out.println(numOfPennies + " pennies");
				}
				if (changeExpected > 0) { 
					System.out.println("                                     ");
					System.out.println("===============GOODBYE===============");
				}
				}

			
			public static void printMenu() {
				System.out.println();
				System.out.println("============HELLO THERE==============");
				System.out.println("                                     ");
				System.out.println(" Welcome to Christinas Coconut Stand!");
				System.out.println(" Please enter the price of your item:");
				System.out.println("                                     ");
				System.out.println("=====================================");
				System.out.println();
			}
				
			public static void printMenu2() {
				System.out.println();
				System.out.println("=====================================");
				System.out.println("                                     ");
				System.out.println("    How much cash are you paying     ");
				System.out.println("            with today?              ");
				System.out.println("                                     ");
				System.out.println("=====================================");
				System.out.println();
			}
			
			public static void printMenu3() {
				System.out.println();
				System.out.println("=====================================");
				System.out.println("                                     ");
				System.out.println("    You have entered exact change!   ");
				System.out.println("    You will receive no change back  ");
				System.out.println("                                     ");
				System.out.println("=============GOODBYE=================");
				System.out.println();
			}
			
					}