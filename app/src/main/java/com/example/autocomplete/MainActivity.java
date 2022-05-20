package com.example.autocomplete;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] fruit ={"Apple","Mango","Orange","Banana","Watermelon","Grapes","Cherry","Pineapple","Kiwi","Strawberry","Litchi","Blueberry","Raspberry","Guava","Custard apple","Pomegranate","Dragon fruit","Gooseberry","Jack fruit","Lime","Peach","Pear","Fig","Muskmelon","Olives","Java Plum","Papaya","Mulberry","Sugarcane"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,fruit);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
    }
}