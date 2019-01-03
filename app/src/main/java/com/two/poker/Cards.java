package com.two.poker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cards extends AppCompatActivity {
char[] color = {'\u2660' , '\u2666' , '\u2665' , '\u2663'};
int value;
    public  Cards(int value){
       this.value = value;
        }
    public String get() {
return ((value % 13) + 1) + "" + (color[value / 13]);

    }
}
