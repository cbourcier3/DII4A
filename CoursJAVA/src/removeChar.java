
public class removeChar {
	public static String removeAllCharsFromString(String refString, String charSet)
	{
		String regex = "";
		for(int i =0; i< charSet.length(); i++) {
			if (i > 0)
				regex = regex + "|";
			regex =  regex + charSet.substring(i,i+1);
		}
		regex = regex + "";
		refString = refString.replaceAll(regex,"");
		System.out.println(refString);
		return refString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeChar.removeAllCharsFromString("Bonjour", "nr");
	}
} 
