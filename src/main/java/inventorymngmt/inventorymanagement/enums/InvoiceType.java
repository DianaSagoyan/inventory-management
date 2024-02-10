package inventorymngmt.inventorymanagement.enums;

public enum InvoiceType {
    PURCHASE("purchase"), SALES("sales");

    private String value;

    InvoiceType(String value) {
        this.value = value;
    }
}
