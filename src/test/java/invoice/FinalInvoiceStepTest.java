package invoice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FinalInvoiceStepTest {
    private FinalInvoiceStep finalInvoiceStep = null;
    private Customer customer = null;
    private Invoice invoice = null;
    private PrinterService printerService = null;
    private EmailService emailService = null;

    @Before
    public void setUp() throws Exception {
        printerService = Mockito.mock(PrinterService.class);
        emailService = Mockito.mock(EmailService.class);
        customer = new Customer();
        finalInvoiceStep = new FinalInvoiceStep(printerService, emailService);
        //invoice = ...

    }

    @Test
    public void testHandleInvoiceWithCustomerEmailTrueThenCheckInteractions() {
        customer.setPreferEmails(true);
        finalInvoiceStep.handleInvoice(invoice,customer);

        //nothing should be printed
        Mockito.verifyZeroInteractions(printerService);
        Mockito.verify(emailService).sendInvoice(invoice,customer.getEmail());
    }

    @Test
    public void testHandleInvoiceWithCustomerEmailFalseThenChcekInteractions() {
        customer.setPreferEmails(false);
        finalInvoiceStep.handleInvoice(invoice,customer);
//nothing should be emailed
        Mockito.verifyZeroInteractions(emailService);
        //the invoice must be printed
        Mockito.verify(printerService).printInvoice(invoice);
    }
}