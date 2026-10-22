// print vowels 
public class Pb2 {
	public static void main(String[] args) {
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		printVovel(ch);

	}
	public static void printVovel(char []ch) {
		for (char c : ch ) {
			if(c =='a'||c=='e'||c =='o'||c =='i'||c =='u'||
				c =='A'||c =='E'||c =='O'||c =='I'||c =='U'	)
			{
				System.out.println(c);
			}
		}
	}
}