package com.two.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));

    }
    class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerViewHolder>{
        @NonNull
        @Override
        public PokerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = getLayoutInflater().inflate(R.layout.row , viewGroup , false);
            return new PokerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PokerViewHolder pokerViewHolder, int i) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        class PokerViewHolder extends RecyclerView.ViewHolder{
            TextView pokertext;
           public PokerViewHolder (View itemView){
               super(itemView);
               pokertext = findViewById(R.id.textpoker);
           }
        }
    }

    }





