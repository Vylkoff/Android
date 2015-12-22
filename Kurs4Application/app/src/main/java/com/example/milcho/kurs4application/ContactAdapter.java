package com.example.milcho.kurs4application;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {


    private List<Contact> data;

    private LayoutInflater inflater;

    public ContactAdapter(List<Contact> data, LayoutInflater inflater) {
        this.data = data;

        this.inflater = inflater;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Contact getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // sazdavame leiaouta za edin red
        //proverqvame dali mojem da preizpolzvame reciklirano view
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_contact, parent, false);
            ViewHolder vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        }
        ViewHolder vh = (ViewHolder) convertView.getTag();
        //vzimame dannite koito trqbva da sa na toz red
        Contact thisContac = data.get(position);
//promenqme leiauta s tezi danni

        vh.avatar.setImageDrawable(thisContac.getAvtatar());

        vh.txtName.setText(thisContac.getName());

        vh.txtPhone.setText(thisContac.getPhone());
        //vryshtame celiq leiout
        return convertView;
    }

    class ViewHolder {
        ImageView avatar;
        TextView txtName;
        TextView txtPhone;

        public ViewHolder(View rootView) {
            this.avatar = (ImageView) rootView.findViewById(R.id.img_avatar);
            this.txtName = (TextView) rootView.findViewById(R.id.txt_name);
            this.txtPhone = (TextView) rootView.findViewById(R.id.txt_phone);
        }
    }
}
