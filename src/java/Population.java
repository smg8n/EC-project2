import java.util.ArrayList;
/**
 *
 */
public class Population {
  private ArrayList<IndividualI> individuals;
  
  public Population() {
	  individuals = new ArrayList<IndividualI>();
  }
  
  public void addIndividual(IndividualI ind) {
	  individuals.add(ind);
	  
  }
}
