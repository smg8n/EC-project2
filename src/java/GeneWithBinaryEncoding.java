import java.lang.Float;
/**
 *Binary Encoding : Most common methods of encoding. Chromosomes are string of 1s and 0s and each position in the chromosome represents a particular characteristics of the problem.

 */
public class GeneWithBinaryEncoding implements GeneI {
  static final  int MASK = 0x7fffff;

  private int nBits = 10;
  private int rawIntBits = 0;
  private float fValue = 0;

  public GeneWithBinaryEncoding(int nBits) {
   this.nBits = nBits;
  }

  public int getNBits() {
    return nBits;
  }

  public void setValue(float f) {
    fValue =  f;
    rawIntBits = Float.floatToRawIntBits(fValue) & MASK;
  }
  
  public float getValue() {
    return fValue;
  }
  
  public String toString()
  {
    return "float:"+fValue+",rawBits:"+ (rawIntBits & MASK);
  }

@Override
public float getFitness() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void calculateFitness() {
	// TODO Auto-generated method stub
	
}
}

