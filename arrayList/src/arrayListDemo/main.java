package arrayListDemo;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) //throws IOException
	{
		pokemonAL mons = pokemon.loadPokemon();
		Boolean start = true;
		//system "UI"
		printTitle();
		
		
		System.out.println("Welcome to the 1st Generation Pokemon Database! What would you like to do?\n>>>");
		
		while(start){
		
		Scanner task = new Scanner(System.in);
		String input = task.nextLine().toString().toLowerCase();
		
		
		
		
		
		if (input.indexOf("sort") > -1){
			if (input.indexOf("name") > -1){
				mons.sortByName();
			}
		}else if (input.indexOf("filter")>-1||input.indexOf("find")>-1){
			if (input.indexOf("type")>-1){
				if(input.indexOf("grass")>-1){
					mons.filterByType("grass");
				}
			}
		}else if(input.indexOf("quit")>-1){
			start = false;
			break;
		}else{
			System.out.println("For a list of commands, please type \"help\"");
			
		}
		
		System.out.println("What else would you like to do? \n>>>");
		}
		
		System.out.println("Thank you, Have a nice day :)");
		printTitle();
		}
	
	
	public static void printTitle(){
		System.out.println("\n--------------------------------------------------------------------");
		System.out.println("                                  ,'\\\n    _.----.        ____         ,'  _\\   ___    ___     ____\n_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n                                `'                            '-._|\n--------------------------------------------------------------------");
	
	}
	
}
class MyClass{
	private String myField;
}
