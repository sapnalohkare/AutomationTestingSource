package control_statements.jump_statement_break;

public class While_Continue {

	public static void main(String[] args) {
		int c = 10;

		while (c >= 5) {
			c--;

			if (c == 7) {
				continue;
			}

			System.out.println(c);
		}

	}

}
