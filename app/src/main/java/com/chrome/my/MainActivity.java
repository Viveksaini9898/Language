package com.chrome.my;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Language languageAdapter;
    private List<languageNameList> languageList = new ArrayList<>();
    int[] color ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        languageAdapter = new Language(languageList);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(languageAdapter);
        color= getResources().getIntArray(R.array.colorArray);
        languageName();
    }

    private void languageName() {

        languageList.add( new languageNameList("हिन्दी", "Hindi",color[0]));
        languageList.add(new languageNameList("English", "English",color[1]));
        languageList.add(new languageNameList("اردو", "Urdu",color[2]));
        languageList.add(new languageNameList("bahasa Indonesia", "Indonesian",color[3]));
        languageList.add(new languageNameList("Nederlands", "Dutch",color[4]));
        languageList.add(new languageNameList("čeština", "Czech",color[5]));
        languageList.add(new languageNameList("Português", "Portuguese",color[6]));
        languageList.add(new languageNameList("svenska", "Swedish",color[7]));
        languageList.add(new languageNameList("Kiswahili", "Swahili",color[8]));
        languageList.add(new languageNameList("русский", "Russian",color[9]));
        languageList.add(new languageNameList("Română", "Romanian",color[1]));
        languageList.add(new languageNameList("Magyar", "Hungarian",color[5]));
        languageList.add(new languageNameList("Polskie", "Polish",color[0]));
        languageList.add(new languageNameList("Pilipino", "Filipino",color[2]));
        languageList.add(new languageNameList("Bahasa Melayu", "Malay",color[6]));
        languageList.add(new languageNameList("Türk", "Turkish",color[1]));
        languageList.add(new languageNameList("मराठी", "Marathi",color[9]));
        languageList.add(new languageNameList("Ελληνικά", "Greek",color[4]));
        languageList.add(new languageNameList("Zulu", "Zulu",color[7]));
        languageList.add(new languageNameList("ไทย", "Thai",color[5]));
        languageList.add(new languageNameList("عربى", "Arabic",color[2]));
        languageList.add(new languageNameList("বাংলা", "Bangla",color[0]));
        languageList.add(new languageNameList("Deutsche", "German",color[3]));
        languageList.add(new languageNameList("Española", "Spanish",color[8]));
        languageList.add(new languageNameList("Française", "French",color[9]));
        languageList.add(new languageNameList("Italiana", "Italian",color[6]));
        languageList.add(new languageNameList("יידיש", "Yiddish",color[2]));
        languageList.add(new languageNameList("日本人", "Japanese",color[5]));
        languageList.add(new languageNameList("한국어", "Korean",color[0]));
        languageList.add(new languageNameList("Український", "Ukrainian",color[1]));
        languageList.add(new languageNameList("Tiếng Việt", "Vietnamese",color[8]));
        languageList.add(new languageNameList("简体中文）", "Chinese(Simplified)",color[4]));
        languageList.add(new languageNameList("中國傳統的）", "Chinese(Traditional)",color[6]));
        languageList.add(new languageNameList("Bahasa Melayu", "Malay",color[9]));

    }
}