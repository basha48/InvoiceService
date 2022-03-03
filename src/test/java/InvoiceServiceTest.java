
import org.junit.jupiter.api.Test;
import org.junit.Assert;
public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateTotalFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);

    }

    @Test
    public void givenLessDistanceAndTimeReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateTotalFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);

    }

    @Test
    public void givenMultipleRidesShouldReturnFareSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)
        };
         InvoiceSummary summary = invoiceGenerator.calculateTotalFare(rides);
        InvoiceSummary expectedInvoicesummmary = new InvoiceSummary(2,30.0);
        Assert.assertEquals(expectedInvoicesummmary, summary);


    }
}