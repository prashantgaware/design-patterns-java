package ocp;

public class DbInvoiceDao implements Dao {
    private Invoice invoice;

    public DbInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void saveData() {
        System.out.println("DbInvoiceDao.saveData");
        System.out.println("Saving invoice to db: " + invoice);
    }
}
