package com.example.milcho.kurs4application;

import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Contact> list = getContactData();
        ContactAdapter adapter = new ContactAdapter(list,getLayoutInflater());
        getContactData();
        ListView listView = (ListView) findViewById(R.id.list1);
        listView.setAdapter(adapter);
    }

    private List<Contact> getContactData() {
        List<Contact> contactList =
                new ArrayList<>();
        Drawable picture =
                getResources().getDrawable(R.mipmap.ic_launcher);
        contactList.add(new Contact(picture, "Ivan Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Gesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Misho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pisho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "dad Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Ivan Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Gesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Misho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pisho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "dad Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Ivan Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Gesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Misho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pisho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "dad Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Ivan Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Gesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Misho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pisho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "dad Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Ivan Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Gesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Misho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pisho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "dad Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Ivan Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Gesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Misho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pisho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "dad Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Ivan Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Gesho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Misho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "Pisho Ivanov", "83828342382"));
        contactList.add(new Contact(picture, "dad Ivanov", "83828342382"));
        return contactList;


    }
}
