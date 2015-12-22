package com.example.milcho.kurs4application;


import android.graphics.drawable.Drawable;

public class Contact {

    Drawable avtatar;
    String name;
    String phone;

    public String getName() {
        return name;
    }

    public Drawable getAvtatar() {
        return avtatar;
    }

    public String getPhone() {
        return phone;
    }

    public Contact(Drawable avtatar, String name, String phone) {

        this.avtatar = avtatar;
        this.name = name;
        this.phone = phone;
    }
}
