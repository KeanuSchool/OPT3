import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Vraag inputs
            System.out.print("Voer het gewicht van de vliegtuig in (in kg): ");
            int gewicht = scanner.nextInt();

            System.out.print("Voer het aantal passagiers aan boord in: ");
            int aant_pas = scanner.nextInt();

            System.out.print("Is bagageafhandeling vereist? (true/false): ");
            boolean afhandeld = scanner.nextBoolean();

            System.out.print("Voer de nationaliteit van het vliegtuig in: ");
            String nationaliteit = scanner.next();

            // Controleren of het vliegtuig voldoet aan de voorwaarden voor opstijgen
        System.out.print("Is er toestemming van het verkeerstoren? (true/false): ");
        boolean toestemming = scanner.nextBoolean();

        System.out.print("Voer het gewicht van de lading in (in kg): ");
        int lading = scanner.nextInt();

        System.out.println("Voer het tegenwind van vandaag (in km/uur) ");
        int tegenwind = scanner.nextInt();

        boolean input = Vliegtuig.controleertoestemming(toestemming,lading,tegenwind);
        if(input == true){
            System.out.println("uw voertuig mag opstijgen van schiphol");
        } else {
            System.out.println("uw voertuig mag niet opstijgen van schiphol");
        }
        // Bereken de landingsprijs
        double prijs = Vliegtuig.berekenlandingsprijs(gewicht,aant_pas,afhandeld,nationaliteit);

            // Toon het resultaat
        System.out.printf("Het landen op schiphol met uw voertuig kost %.2f €%n",prijs);
        }



}