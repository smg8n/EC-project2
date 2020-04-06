/**
 *
 */
public class IndividualWith3BinaryEnc implements IndividualI{
  public GeneI x1;
  public GeneI x2;
  public GeneI x3;
  float fitness;

  public IndividualWith3BinaryEnc(int x1Bits, int x2Bits, int x3Bits) {
    x1 = new GeneWithBinaryEncoding(x1Bits);
    x2 = new GeneWithBinaryEncoding(x2Bits);
    x3 = new GeneWithBinaryEncoding(x3Bits);
    fitness = 0;
  }
 
  public void calculateFitness()
  {
     fitness = (float) (Math.pow(x1.getValue(),2) + Math.pow(x2.getValue(), 2) + Math.pow(x3.getValue(), 2));
  }
  
  public float getFitness()
  {
    return fitness;
  }
}
