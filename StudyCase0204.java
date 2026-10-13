import java.util.Scanner;

public class StudyCase0204 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = inputScanner.nextLine();

        System.out.print("Enter activity type (BELMAWA, BAKORMA, Mandiri, PKM, or Lainnya): ");
        String category = inputScanner.nextLine();

        System.out.print("Enter number of uploaded documents (0-4): ");
        int docCount = inputScanner.nextInt();

        if (category.equalsIgnoreCase("BELMAWA") || 
            category.equalsIgnoreCase("BAKORMA") || 
            category.equalsIgnoreCase("Mandiri")) {
            
            System.out.print("Enter competition rank (1, 2, 3, or 0 if not a winner): ");
            int placementRank = inputScanner.nextInt();

            if (placementRank >= 1 && placementRank <= 3) {
                if (docCount == 4) {
                    System.out.println("\nStudent Name: " + name);
                    System.out.println("Status: APPROVED (Award funds granted)");
                    System.out.println("Reason: 1st/2nd/3rd place winner in " + category + " with all 4 documents uploaded.");
                } else {
                    int missingFiles = 4 - docCount;
                    System.out.println("\nStudent Name: " + name);
                    System.out.println("Status: REJECTED (Funds not granted)");
                    System.out.println("Reason: Incomplete documents. Still missing " + missingFiles + " document(s).");
                }
            } else {
                System.out.println("\nStudent Name: " + name);
                System.out.println("Status: REJECTED (Funds not granted)");
                System.out.println("Reason: Only 1st, 2nd, and 3rd place winners are eligible for award funds.");
            }

       
        } else if (category.equalsIgnoreCase("PKM")) {
            
            System.out.print("Enter PKM funding status (1 = funded, 0 = not funded): ");
            int fundingFlag = inputScanner.nextInt();

            if (fundingFlag == 1) {
                if (docCount == 4) {
                    System.out.println("\nStudent Name: " + name);
                    System.out.println("Status: APPROVED (Award funds granted)");
                    System.out.println("Reason: PKM team selected for funding with all 4 documents uploaded.");
                } else {
                    int missingFiles = 4 - docCount;
                    System.out.println("\nStudent Name: " + name);
                    System.out.println("Status: REJECTED (Funds not granted)");
                    System.out.println("Reason: Incomplete documents. Still missing " + missingFiles + " document(s).");
                }
            } else {
                System.out.println("\nStudent Name: " + name);
                System.out.println("Status: REJECTED (Funds not granted)");
                System.out.println("Reason: PKM team was not selected for funding.");
            }

        } else {
            System.out.println("\nStudent Name: " + name);
            System.out.println("Status: REJECTED (Funds not granted)");
            System.out.println("Reason: Activity type '" + category + "' is outside the institutional award provisions.");
        }

        inputScanner.close();
    }
}