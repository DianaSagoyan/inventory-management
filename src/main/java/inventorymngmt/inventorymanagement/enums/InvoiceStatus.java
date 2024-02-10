package inventorymngmt.inventorymanagement.enums;

public enum InvoiceStatus {
    AWAITING_APPROVAL("Awaiting approval"), APPROVED("Approved");

    private String value;

    InvoiceStatus(String value) {
        this.value = value;
    }
}
