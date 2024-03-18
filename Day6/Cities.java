public class Cities {
    private int id;
    private String name;
    private int population;
    private String countryCode;

    public Cities(int id, String name, int population, String countryCode) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPopulation() {
        return this.population;
    }

    public String getCodeCountry() {
        return this.countryCode;
    }
}
