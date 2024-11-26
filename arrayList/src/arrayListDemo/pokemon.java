package arrayListDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class pokemon {
	
	private int id;
	private String name;
	private String type1;
	private String type2;
	private int totalStats;
	private int hp;
	private int attack;
	private int defence;
	private int specialAttack;
	private int specialDefence;
	private int speed;
	private int generation;
	private boolean legendary;

	
	public static pokemonAL loadPokemon() //throws IOException
	{
		pokemonAL pokemen = new pokemonAL();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\pokemon.txt"));
			try
			{
				String line = br.readLine();
				
				while (line != null) {
					pokemen.add(new pokemon(line));
					line = br.readLine();
					
				}
			}finally {
				br.close();
			}
		}catch(Exception e){
			System.out.println("shit.");
			pokemen = null;
		}
		return pokemen;
	}
	
	public pokemon(String data){
		String[] items = data.split(",");
		id = Integer.parseInt(items[0]);
		name = items[1].trim();
		type1 = items[2].trim();
		type2  = items[3].trim();
		totalStats = Integer.parseInt(items[4]);
		hp = Integer.parseInt(items[5]);
		attack = Integer.parseInt(items[6]);
		defence = Integer.parseInt(items[7]);
		specialAttack = Integer.parseInt(items[8]);
		specialDefence = Integer.parseInt(items[9]);
		speed = Integer.parseInt(items[10]);
		generation = Integer.parseInt(items[11]);
		legendary = Boolean.parseBoolean(items[12]);
		
	}
	
	public String toString(){
		String r = "";
		r += String.format("%6s   ", id);
		r += String.format("%-12s", name);
		r += String.format("%10s   ", type1);
		r += String.format("%-10s", type2);
		r += String.format("%-5s", totalStats);
		r += String.format("%-5s", hp);
		r += String.format("%-5s", attack);
		r += String.format("%-5s", defence);
		r += String.format("%-5s", specialAttack);
		r += String.format("%-5s", specialDefence);
		r += String.format("%-5s", speed);
		//r += String.format("%-8s", generation);
		r += String.format("%-8s", legendary);
		
		return r;
	}
	
	
	
	

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getType1(){
		return type1;
	}
	public String getType2(){
		return type2;
	}
	public int getTotalStats(){
		return totalStats;
	}
	public int getHp(){
		return hp;
	}
	public int getAttack(){
		return attack;
	}
	public int getDefence(){
		return defence;
	}
	public int getSpecialAttack(){
		return specialAttack;
	}
	public int getSpecialDefence(){
		return specialDefence;
	}
	public int getSpeed(){
		return speed;
	}
	public boolean legendary(){
		return legendary;
	}
		
	
}