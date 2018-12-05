package finbarre.Convertstringtocamelcase;

public class Solution {
	static String toCamelCase(String s) {
		String characterToCamel = "";
		for (int i = 0; i < s.length() - 1; i++) {
			characterToCamel = Character.toString(s.charAt(i + 1));

			switch (Character.toString(s.charAt(i))) {
			case "-":
				s = s.replace(("-" + characterToCamel), characterToCamel.toUpperCase());
				break;
			case "_":
				s = s.replace(("_" + characterToCamel), characterToCamel.toUpperCase());
				break;

			default:
				break;
			}
		}
		return s;
	}
}
