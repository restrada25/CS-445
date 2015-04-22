import java.util.StringTokenizer;
public class ImprovedStringTokenizer extends StringTokenizer {

	public ImprovedStringTokenizer(String s) {
		super(s);
	}
	public ImprovedStringTokenizer(String s, String d){
		super(s,d);
	}
	public ImprovedStringTokenizer(String s, String d, boolean rD){
		super(s,d,rD);
	}
	
	public String[] TokenArray(){
		int i=0;
		String[] sarr= new String[countTokens()];
		while(hasMoreTokens()){
			sarr[i]=nextToken();
			i++;
		}
		return sarr;
	}
}
