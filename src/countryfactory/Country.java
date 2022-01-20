package countryfactory;

public class Country {
    public String name;
    public long population;
    public String capital;


    public Country(String name, long population, String capital) {
       this.name = name;
       this.population = population;
       this.capital = capital;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                ", Population: " + population +
                ", Capital: " + capital;
    }
}
