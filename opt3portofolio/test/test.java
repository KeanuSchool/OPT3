import static org.junit.jupiter.api.Assertions.*;

public class test {


    @org.junit.jupiter.api.Test
    public void testCalculateLandingPrice_LessThan1000Kg() {
        // Arrange
        int gewicht = 800;
        int aant_pas = 2;
        boolean afhandeld = true;
        String nationaliteit = "Nederlands";

        // Act
        double result = Vliegtuig.berekenlandingsprijs(gewicht, aant_pas, afhandeld, nationaliteit);

        // Assert
        assertEquals(1089.0,result

        );
    }
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

}