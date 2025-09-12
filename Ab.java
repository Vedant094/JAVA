import java.util.Scanner;

class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of users: ");
        int numberOfUsers = scanner.nextInt();

        String[] names = new String[numberOfUsers];
        int[] unitsConsumed = new int[numberOfUsers];
        double[] charges = new double[numberOfUsers];

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.print("Enter the name of user " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter the number of units consumed by " + names[i] + ": ");
            unitsConsumed[i] = scanner.nextInt();

            charges[i] = calculateCharges(unitsConsumed[i]);
        }

        System.out.println("\nElectricity Charges:");
        System.out.println("-------------------");
        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println(names[i] + ": Rs. " + charges[i]);
        }
    }

    public static double calculateCharges(int unitsConsumed) {
        double charges = 0;

        if (unitsConsumed <= 100) {
            charges = unitsConsumed * 0.6;
        } else if (unitsConsumed <= 300) {
            charges = 100 * 0.6 + (unitsConsumed - 100) * 0.8;
        } else {
            charges = 100 * 0.6 + 200 * 0.8 + (unitsConsumed - 300) * 0.9;
        }

        if (charges < 50) {
            charges = 50;
        }

        if (charges > 300) {
            charges += charges * 0.15;
        }

        return charges;
    }
}
