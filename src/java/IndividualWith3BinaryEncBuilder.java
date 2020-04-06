/**
 * 
 */
public class IndividualWith3BinaryEncBuilder implements IndividualBuilderI {
	private int x1Bits;
	private int x2Bits;
	private int x3Bits;
	
	public IndividualWith3BinaryEncBuilder(	int x1Bits, int x2Bits, int x3Bits) {
		this.x1Bits = x1Bits;
		this.x2Bits = x2Bits;
		this.x3Bits = x3Bits;
	}
	
	@Override
	public IndividualI buildOne() {
		// TODO Auto-generated method stub
		return new IndividualWith3BinaryEnc(x1Bits, x2Bits, x3Bits);
	}
}
