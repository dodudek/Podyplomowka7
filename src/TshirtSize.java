public enum TshirtSize {

    S(48,71,36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

    private int chestWidth;
    private int skirtLength;
    private int sleeveLength;

    TshirtSize(int chestWidth, int skirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.skirtLength = skirtLength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getSkirtLength() {
        return skirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }
}
