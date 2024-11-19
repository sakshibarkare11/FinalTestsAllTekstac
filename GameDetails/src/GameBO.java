import java.util.*;

public class GameBO 
{
	
	private Map<String,Integer> gameMap;
	
	public Map<String, Integer> getGameMap() {
		return gameMap;
	}

	public void setGameMap(Map<String, Integer> gameMap) {
		this.gameMap = gameMap;
	}

	//	This method should add the gameName as key and their numberOfHits as value into a Map
	public void addGameDetails(String gameName,int numberOfHits)
	{	
		// Fill the code here
		for(String name: gameMap.keySet()) {
			if (name.equalsIgnoreCase(gameName)) {
				System.out.println("do not again");
				return;
			}
		}	
		gameMap.put(gameName, numberOfHits);
		
	}
	
	//	 This method should return the gameName having maximum numberOfHits.
	
	public String findGameWithMaxHits() 
	{
		// Fill the code here
		for (Map.Entry<String, Integer> p : gameMap.entrySet()) {
			if(p.getKey().equalsIgnoreCase(p.getKey())){
				return p.getKey();
			}
		}
		return null;
		
	}
	//  This method should return the numberOfHits for the given gameName
	
	
	public int findNumberOfHits(String gameName){
	    // Fill the code here
		//count of the hits
//		int count = 0;
//		for (Map.Entry<String, Integer> entry : gameMap.entrySet()) {
//		if(gameName.equalsIgnoreCase(gameName)) {
//			count ++;
//		}
//		if(count >0) {
//			return count;
//		}
////		if(gameName.isEmpty()) {
////			return -1;
////		}
//		}
//		return -1;
		for (Map.Entry<String, Integer> j : gameMap.entrySet()) {
			if(gameMap.containsKey(gameName)) {
				return j.getValue();
			}
		}
		
		return -1;
		
		
		
		
		
		
	}
}

