public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    {
        fullness = false;
    }

    public Cat(String name, int appetite){
        this.appetite = appetite;
        this.name = name;
    }


    public int getAppetite(){
        return this.appetite;
    }

    public void setAppetite(int appetite){
        this.appetite = appetite;
    }

    public String getName(){
        return this.name;
    }

    public int eat(int food){
        if(food >= this.appetite){
            this.fullness = true;
            System.out.printf("Cat named %s is full and happy\n", name);
            return food - appetite;
        }
        else{
            this.fullness = false;
            System.out.printf("Cat named %s is still hungry", this.name);
            return food;
        }
    }
}
