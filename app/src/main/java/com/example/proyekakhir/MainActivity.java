package com.example.proyekakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBurger;
    private ArrayList<Burger> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBurger = findViewById(R.id.rv_burger);
        rvBurger.setHasFixedSize(true);
        list.addAll(BurgerData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvBurger.setLayoutManager(new LinearLayoutManager(this));
        ListBurgerAdapter listBurgerAdapter = new ListBurgerAdapter(list);
        rvBurger.setAdapter(listBurgerAdapter);
        listBurgerAdapter.setOnItemCliclCallback(new ListBurgerAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Burger burger) {
                Intent moveIntent = new Intent(MainActivity.this, DetailBurgerActivity.class);
                moveIntent.putExtra(DetailBurgerActivity.ITEM_EXTRA, burger);
                startActivity(moveIntent);

            }
        });
    }


    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}