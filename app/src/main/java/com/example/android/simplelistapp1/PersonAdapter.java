package com.example.android.simplelistapp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(@NonNull Context context, ArrayList<Person> personList) {
        super(context ,0, personList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.items , parent , false);
        }

        Person currentPersonPosition = getItem(position);

        TextView tvName = listItemView.findViewById(R.id.tvName);
        tvName.setText(currentPersonPosition.getmName());

        TextView tvText = listItemView.findViewById(R.id.tvText);
        tvText.setText(currentPersonPosition.getmText());

        ImageView img = listItemView.findViewById(R.id.img);
        img.setImageResource(currentPersonPosition.getmImg());

        return listItemView;
    }
}
