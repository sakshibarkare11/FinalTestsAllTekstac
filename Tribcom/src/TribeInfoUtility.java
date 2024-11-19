import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class TribeInfoUtility {

	public List<TribeInfo> retrieveTribeInfoDetailsBySocioEconomicStatus(Stream<TribeInfo> tribeInfoStream, String socioEconomicStatus){
		//Fill the code here
		return tribeInfoStream.filter(n->n.getSocioEconomicStatus().equals(socioEconomicStatus)).toList();
	}
	
	public Stream<TribeInfo> retrieveTribeInfoDetailsByLanguage(Stream<TribeInfo> tribeInfoStream, String language){
		//Fill the code here
		return tribeInfoStream.filter(m->m.getLanguage().equals(language));
	}
	
	public Stream<TribeInfo> findTheMaximumPopulationTribeNames(Stream<TribeInfo> tribeInfoStream, int limit){
		//Fill the code here
		return tribeInfoStream.sorted(Comparator.comparing(TribeInfo:: getTribeName).reversed()).limit(limit);
	}
}
