package ocp;

public class FileInvoiceDao implements Dao {
    private Invoice invoice;

    public FileInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void saveData() {
        System.out.println("FileInvoiceDao.saveData");
        System.out.println("Saving invoice to file: " + invoice);
    }
}
