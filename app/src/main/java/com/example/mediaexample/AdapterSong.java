package com.example.mediaexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterSong extends ArrayAdapter {
    Activity context;
    int Idlayout;
    ArrayList<Song> myList;
    public AdapterSong(Activity context, int Idlayout, ArrayList<Song> myList) {
        super(context, Idlayout, myList);
        this.context = context;
        this.Idlayout = Idlayout;
        this.myList = myList;
    }

    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup
            parent) {
        LayoutInflater myInflactor = context.getLayoutInflater();
        convertView = myInflactor.inflate(Idlayout,null);
        Song item = myList.get(position);
        TextView textName = convertView.findViewById(R.id.name);
        textName.setText(item.getName());
        return convertView;
    }
}