package Day2;

public class Pb30 {
public static void main(String[] args) {
	char[] ch = {'@', '3', 'A', 'k', 'e', 'M'};
	print(ch);
}
public static void print(char[] c)
{
	for (int i = 0; i < c.length; i++) {
		if(c[i] >='a'&& c[i] <= 'z'||c[i] >= 'A'&& c[i] <= 'Z') {
			if(!(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||
					c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'))
			{
				System.out.println(c[i]);
				break;
			}
		}
	}	
}
}
