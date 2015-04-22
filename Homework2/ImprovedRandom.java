import java.util.Random;
public class ImprovedRandom extends Random {
	public ImprovedRandom() {
		super();
	}
	public ImprovedRandom(long seed){
		super(seed);
	}
	
	public int nextIntBetween(int para1, int para2){
		int num=para2-para1+1;
		int output=super.nextInt(num)+para1;
		return output;
	}
}
