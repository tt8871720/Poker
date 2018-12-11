package com.two.poker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cards extends AppCompatActivity {
char[] color = {'S' , 'D' , 'H' , 'C'};
int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
    }
    public  Cards(int value){
        for (int i = 0;i >= value;i++){
            System.out.print((value % 13) + color[(value / 13)]);
        }
    }
    public void get(int value) {
this.value = value;

    }
}
