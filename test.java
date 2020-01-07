package demo;

public class test {

	public static void main(String args[]) {

		String str = "Hey There, Alan";

		str = str.toLowerCase();

		int len = str.length() - 1;
		StringBuffer sb = new StringBuffer();

		for (int i = len; i >= 0; i--) {
			if (str.charAt(i) == '?' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '!') {
				sb.append(str.charAt(i) + " ");
				sb.deleteCharAt(len - i - 1);
			} else if (i == len || sb.charAt(len - i - 1) == ' ')
				sb.append(Character.toUpperCase(str.charAt(i)));
			else
				sb.append(str.charAt(i));
		}

		System.out.println(sb.toString());

	}

}
