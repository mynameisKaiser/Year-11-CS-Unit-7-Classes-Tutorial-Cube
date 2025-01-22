public class Cube {
    //Properties
    private int side;
    //Constructors
    public Cube(){
        side=1;
    }
    public Cube(int side){
        if (side < 1){
            throw new IllegalArgumentException("Side length can't be less than 1");
        }
        setSide(side);
    }
    //Behaviours
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        if (side<1){
            throw new IllegalArgumentException("Side length can't be less than 1");
        }
        this.side=side;
    }
    public int calculateSurfaceArea(){
        int face=side*side;
        return face*6;
    }
    public int calculateVolume(){
        return side*side*side;
    }
    public String toString(){
        return "Cube{side="+side+"}";
    }
}
