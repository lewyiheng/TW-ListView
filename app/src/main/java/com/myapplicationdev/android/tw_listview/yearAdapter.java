package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class yearAdapter extends ArrayAdapter<year> {
    private ArrayList<year> year;
    private Context context;
    private TextView tvYear;

    public yearAdapter(Context context, int resource, ArrayList<year> objects){
        super(context, resource, objects);
        year = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.year_row,parent,false);

        tvYear = rowView.findViewById(R.id.tvYear);

        year currentYear = year.get(position);
        tvYear.setText(currentYear.getYear());
        return rowView;
    }
}
