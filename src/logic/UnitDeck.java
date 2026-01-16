package logic;

import java.util.ArrayList;

public class UnitDeck {
    private ArrayList<CardCounter> cardsInDeck;
    private String deckName;
    public UnitDeck(String deckName){
        this.cardsInDeck =   new ArrayList<>();
        setDeckName(deckName);
    }
    public void setDeckName(String deckName){
        if(deckName.isBlank()){
            this.deckName ="Untitled Deck";
        }
        else this.deckName=deckName;
    }

    public String getDeckName(){
        return this.deckName;
    }
    public ArrayList<CardCounter> getCardsInDeck() {
        return cardsInDeck;
    }
    public void addCard(UnitCard newCard,int count){
        if(count<1)return;
        int wherei=-1;
        for(int i=0;i<this.cardsInDeck.size();i++){
            if(newCard.equals(cardsInDeck.get(i).getCard())){
                wherei=i;
                break;
            }
        }
        if(wherei!=-1){
            cardsInDeck.get(wherei).setCount(cardsInDeck.get(wherei).getCount()+count);
        }
        else{
            cardsInDeck.add(new CardCounter(newCard,count));
        }
    }
    public void removeCard(UnitCard toRemove, int count){
        if(count < 1)return;
        for(int i=0;i<this.cardsInDeck.size();i++){
            if(toRemove.equals(cardsInDeck.get(i).getCard())){
                int newCount =cardsInDeck.get(i).getCount();
                newCount -= count;
                if(newCount<=0){
                    cardsInDeck.remove(i);
                }
                else {
                    cardsInDeck.get(i).setCount(newCount);
                }
            }
        }
    }
    public  int cardCount(){
        int total=0;
        for(int i=0;i<this.cardsInDeck.size();i++){
            total+=this.cardsInDeck.get(i).getCount();
        }
        return  total;
    }
    public boolean existsInDeck(UnitCard card){
        for(int i=0;i<this.cardsInDeck.size();i++){
            if(card.equals(this.cardsInDeck.get(i).getCard()))return true;
        }
        return false;
    }
    public boolean equals(UnitDeck other){
        return this.deckName.equals(other.getDeckName());
    }
}
