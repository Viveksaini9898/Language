package com.chrome.my;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Language languageAdapter;
    private List<languageNameList> languageList = new ArrayList<>();


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        languageAdapter = new Language(languageList);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(languageAdapter);
        languageName();
    }

    private void languageName() {

        languageNameList data = new languageNameList("hindi", "Hindi");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("urdu", "Urdu");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("urdu", "Urdu");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("urdu", "Urdu");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
        data = new languageNameList("english", "English");
        languageList.add(data);
    }
}