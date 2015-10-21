package unl.cse;

public class Team {

	public final String name;
	public final Integer wins;
	public final Integer loss;
	
	public Team(String name, Integer wins, Integer loss) {
		this.name = name;
		this.wins = wins;
		this.loss = loss;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getWins() {
		return this.wins;
	}
	
	public Integer getLoss() {
		return this.loss;
	}
	
	public Double getWinPercentage() {
		return this.wins / (double) (this.wins + this.loss);
	}
	
	public String toString() {
		return this.name + " (" + this.wins + ", " + this.loss + ")";
	}
}
