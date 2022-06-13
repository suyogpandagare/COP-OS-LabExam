//4). Get below Main compile and run correctly by writing Player class (13 Marks)

	

public class Main {
	public static void main(String [] args)
	{
		//Every player has name, matches_played and total_runs attributes
		Player dhoni = new Player("Dhoni", 350, 10773);
		Player virat = new Player("Virat", 183, 8389);
		
		//If below line un-commented, it should be compile time error 
		//Player p3 = new Player();
		
		if ( dhoni.getAverageRuns() > virat.getAverageRuns() )
			System.out.println(dhoni);
		else
			System.out.println(virat);
	}		
}

