public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("plate contains " + food + " of food");
    }

    public int getTheRest(){
        return this.food;
    }

    public void setFood(int food){
        if (food >= 0){
        this.food = food;            
        }
        else{
            this.food = 0;
        }
    }

    public void fillThePlate(int amount){
        this.food += amount;
    }
}
