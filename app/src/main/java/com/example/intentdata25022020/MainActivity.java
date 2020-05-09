package com.example.intentdata25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button mBtnString, mBtnArray,mBtnArrayList,mBtnOject,mBtnSerializable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);
        mBtnArrayList = findViewById(R.id.buttonArrayList);
        mBtnOject = findViewById(R.id.buttonObject);
        mBtnSerializable = findViewById(R.id.buttonSerializable);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("chuoi","xin chao Main2");
                startActivity(intent);
            }
        });
        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strings = {"A","B","C","D","E","F"};
                Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("array",strings);
                startActivity(intent);
            }
        });
        mBtnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
                Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("arrayList",arrayList);
                startActivity(intent);
            }
        });
        mBtnOject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animal meo = new Animal();
                meo.name = "Con meo";
                meo.weight = 9;
                Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Object", (Parcelable) meo);
                startActivity(intent);
            }
        });
        mBtnSerializable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bussiness bussiness = new Bussiness();
                bussiness.address="Quan 1";
                bussiness.name="Cong ty TNHH Thanh Dat";
                Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("serializable", bussiness);
                startActivity(intent);

            }
        });
    }
}
