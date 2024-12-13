package Forstring;

public class ApplyStringMethods {

	public static void main(String[] args) {
		// String methods

		String s = "hello";
		String s1 = "welcome to luminar";
		String s2 = "Hello";

		// concat
		System.out.println(s.concat(s1)); // hellowelcome
		System.out.println(1 + 2 + s + 3 + 4 + s1); // 3hello34welcome

		// equals
		System.out.println(s.equals(s2)); // false
		System.out.println(s.equalsIgnoreCase(s2)); // true

		// contains
		System.out.println(s1.contains("luminar")); // true

		// toUpperCase toLowerCase

		// startsWith and endsWith
		System.out.println(s.startsWith("luminar")); // false
		System.out.println(s1.endsWith("luminar")); // true

		// length
		System.out.println(s.length()); // 5

		// charAt()
		System.out.println(s.charAt(2)); // 1

		// trim()
		System.out.println(s.trim()); // 5

		// replace()
		System.out.println(s.replace("hello", "helloo"));

		// toCharArray character array is formed later
		char[] c = s.toCharArray();
		for (char v : c) {
			System.out.println(v);
		}

		// split() String Array
		String[] ch = s1.split(" ");
		for (String st : ch) {
			System.out.println(st);
		}

		// subString()
		System.out.println(s1.substring(2, 4));

	}

}
