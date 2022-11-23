package animals;

public class Lion extends Animal {

    private boolean canWaitToBeKing;
    public Lion(String name, boolean canWaitToBeKing){
        super(name);
        this.canWaitToBeKing = canWaitToBeKing;
    }

    public String makeNoise(){
        return "roar";
    }
}
