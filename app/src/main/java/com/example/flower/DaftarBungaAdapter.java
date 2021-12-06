package com.example.flower;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import com.example.flower.Model.Bunga;

public class DaftarBungaAdapter extends ArrayAdapter<Bunga> {

    Context context;

    public DaftarBungaAdapter(Context context, List<Bunga> bungas) {
        super(context, R.layout.row_daftar_bunga, bungas);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Bunga bunga = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_bunga, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_bunga);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(bunga.getNama());
        viewHolder.textAsal.setText(bunga.getAsal());
        viewHolder.gambar.setImageDrawable(context.getDrawable(bunga.getDrawableRes()));
        return convertView;
    }

}