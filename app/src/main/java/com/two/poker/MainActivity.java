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
    Poker poker = new Poker();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poker.shuffle();
        poker.print();
        recyclerView = findViewById(R.id.recycler);
       recyclerView.setHasFixedSize(true);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(new PokerAdapter());
        }
    class  PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerHolder> {
        @NonNull
        @Override
        public PokerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View  view = getLayoutInflater()
                    .inflate(R.layout.poker_row, parent , false);
            return new PokerHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PokerHolder holder, int position) {
holder.pokertext.setText(poker.cards[position].get());
        }

        @Override
        public int getItemCount() {
            return poker.cards.length;
        }

        class PokerHolder extends RecyclerView.ViewHolder {
            TextView pokertext;
            public PokerHolder(@NonNull View itemView) {
                super(itemView);
                pokertext = itemView.findViewById(R.id.poker_text);
            }
        }
    }
    }





