import java.util.Scanner;

public class Library {
	int id, ch1, i, bk, cn, dy;
	String name;

	String eb[] = { "Mechatronics-1", "Quality Study Part-2", "Construction Principals Basic",
			"Fluid Mechanics Part-1" };
	String mb[] = { "Anatomy -by Dr Raj", "Bone Study by - Dr devanand", "Medicine - Dr Rupali sen",
			"Ayurveda - Dr khanna" };
	String sb[] = { "The given Tree - By- NALA VEDANT ", "Lord of Ring - By - Riddhi Waghmare",
			"Wizard - By - PB kshitij", "Akbar & Birbal - By - Bhawani dev" };
	Scanner s = new Scanner(System.in);

	void accept() {
		while (true) {
			System.out.println("-------------------------");
			System.out.println("WELCOME TO WARJE LIBRARY");
			System.out.println("-------------------------\n\n");

			System.out.println("1) ENGINEERING BOOKS");
			System.out.println("2) MEDICAL BOOKS");
			System.out.println("3) STORY BOOKS");
			System.out.println("4) EXIT");
			System.out.println("ENTER YOUR CHOICE:");
			ch1 = s.nextInt();

			switch (ch1) {
			case 1:
				System.out.println("PLEASE ENTER STUDENT ID");
				id = s.nextInt();
				System.out.println("PLEASE ENTER STUDENT NAME");
				name = s.next();

				System.out.println("You have selected ENGINEERING BOOK SECTION");
				System.out.println("Following are the options  : - ");
				for (i = 0; i < 4; i++) {
					System.out.println((i + 1) + ")" + " " + eb[i]);
				}
				System.out.println("Please select your choice from above");
				bk = s.nextInt();
				System.out.println("You have selected :  " + eb[(bk - 1)]);
				System.out.println("IF YOU WANT TO CONFIRM PRESS 1 ELSE 0");
				cn = s.nextInt();
				if (cn == 1)

				{
					System.out.println("You have selected :  " + eb[(bk - 1)]);
					System.out.println("Each day Cost Rs-10/-");
					System.out.println("How many days you want to rent");
					dy = s.nextInt();
					System.out.println("Rent for book will be : - " + (dy * 10));
					System.out.println("Want to Purchase ? IF YES ENTER(1)");
					cn = s.nextInt();
					if (cn == 1) {
						System.out.println("Name : " + name + "\nStudent Id : " + id);
						System.out.println("CONGRATULATIONS YOU HAVE RENTED : -  " + eb[(bk - 1)] + "\n For " + dy
								+ " Days" + "\nWith Renting cost of : Rs" + (dy * 10));
						System.out.println("PLEASE NOTE DELAY OF A DAY WOULD CHARGE RS 15 EXTRA");
						System.out.println("THANK YOU FOR VISITING WARJE LIBRARY");
					} else {
						System.out.println("WE APPRECIATE YOUR DEICISION SEE YOU AGAIN");
					}

				} else {
					System.out.println("WE APPRECIATE YOUR DEICISION SEE YOU AGAIN");
				}
				break;
			case 2:

				System.out.println("PLEASE ENTER STUDENT ID");
				id = s.nextInt();
				System.out.println("PLEASE ENTER STUDENT NAME");
				name = s.next();

				System.out.println("You have selected MEDICAL BOOK SECTION");
				System.out.println("Following are the options  : - ");
				for (i = 0; i < 4; i++) {
					System.out.println((i + 1) + ")" + " " + mb[i]);
				}
				System.out.println("Please select your choice from above");
				bk = s.nextInt();
				System.out.println("You have selected :  " + mb[(bk - 1)]);
				System.out.println("IF YOU WANT TO CONFIRM PRESS 1 ELSE 0");
				cn = s.nextInt();
				if (cn == 1)

				{
					System.out.println("You have selected :  " + mb[(bk - 1)]);
					System.out.println("Each day Cost Rs-20/-");
					System.out.println("How many days you want to rent");
					dy = s.nextInt();
					System.out.println("Rent for book will be : - " + (dy * 20));
					System.out.println("Want to Purchase ? IF YES ENTER(1)");
					cn = s.nextInt();
					if (cn == 1) {
						System.out.println("Name : " + name + "\nStudent Id : " + id);
						System.out.println("CONGRATULATIONS YOU HAVE RENTED : -  " + mb[(bk - 1)] + "\n For " + dy
								+ " Days" + "\nWith Renting cost of : Rs" + (dy * 20));
						System.out.println("PLEASE NOTE DELAY OF A DAY WOULD CHARGE RS 15 EXTRA");
						System.out.println("THANK YOU FOR VISITING WARJE LIBRARY");
					} else {
						System.out.println("WE APPRECIATE YOUR DEICISION SEE YOU AGAIN");
					}

				} else {
					System.out.println("WE APPRECIATE YOUR DEICISION SEE YOU AGAIN");
				}

				break;

			case 3:

				System.out.println("PLEASE ENTER STUDENT ID");
				id = s.nextInt();
				System.out.println("PLEASE ENTER STUDENT NAME");
				name = s.next();

				System.out.println("You have selected STORY BOOK SECTION");
				System.out.println("Following are the options  : - ");
				for (i = 0; i < 4; i++) {
					System.out.println((i + 1) + ")" + " " + sb[i]);
				}
				System.out.println("Please select your choice from above");
				bk = s.nextInt();
				System.out.println("You have selected :  " + sb[(bk - 1)]);
				System.out.println("IF YOU WANT TO CONFIRM PRESS 1 ELSE 0");
				cn = s.nextInt();
				if (cn == 1)

				{
					System.out.println("You have selected :  " + sb[(bk - 1)]);
					System.out.println("Each day Cost Rs-5/-");
					System.out.println("How many days you want to rent");
					dy = s.nextInt();
					System.out.println("Rent for book will be : - " + (dy * 5));
					System.out.println("Want to Purchase ? IF YES ENTER(1)");
					cn = s.nextInt();
					if (cn == 1) {
						System.out.println("Name : " + name + "\nStudent Id : " + id);
						System.out.println("CONGRATULATIONS YOU HAVE RENTED : -  " + sb[(bk - 1)] + "\n For " + dy
								+ " Days" + "\nWith Renting cost of : Rs" + (dy * 5));
						System.out.println("PLEASE NOTE DELAY OF A DAY WOULD CHARGE RS 15 EXTRA");
						System.out.println("THANK YOU FOR VISITING WARJE LIBRARY");
					} else {
						System.out.println("WE APPRECIATE YOUR DEICISION SEE YOU AGAIN");
					}

				} else {
					System.out.println("WE APPRECIATE YOUR DEICISION SEE YOU AGAIN");
				}

				break;

			case 4:
				System.out.println("THANK YOU FOR VISITING WARJE LIBRARY");
				System.exit(0);

			default:
				System.out.println("PLEASE SELECT A VALID CHOICE");
			}// switch
		} // while
	}// class

	public static void main(String[] args) {
		Library l = new Library();
		l.accept();

	}

}
