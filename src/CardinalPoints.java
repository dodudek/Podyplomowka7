public enum CardinalPoints {

    NORTH ("N", "North", "Północ"),
    NORTHEAST ("NE", "North-East", "Północny wschód"),
    EAST ("E", "East", "Wschód"),
    SOUTHEAST ("SE", "South-East", "Południowy wschód"),
    SOUTH ("S", "South", "Południe"),
    SOUTHWEST ("SW", "South-West", "Południowy zachód"),
    WEST ("W", "West", "Zachód"),
    NORTHWEST ("NW", "North-West", "Północny zachód");

    private String shortName;
    private String englishName;
    private String polishName;

    CardinalPoints(String shortName, String englishName, String polishName) {
        this.shortName = shortName;
        this.englishName = englishName;
        this.polishName = polishName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }
}
