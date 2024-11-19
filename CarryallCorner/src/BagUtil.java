import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BagUtil {

    public Stream<Bag> retrieveBagDetailsByCategory(Stream<Bag> bagStream, String category) {
        //Fill the code here
        
        return bagStream.filter(p->p.getCategory().equals(category));
    }

    public Stream<Bag> retrieveBagDetailsByColor(List<Bag> bagList, String color) {
        //Fill the code here

        return bagList.stream().filter(n->n.getColor().equals(color));
    }

    public List<Bag> retrieveBagDetailsBelowSpecifiedPrice(Stream<Bag> bagStream, double price) {
        //Fill the code here
        
        return bagStream.filter(s->s.getPrice()< price).toList();
    }
}


