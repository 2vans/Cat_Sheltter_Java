import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userInput = 0;

		final int CAT_NUMBER = 5;
		String[] dataBase = new String[CAT_NUMBER];
		boolean exit = false;
		int catsValue = 0;

		while (!exit) {
			System.out.println();
			System.out
					.println("================== Schronisko Dla Kotow v1.0 ====================");
			System.out
					.println("+++++++++++++++++++ MENU +++++++++++++++++++++++++++++++++++++++++");
			System.out.println("1. Dodaj Kota.");
			System.out.println("2. Usun Kota.");
			System.out.println("3. Status Schroniska.");
			System.out.println("4. Wyjdz.");

			try {
				userInput = input.nextInt();
			} catch (java.util.InputMismatchException e) {

				break;
			}
			System.out.println();

			switch (userInput) {
			case 1:
				if(catsValue < CAT_NUMBER) {
				System.out.println("Podaj imie kota");
				dataBase[catsValue] = input.next();
				System.out.println("Doda³em kota.");
				catsValue++;
				} else {
					System.out.println("nie ma miejsca w schronisku. Odejmij kota");
				}
				break;
			case 2:
				System.out.println("Usunuo³em kota.");
				break;
			case 3:
				for (int i = 0; i < CAT_NUMBER; i++) {
					System.out.println(i + ": " + dataBase[i]);
				}
				if(catsValue >= CAT_NUMBER) {
					System.out.println("Nie ma miejsca w schronisku!");
				} else {
					System.out.println("jest miejsce w schronisku");
				}
				break;
			case 4:
				System.out.println("Wychodze");
				exit = true;
				break;
			default:
				System.out.println("nic");
				break;
			}
		}

	}
}
