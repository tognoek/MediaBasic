package com.example.mediaexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Song> arrayList;
    AdapterSong adapterSong;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddSOng();
        lv = findViewById(R.id.lv);
        adapterSong = new AdapterSong(this, R.layout.song, arrayList);
        lv.setAdapter(adapterSong);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, PlayMedia.class);
                intent.putExtra("Song", arrayList.get(i));
                startActivity(intent);
            }
        });
    }

    private void AddSOng(){
        arrayList = new ArrayList<>();
        arrayList.add(new Song("Chuyện cũ bỏ qua", R.raw.chuyencuboqua));
        arrayList.add(new Song("Đi để trở về", R.raw.didetrove));
        arrayList.add(new Song("Đi về nhà", R.raw.divenha));
        arrayList.add(new Song("Một năm mới bình an", R.raw.motnammoibinhan));
        arrayList.add(new Song("Tết an bình", R.raw.tetbinhan));
        arrayList.add(new Song("Tết đong đầy", R.raw.tetdongday));
    }
}