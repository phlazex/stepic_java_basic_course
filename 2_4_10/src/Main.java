public class Main {
	private static String printTextPerRole(String[] roles, String[] textLines) {
		StringBuilder textRoles = new StringBuilder();

		for (int i = 0; i < roles.length; i++) {
			textRoles.append(roles[i] + ":\n");

			for (int j = 0; j < textLines.length; j++) {
				if (textLines[j].startsWith(roles[i] + ":")) {
					textRoles.append(textLines[j].replaceFirst(roles[i] + ": ", (j + 1) + ") ") + "\n");
				}
			}

			if (i + 1 < roles.length) {
				textRoles.append("\n");
			}
		}

		return textRoles.toString();
	}

	public static void main(String[] args) {
		String[] roles = {
				"Городничий","Аммос Федорович",
				"Артемий Филиппович", "Лука Лукич"
		};
		String[] textLines = {
				"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
				"Аммос Федорович: Как ревизор?",
				"Артемий Филиппович: Как ревизор?",
				"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
				"Аммос Федорович: Вот те на!",
				"Артемий Филиппович: Вот не было заботы, так подай!",
				"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
		};

		System.out.println(printTextPerRole(roles, textLines));
	}
}
