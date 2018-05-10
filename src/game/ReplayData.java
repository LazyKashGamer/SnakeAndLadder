package game;

import java.util.List;

public class ReplayData {
	String name;
	List<Turn> turnls;
	
	public ReplayData(String name,List<Turn> turnls){
		this.name = name;
		this.turnls = turnls;
	}
	
	public String toString() {
		return name;
	}
	
	public List<Turn> getList(){
		return turnls;
	}
}
