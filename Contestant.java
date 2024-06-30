public class Contestant {
    private String name;
    private String status = "Alive";
    private static final String DEFAULT_NAME = "Contestant";
    private int charisma = (int)(Math.random() * 10 + 1);
    private int cunning = (int)(Math.random() * 10 + 1);
    private int strength = (int)(Math.random() * 10 + 1);

    public Contestant() {
        this(DEFAULT_NAME);
    }

    public Contestant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }

    public int getCharisma() {
        return this.charisma;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getStrength() {
        return this.strength;
    }

    public void passAway() {
        this.status = "Deceased";
    }
}
