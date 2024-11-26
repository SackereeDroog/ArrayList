package arrayListDemo;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class pokemonAL extends ArrayList<pokemon>
{	
	public static pokemonAL quickSortName(pokemonAL list)
	{
		
		if (list.isEmpty()) 
	        return list; // start with recursion base case
	    pokemonAL sorted;  // this shall be the sorted list to return, no needd to initialise
	    pokemonAL smaller = new pokemonAL(); // Vehicles smaller than pivot
	    pokemonAL greater = new pokemonAL(); // Vehicles greater than pivot
	    pokemon pivot = list.get(0);  // first row in list, used as pivot
	    int i;
	    pokemon j;     // Variable used for Vehicles in the loop
	    for (i=1;i<list.size();i++)
	    {
	        j=list.get(i);
	        if (j.getName().compareTo(pivot.getName())<0)   // make sure Vehicle has proper compareTo method 
	            smaller.add(j);
	        else
	            greater.add(j);
	    }
	    smaller=quickSortName(smaller);  
	    greater=quickSortName(greater);  
	    smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Vehicles
	    smaller.addAll(greater);     // add the (now sorted) greater Vehicles to the smaller ones (now smaller is essentially your sorted list)
	    sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

	    return sorted;
		
	}

	public void sortByName(){
		
		pokemonAL sorted;
		sorted = quickSortName(this);
		if (sorted != null){
			System.out.println("Here is the Gen 1 Pokemon sorted by Name in Alphabetical order:");
		}
		
		sorted.printList();
	}
	
	public static pokemonAL quickSortTotal(pokemonAL list)
	{
		
		if (list.isEmpty()) 
	        return list; // start with recursion base case
	    pokemonAL sorted;  // this shall be the sorted list to return, no need to initialize
	    pokemonAL smaller = new pokemonAL(); // Vehicles smaller than pivot
	    pokemonAL greater = new pokemonAL(); // Vehicles greater than pivot
	    pokemon pivot = list.get(0);  // first row in list, used as pivot
	    int i;
	    pokemon j;     // Variable used for Vehicles in the loop
	    for (i=1;i<list.size();i++)
	    {
	        j=list.get(i);
	        if (j.getTotalStats() > pivot.getTotalStats())   // make sure Vehicle has proper compareTo method 
	            smaller.add(j);
	        else
	            greater.add(j);
	    }
	    smaller=quickSortTotal(smaller);  
	    greater=quickSortTotal(greater);  
	    smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Vehicles
	    smaller.addAll(greater);     // add the (now sorted) greater Vehicles to the smaller ones (now smaller is essentially your sorted list)
	    sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

	    return sorted;
		
	}
	
	public void sortByTotal(){
		
		pokemonAL sorted;
		sorted = quickSortTotal(this);
		
		
		sorted.printList();
	}

	public static pokemonAL quickSortHp(pokemonAL list)
	{
		
		if (list.isEmpty()) 
	        return list; // start with recursion base case
	    pokemonAL sorted;  // this shall be the sorted list to return, no need to initialize
	    pokemonAL smaller = new pokemonAL(); // Vehicles smaller than pivot
	    pokemonAL greater = new pokemonAL(); // Vehicles greater than pivot
	    pokemon pivot = list.get(0);  // first row in list, used as pivot
	    int i;
	    pokemon j;     // Variable used for Vehicles in the loop
	    for (i=1;i<list.size();i++)
	    {
	        j=list.get(i);
	        if (j.getTotalStats() > pivot.getTotalStats())   // make sure Vehicle has proper compareTo method 
	            smaller.add(j);
	        else
	            greater.add(j);
	    }
	    smaller=quickSortHp(smaller);  
	    greater=quickSortHp(greater);  
	    smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Vehicles
	    smaller.addAll(greater);     // add the (now sorted) greater Vehicles to the smaller ones (now smaller is essentially your sorted list)
	    sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

	    return sorted;
		
	}
	
	public void sortByHp(){
		
		pokemonAL sorted;
		sorted = quickSortHp(this);
		
		sorted.printList();
	}
	
	public static pokemonAL quickSortAttack(pokemonAL list)
	{
		
		if (list.isEmpty()) 
	        return list; // start with recursion base case
	    pokemonAL sorted;  // this shall be the sorted list to return, no need to initialize
	    pokemonAL smaller = new pokemonAL(); // Vehicles smaller than pivot
	    pokemonAL greater = new pokemonAL(); // Vehicles greater than pivot
	    pokemon pivot = list.get(0);  // first row in list, used as pivot
	    int i;
	    pokemon j;     // Variable used for Vehicles in the loop
	    for (i=1;i<list.size();i++)
	    {
	        j=list.get(i);
	        if (j.getAttack() > pivot.getAttack())   // make sure Vehicle has proper compareTo method 
	            smaller.add(j);
	        else
	            greater.add(j);
	    }
	    smaller=quickSortAttack(smaller);  
	    greater=quickSortAttack(greater);  
	    smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Vehicles
	    smaller.addAll(greater);     // add the (now sorted) greater Vehicles to the smaller ones (now smaller is essentially your sorted list)
	    sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

	    return sorted;
		
	}
	
	public void sortByAttack(){
		
		pokemonAL sorted;
		sorted = quickSortAttack(this);
		
		sorted.printList();
	}

	public static pokemonAL quickSortDefence(pokemonAL list)
	{
		
		if (list.isEmpty()) 
	        return list; // start with recursion base case
	    pokemonAL sorted;  // this shall be the sorted list to return, no need to initialize
	    pokemonAL smaller = new pokemonAL(); // Vehicles smaller than pivot
	    pokemonAL greater = new pokemonAL(); // Vehicles greater than pivot
	    pokemon pivot = list.get(0);  // first row in list, used as pivot
	    int i;
	    pokemon j;     // Variable used for Vehicles in the loop
	    for (i=1;i<list.size();i++)
	    {
	        j=list.get(i);
	        if (j.getDefence() > pivot.getDefence())   // make sure Vehicle has proper compareTo method 
	            smaller.add(j);
	        else
	            greater.add(j);
	    }
	    smaller=quickSortAttack(smaller);  
	    greater=quickSortAttack(greater);  
	    smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Vehicles
	    smaller.addAll(greater);     // add the (now sorted) greater Vehicles to the smaller ones (now smaller is essentially your sorted list)
	    sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

	    return sorted;
		
	}
	
	public void sortByDefence(){
		
		pokemonAL sorted;
		sorted = quickSortAttack(this);
		
		sorted.printList();
	}

	public static pokemonAL sort(pokemonAL list, String filter){
		
		
		if (list.isEmpty()) 
	        return list; // start with recursion base case
	    pokemonAL sorted;  // this shall be the sorted list to return, no need to initialize
	    pokemonAL smaller = new pokemonAL(); // Vehicles smaller than pivot
	    pokemonAL greater = new pokemonAL(); // Vehicles greater than pivot
	    pokemon pivot = list.get(0);  // first row in list, used as pivot

		
	    int i;
	    pokemon j;     // Variable used for Vehicles in the loop
	    
	    Object val1 = j.getClass().;
	    
	    for (i=1;i<list.size();i++)
	    {
	    	Object val2;
	        j=list.get(i);
	        if (j.getName().compareTo(pivot.getName())<0)   // make sure Vehicle has proper compareTo method 
	            smaller.add(j);
	        else
	            greater.add(j);
	    }
	    smaller=quickSortName(smaller);  
	    greater=quickSortName(greater);  
	    smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Vehicles
	    smaller.addAll(greater);     // add the (now sorted) greater Vehicles to the smaller ones (now smaller is essentially your sorted list)
	    sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

	    return sorted;
	}
	
	public void filterByType(String type){
		
		
		pokemonAL unfiltered = this;
		pokemonAL filtered = new pokemonAL();
		int count = 0;
		
		type = type.toUpperCase();

		System.out.println("Filter: " + type + " types");
		
		for( int i = 0; i < unfiltered.size(); i++){
			if(unfiltered.get(i).getType1().toUpperCase().equals(type)  || unfiltered.get(i).getType2().toUpperCase().equals(type)){
				filtered.add(unfiltered.get(i));
				count++;
			}
		}
		if(filtered.size() ==0){
			System.out.println("Could not find any "+type+ " type Pokemon.");
		}else{
			System.out.println("Found "+count+" "+type+ " type Pokemon.");
		}
		filtered.printList();
	}

	public void filterByName(String name){
		
		
		pokemonAL unfiltered = this;
		pokemonAL filtered = new pokemonAL();
		int count = 0;
		
		name = name.toUpperCase();

		System.out.println("Filter: " + name + " in name");
		
		for( int i = 0; i < unfiltered.size(); i++){
			if(unfiltered.get(i).getName().toUpperCase().indexOf(name)>-1){
				filtered.add(unfiltered.get(i));
				count++;
			}
		}
		if(filtered.size() ==0){
			System.out.println("Could not find any "+name+ " named Pokemon.");
		}else{
			System.out.println("Found "+count+" "+name+ " named Pokemon.");
		}
		filtered.printList();
	}
	

	
	public void printList(){
		if (this != null){
			for(pokemon poke: this){
				System.out.println(poke.toString());
			}
			System.out.println("\n\n");
		}
	}
}
