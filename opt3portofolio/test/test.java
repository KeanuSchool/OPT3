import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {



    @org.junit.jupiter.api.Test
    public void testToestemming() {
        // Arrange
        boolean toestemming = true;
        int lading = 800;
        int tegenwind = 50;

        // Act
        boolean input = Vliegtuig.controleertoestemming(toestemming, lading, tegenwind);


        // Assert
        assertEquals(true, input);
    }
    @Test
    public void testBerekenkostenmetmogelijkeextrakosten() {
        // Fysieke testgevallen met bijbehorende besluiten en parameters
        int[] gewichten = {999, 999, 1000, 1000, 5000, 5000};
        int[] aantPassagiers = {1, 3, 1, 3, 1, 3};
        boolean[] afgehandeld = {true, false, false, true, true, false};
        String[] nationaliteiten = {"Nederlands", "Anders", "Nederlands", "Anders", "Anders", "Nederlands"};
        double[] verwachtePrijzen = {1089.0, 150.0, 605.0, 1550.0, 3300.0, 4537.5};

        for (int i = 0; i < gewichten.length; i++) {
            int gewicht = gewichten[i];
            int aantPassagier = aantPassagiers[i];
            boolean isAfgehandeld = afgehandeld[i];
            String nationaliteit = nationaliteiten[i];
            double verwachtePrijs = verwachtePrijzen[i];
            double berekendePrijs = Vliegtuig.berekenkostenmetmogelijkeextrakosten(gewicht, aantPassagier, isAfgehandeld, nationaliteit);

            assertEquals(verwachtePrijs, berekendePrijs, 0.01);
        }
    }
    @Test
    public void testBerekenlandingsprijs() {
        // Fysieke testgevallen met bijbehorende besluiten en equivalentieklassen ( in arraylists gezet zodat ik makkelijker kan scannen)
        int[] gewichten = {0, 100, 900, 999, 1000, 1001, 1500, 2000, 4000, 5000, 5001, 7500, 10000, 100000};
        double[] verwachtePrijzen = {100, 100, 100, 100, 500, 500, 500, 500, 500, 2500, 2500, 2500, 2500, 2500};

        for (int i = 0; i < gewichten.length; i++) {
            int gewicht = gewichten[i];
            double verwachtePrijs = verwachtePrijzen[i];
            double berekendePrijs = Vliegtuig.berekenlandingsprijs(gewicht);

            assertEquals(verwachtePrijs, berekendePrijs, 0.01);
        }
    }

    @Test
    void testControleerToestemmingOpMCDC() {
        // Testgeval 1: A = true, B = false ( >1000), C = false ( <50KM)
        boolean result1 = Vliegtuig.controleertoestemming(true, 1100, 40);
        assertFalse(result1);

        // Testgeval 2: A = false, B = false (>1000), C = true ( >50KM)
        boolean result2 = Vliegtuig.controleertoestemming(false, 1100, 60);
        assertFalse(result2);

        // Testgeval 3: A = true, B = true (<1000), C = false (<50KM)
        boolean result3 = Vliegtuig.controleertoestemming(true, 900, 40);
        assertTrue(result3);

        // Testgeval 4: A = false, B = true (<1000), C = true ( >50KM)
        boolean result4 = Vliegtuig.controleertoestemming(false, 900, 40);
        assertFalse(result4);

        // Testgeval 5: A = true, B = true (<1000), C = true ( >50KM)
        boolean result5 = Vliegtuig.controleertoestemming(true, 900, 40);
        assertTrue(result5);
    }
}

