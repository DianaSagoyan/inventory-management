package inventorymngmt.inventorymanagement.enums;

public enum ClientVendorType {
    CLIENT("client"), VENDOR("vendor");

    private String value;

    ClientVendorType(String value) {
        this.value = value;
    }
}
