class Vliegtuig {


        // static method voor het berekenen van landingsprijs
        public static double berekenlandingsprijs(int gewicht) {
            double prijs = 0.0;

            if (gewicht < 1000) {
                prijs = 100;
            } else if (gewicht >= 1000 && gewicht < 5000) {
                prijs = 500;
            } else {
                prijs = 2500;
            }


            return prijs;
        }
        //static method voor het berekenen van mogelijke extra kosten
        public static double berekenextrakosten(double prijs, int aant_pas, boolean afhandeld,String nationaliteit) {

            if (aant_pas > 2) {
                prijs *= 1.5;
            }

            if (afhandeld) {
                prijs += 800;
            }

            if (nationaliteit.equalsIgnoreCase("Nederlands")) {
                prijs *= 1.21;
            }
            return prijs;
        }
        //static method voor het pairwise testen van berekenen van prijs met mogelijke extra kosten

    public static double berekenkostenmetmogelijkeextrakosten(int gewicht,int aant_pas, boolean afhandeld,String nationaliteit){
            double prijs = 0.0;
        if (gewicht < 1000) {
            prijs = 100;
        } else if (gewicht >= 1000 && gewicht < 5000) {
            prijs = 500;
        } else {
            prijs = 2500;
        }
        if (aant_pas > 2) {
            prijs *= 1.5;
        }

        if (afhandeld) {
            prijs += 800;
        }

        if (nationaliteit.equalsIgnoreCase("Nederlands")) {
            prijs *= 1.21;
        }

            return prijs;
        }
        //Static method voor het controleren van toestemming of het voertuig mag landen op schiphol

        public static boolean controleertoestemming(boolean toestemming, int lading, int tegenwind) {
            return toestemming && (lading < 1000 || tegenwind > 50);
        }
    }

