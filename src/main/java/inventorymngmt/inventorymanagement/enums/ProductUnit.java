package inventorymngmt.inventorymanagement.enums;

public enum ProductUnit {
    LIBRE("libre"), GALLON("gallon"), PIECES("pieces"), KILOGRAM("kilogram"), METER("meter"), INCH("inch"), FEET("feet");

    private String value;

    ProductUnit(String value) {
        this.value = value;
    }
}
