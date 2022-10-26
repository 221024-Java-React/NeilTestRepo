
public class Lab3 {

	public static void main(String[] args) {
		
		//variables for method testing
		Lab3 l3 = new Lab3();
		String testStr = "This is the test String";
		String word = "the";
		String ph = "111-657-890";
		
		//testting methods
		System.out.println(l3.replaceAllSpaces(testStr));
		System.out.println(l3.containsWord(testStr, word));
		
		String[] strArr = l3.splitPhoneNumber(ph);
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
	
	//replaces all spaces in string with -
	public String replaceAllSpaces(String inStr) {
		String newStr = inStr.replaceAll(" ", "-");
		return newStr;
	}
	
	// checks if strin1 contains string2
	public boolean containsWord(String inStr, String inWord) {
		String str1 = inStr.toLowerCase();
		String str2 = inWord.toLowerCase();
		boolean conWord = str1.contains(str2);
		return conWord;
	}
	
	//returns a string array of the string that was passed in
	public String[] splitPhoneNumber(String str1) {
		String[] strArr = str1.split("-");
		return strArr;
	}

}
