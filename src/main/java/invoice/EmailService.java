package invoice;

public interface EmailService {

    void sendInvoice(Invoice invoice, String email);
}
