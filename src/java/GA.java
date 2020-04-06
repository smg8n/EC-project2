/**
 * the ‘canonical’ or ‘simple GA’ (SGA)
 *  GAs traditionally have a fixed work- flow: 
	given a population of μ individuals,
        parent selection fills an intermediary population of μ, allowing duplicates. 
	Then the intermediary population is shuffled to create random pairs 
	and crossover is applied to each consecutive pair with probability pc and the children replace the parents immediately. 
*   The new intermediary population undergoes mutation individual by individual, 
*   	where each of the l bits in an individual is modified by mutation with independent probability pm. 
*    The resulting intermediary population forms the next generation replacing the previous one entirely. 
*    Note that in this new generation there might be pieces, perhaps complete individuals, 
*  from the previous one that survived crossover and mutation without being modified, 
*   but the likelihood of this is rather low (depending on the parameters μ,pc,pm).

 *  =====================================
 *  Representation 		Bit-strings
 *  =====================================
 *  Recombination 		1-Point crossover
 *  Mutation			Bit flip
 *  Parent selection    Fitness proportional - implemented by Roulette Wheel 
 *  Survival selection  Generational
 * 
 * 
 * 
 * 

 */
public class GA {
	
	private int population_size;
	private int max_generations;
	private int runs;
	private float pc;
	private float pm;
	private int selectionStrategy;

	IndividualBuilderI indBuilder;
	// 
	Population population ;
	
	/**
	 * 	//
		//
		// convert arguments to parameters.
	 */
	void getParamsFromArgs(String[] args) {
		population_size = Integer.parseInt(args[0]);
		max_generations = Integer.parseInt(args[1]);
		runs = Integer.parseInt(args[2]);
		pc = Float.parseFloat(args[3]);
		pm = Float.parseFloat(args[4]);
		selectionStrategy = Integer.parseInt(args[5]);		
	}
	
	void setBuilders()
	{
		indBuilder = new IndividualWith3BinaryEncBuilder(10, 15, 20);
		
		switch(selectionStrategy) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
	/**
	 * print usage
	 */
	private static void usage()
	{
	  System.err.println("usage: java GA population_size max_generations runs pc pm <1 or 2 or 3 for selectionStrategy>");
	  System.err.println("       1 -- proportional, 2 -- binary tournament , 3 -- linear ranking ");
	}
	/**
	 * The algorithm parameters (population size, crossover rate, etc.) may be taken from the user on the command line
	 *   population size, crossover rate, etc.
	 * # define POPULATION_SIZE 30
	 * # define MAXGERATIONS 50
	 * # define RUNS 30
	 * # define PC 0.8
	 * # define PM 0.1
	 * N = 30; pc = 0.8; pm = 0.1; max generations (for use as a stopping condition) = 50.
	 */
	public static void main(String args[]) {
		if (args.length < 6) {
			usage();
			return;
		}
		GA ga = new GA();
		
		ga.getParamsFromArgs(args);
		
		ga.initializePopulation();
		while(true) {
			Population intermediatePop = ga.selection();
			Population children = ga.crossover(intermediatePop);
			Population newChildren = ga.mutate(children);
		}
	}

	private Population mutate(Population children) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * crossover is applied to each consecutive pair with probability pc and the children replace the parents immediately. 
	 * @param intermediatePop
	 * @return
	 */
	private Population crossover(Population intermediatePop) {
		Population children = null;
		return children;
		// TODO Auto-generated method stub
		
	}
	/**
	 * parent selection fills an intermediary population of μ, allowing duplicates.
	 * @return
	 */
	private Population selection() {
		Population pairs = null;
		return pairs;
		// TODO Auto-generated method stub
		
	}

	private void initializePopulation() {
		// TODO Auto-generated method stub
		
	}
}