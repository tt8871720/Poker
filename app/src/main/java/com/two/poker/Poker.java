package com.two.poker;

import java.util.Random;

public class Poker {
    Cards[] cards = new Cards[52];
    //因為使用矩陣 所以i要從0d\開始
    public Poker(){
        for (int i = 0; i < 52; i++){
            cards[i] = new Cards(i);
        }
    }
    public void shuffle(){
        for (int i = 0;i <52; i++){
            int ran = new Random().nextInt(52);
            Cards temp = cards[i];
            cards[i] = cards[ran];
            cards[ran] = temp;
        }
    }
    public void print(){
        for (int i = 0; i < 52; i++){
            System.out.print(cards[i].get() + "");
if (i % 13 == 12){
    System.out.println();
}
        }
    }
}
