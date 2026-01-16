package logic;

public class CardCounter {

    private UnitCard card;
    private int count;
    public CardCounter(UnitCard card,int count){
        setCard(card);
        setCount(count);
    }
    public void setCount(int count){
        this.count=Math.max(0,count);
    }
    public void setCard(UnitCard card){
        this.card=card;
    }
    public UnitCard getCard(){

        return this.card;
    }
    public int getCount(){
        return  this.count;
    }
    public String toString() {
        return  this.getCard() + " x " + this.getCount();
    }

}
