package bookExercises;

import javax.swing.JOptionPane;

public class Ex69 {

	public static void main(String[] args) {

		int lines = 10, column = 3;

		int[][] inventory = new int[lines][column];

		int swap;

		String userAnswer;

		do {

			for (int i = 0; i < lines; i++) {

				inventory[i][0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input ID Product: "));

				inventory[i][1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Stock: "));

				inventory[i][2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minimum values."));

				// inventory[i][3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input
				// ID Product: "));

				// inventory[i][4] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input
				// Stock: "));

				// inventory[i][5] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter
				// the minimum values."));

			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (inventory[i][0] > inventory[j][0]) {

						swap = inventory[i][0];

						inventory[i][0] = inventory[j][0];

						inventory[j][0] = swap;
					}

				}
			}

			for (int i = 0; i < lines; i++) {

				if (inventory[i][1] <= inventory[i][2]) {

					System.out.print("ID: " + inventory[i][0] + " | " + "Stock: " + inventory[i][1]);

					System.out.println();

				}

			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");
	}

}