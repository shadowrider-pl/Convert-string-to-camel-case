package finbarre.Convertstringtocamelcase;

/**
 * Convert string to camel case
 * 
 * Complete the method/function so that it converts dash/underscore delimited
 * words into camel casing. The first word within the output should be
 * capitalized only if the original word was capitalized.
 * 
 * Examples toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
 * 
 * toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 *
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String str = "the-stealth-warrior";
		Solution s = new Solution();
		String r = s.toCamelCase(str);
		System.out.println(r);
	}
}
