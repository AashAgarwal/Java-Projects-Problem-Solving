/**
 * You are given an enum SI with three constants. Each constant stores a string field with its quantity name.
 * Declare the instance method getQuantityName that returns the quantity name of the constant.
 */

enum SI {

    M("length"),
    KG("mass"),
    S("time");

    public final String quantityName;

    SI(String quantityName) {
        this.quantityName = quantityName;
    }

    // implement getQuantityName() method here
    public String getQuantityName() {
        return quantityName;
    }
}