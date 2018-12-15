package com.two.poker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cards extends AppCompatActivity {
char[] color = {'S' , 'D' , 'H' , 'C'};
int card[] = new int[52];
int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
    }
    public  Cards(int value){
       this.value = value;
        }
    public String get() {
return (value % 13) + (color[value / 13])+ "";

    }
}
