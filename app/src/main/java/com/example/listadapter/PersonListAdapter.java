package com.example.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

class PersonListAdapter extends ArrayAdapter<Person> {

    private final String TAG = "PersonListAdapter";
    private Context mContext;
    int mResource;

    public PersonListAdapter(Context context, int resource, ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the person information
        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        //create person object with information
        Person person = new Person(name, birthday, sex);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = convertView.findViewById(R.id.txtOne);
        TextView tvBirthday = convertView.findViewById(R.id.txtTwo);
        TextView tvSex = convertView.findViewById(R.id.txtThree);

        //set textViews to strings declared while getting a person info
        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);

        return convertView;
    }
}


