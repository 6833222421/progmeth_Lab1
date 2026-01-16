package logic;

public class UnitCard {
    private String name;
    private int bloodCost;
    private int power;
    private int health;
    private String flavorText;
    public UnitCard(String name,int bloodCost,int power,int health,String flavorText){
        setName(name);
        setBloodCost(bloodCost);
        setPower(power);
        setHealth(health);
        setFlavorText(flavorText);
    }
    public void setName(String name){
        if(name.isBlank()) this.name = "Creature";
        else {
            this.name=name;
        }
    }
    public void setBloodCost(int bloodCost){
        this.bloodCost = Math.max(bloodCost, 0);
    }
    public void setPower(int power){
        this.power = Math.max(power, 0);
    }
    public void setHealth(int health){
        this.health = Math.max(health, 1);
    }
    public  void setFlavorText(String flavorText){
        this.flavorText=flavorText;
    }
    public boolean equals(UnitCard other){
        return this.name.equals(other.getName());
    }
    public String getName(){
        return this.name;
    }
    public int getBloodCost(){
        return this.bloodCost;
    }
    public  int getPower(){
        return  this.power;
    }
    public  int getHealth(){
        return  this.health;
    }
    public  String getFlavorText(){
        return  this.flavorText;
    }
    public String toString() {
        return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
    }
}
