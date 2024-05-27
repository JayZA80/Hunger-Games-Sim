public class Contestant {
    private String name;
    private String status = "Alive";
    private static final String DEFAULT_NAME = "Contestant";

    public Contestant() {
        this(DEFAULT_NAME);
    }

    public Contestant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getstatus() {
        return this.status;
    }

    public void passAway() {
        this.status = "Deceased";
    }

    // for testing purposes only
    public static void main(String args[]) {
        Contestant A = new Contestant("Mori");
        System.out.println(A.getName());
    }
}