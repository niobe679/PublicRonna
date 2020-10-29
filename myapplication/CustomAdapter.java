package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter  extends ArrayAdapter<AccountInfo> {

    public CustomAdapter(Context context, int resource, List<AccountInfo> student) {

        super(context, resource, student);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.activity_main, parent, false);
        }

        AccountInfo userinfo = getItem(position);

        if (userinfo != null) {
            TextView tvStudentId = (TextView) v.findViewById(R.id.editTextTextBankNo);
            TextView tvStudentName = (TextView) v.findViewById(R.id.editTextTextBank);
            tvStudentId.setText(userinfo.PhoneNumber);
           // tvStudentName.setText(userinfo.);
        }

        return v;
    }
}
