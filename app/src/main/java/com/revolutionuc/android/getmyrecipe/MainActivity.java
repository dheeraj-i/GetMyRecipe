package com.revolutionuc.android.getmyrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mAvailableIngredients = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){

        CheckBox chicken = (CheckBox) findViewById(R.id.chicken_checkbox);
        boolean hasChicken = chicken.isChecked();

        CheckBox onion = (CheckBox) findViewById(R.id.onion_checkbox);
        boolean hasOnion = onion.isChecked();

        CheckBox tomato = (CheckBox) findViewById(R.id.tomato_checkbox);
        boolean hasTomato = tomato.isChecked();

        CheckBox eggs = (CheckBox) findViewById(R.id.eggs_checkbox);
        boolean hasEggs = eggs.isChecked();

        CheckBox salt = (CheckBox) findViewById(R.id.salt_checkbox);
        boolean hasSalt = salt.isChecked();

        CheckBox cilantro = (CheckBox) findViewById(R.id.cilantro_checkbox);
        boolean hasCilantro = cilantro.isChecked();

        String orderSummary = availableItems(hasChicken, hasOnion, hasTomato, hasEggs, hasSalt, hasCilantro);

    }

    public String availableItems(boolean chickenAvailable, boolean onionAvailable, boolean tomatoAvailable, boolean eggsAvailable, boolean saltAvailable, boolean cilantroAvailable){
        String ingredientsAvailable = "";
        if (chickenAvailable){
            mAvailableIngredients.add("Chicken");
        }


        return "";
    }
}
