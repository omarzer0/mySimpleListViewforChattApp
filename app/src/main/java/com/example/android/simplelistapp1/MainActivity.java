package com.example.android.simplelistapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_ArrayList_To_ListView();

    }

    private void add_ArrayList_To_ListView() {
        final ArrayList<Person> personArrayList = new ArrayList<>();
        add_Items_to_ArrayList(personArrayList);

        //add items on the listView
        PersonAdapter personAdapter = new PersonAdapter(this , personArrayList);
        final ListView show_List = findViewById(R.id.show_List);
        show_List.setAdapter(personAdapter);

        // add on itemClieckListener
        show_List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this , Profile.class);
                intent.putExtra("name" , personArrayList.get(position).getmName());
                intent.putExtra("text" , personArrayList.get(position).getmText());
                intent.putExtra("img" , personArrayList.get(position).getmImg());
                startActivity(intent);
            }
        });
    }

    private void add_Items_to_ArrayList(ArrayList<Person> personArrayList) {
        personArrayList.add(new Person("omar" , "you can not tell lies" , R.drawable.img1));
        personArrayList.add(new Person("bla bla bla" , "you can not tell lies" , R.drawable.img2));
        personArrayList.add(new Person("ha ha ha" , "you can not tell lies" , R.drawable.img3));
        personArrayList.add(new Person("omar" , "you can not tell lies" , R.drawable.img1));
        personArrayList.add(new Person("bla bla bla" , "you can not tell lies" , R.drawable.img2));
        personArrayList.add(new Person("ha ha ha" , "you can not tell lies" , R.drawable.img3));
        personArrayList.add(new Person("omar" , "you can not tell lies" , R.drawable.img1));
        personArrayList.add(new Person("bla bla bla" , "you can not tell lies" , R.drawable.img2));
        personArrayList.add(new Person("ha ha ha" , "you can not tell lies" , R.drawable.img3));
        personArrayList.add(new Person("omar" , "you can not tell lies" , R.drawable.img1));
        personArrayList.add(new Person("bla bla bla" , "you can not tell lies" , R.drawable.img2));
        personArrayList.add(new Person("ha ha ha" , "you can not tell lies" , R.drawable.img3));
    }
}
