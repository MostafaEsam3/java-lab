public class Countries {
    private String code;
    private String name;
    private String contient;

    private int surfaceArea;
    private int population;
    private int gnp;
    private int capital;

    static int countObject;

    public Countries(String code,String name,String contient,int surface,int population, int gnp, int capital){
        this.code = code;
        this.name = name;
        this.contient = contient;
        this.surfaceArea = surface;
        this.population = population;
        this.gnp = gnp;
        this.capital = capital;

        // countObject++;
    }

    public int getCapital(){
        return this.capital;

    }
    public int getGnp(){
        return this.gnp;

    }
    public int getPopulation(){
        return this.population;

    }
    public int getSurfaceArea(){
        return this.surfaceArea;

    }
    public String getContient(){
        return this.contient;

    }
    public String getName(){
        return this.name;

    }
    public String getCode(){
        return this.code;

    }



}
