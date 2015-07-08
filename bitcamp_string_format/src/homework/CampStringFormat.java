package homework;

public class CampStringFormat {

	public static String format(String string, Object... args) {
		int argsIndex = 0;
		int position = 0;
		String resString = "";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '%') {
				if (string.charAt(i + 1) == 'd' && args[argsIndex] instanceof Integer) {
					resString += string.substring(position, i) + args[argsIndex];
					argsIndex++;
					position = resString.length();
				} else if (string.charAt(i + 1) == 'd' && args[argsIndex] instanceof Double) {
					resString += string.substring(position, i) + args[argsIndex];
					argsIndex++;
					position = resString.length();
				} else if (string.charAt(i + 1) == 's' && args[argsIndex] instanceof String) {
					resString += string.substring(position, i) + args[argsIndex];
					argsIndex++;
					position = resString.length();
				} else {
					resString = "" + args[argsIndex];
					string = string.substring(0, string.length() - 2) + resString;
				}
			}	
		}
		return string;
	}
}

