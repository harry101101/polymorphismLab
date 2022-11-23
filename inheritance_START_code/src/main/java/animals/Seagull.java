package animals;

public class Seagull extends Animal{
    private int numberOfEggs;

    public Seagull(String name, int numberOfEggs){
        super(name);
        this.numberOfEggs = numberOfEggs;
    }
}
