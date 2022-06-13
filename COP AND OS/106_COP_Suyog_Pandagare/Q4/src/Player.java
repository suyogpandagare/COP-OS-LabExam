

public class Player {
	
		private String name;
		private int matches_played;
		private int total_runs;
		
		public Player(String name, int matches_played, int total_runs)       //parameterised constructor
		{
			this.name = name;
			this.matches_played = matches_played;
			this.total_runs = total_runs;
		}
		
		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMatches_played() {
			return this.matches_played;
		}

		public void setMatches_played(int matches_played) {
			this.matches_played = matches_played;
		}

		public int getTotal_runs() {
			return this.total_runs;
		}

		public void setTotal_runs(int total_runs) {
			this.total_runs = total_runs;
		}
		
		public float getAverageRuns() {
			float avgRunsScored = this.total_runs / this.matches_played;
			return avgRunsScored;
		}

		public String toString() {
			 String str = "Player name=" + name + "," + " matches_played=" + matches_played + "," + " total_runs=" + total_runs + "";
		     return str;
		}

		
}

