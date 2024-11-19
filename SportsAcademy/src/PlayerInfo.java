import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class PlayerInfo {
	private Map<String,String> playerMap=new HashMap<String,String>();

	public Map<String, String> getPlayerMap() {
		return playerMap;
	}
	public void setPlayerMap(Map<String, String> map) {
		this.playerMap = map;
	}

	public void addPlayerDetails(String playerId,String sportsType) {
		//Fill the code
        playerMap.put(playerId, sportsType);
	}
	
    public List<String> findPlayerIdsBySportsType(String sportsType) {
        //Fill the code

    	List<String> player = new ArrayList<>();
    	for (Map.Entry<String, String> p : playerMap.entrySet()) {
			if(p.getValue().equals(sportsType)) {
				player.add(p.getKey());
			}
			
		}
        return player;
    }


    public int findTotalCountOfPlayerIdsBasedOnSportsType(String sportsType) {
        //Fill the code
    	//playerId , sportstype 
    	int count=0;
    	for (Map.Entry<String, String> m : playerMap.entrySet()) {
			if(m.getValue().equals(sportsType)) {
				count++;	
			}	
		}
    	
    	if(count==0) {
    		return -1;
    	}
		return count;
    }
	
}
