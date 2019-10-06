package com.example.kisahfiksi_manipulatoruniverse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater inflater;
    private String[] jCerita;
    private String[] iCerita;

    Adapter(Context context, String[] judul, String [] isi){
        this.inflater = LayoutInflater.from(context);
        this.jCerita = judul;
        this.iCerita = isi;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.custom_view2,viewGroup);
        return new ViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    String judul = jCerita[i];
    String isi = iCerita [i];
    viewHolder.judulCerita.setText(judul);
    viewHolder.isiCerita.setText(isi);
    }

    @Override
    public int getItemCount() {
        return jCerita.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView judulCerita,isiCerita;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judulCerita = itemView.findViewById(R.id.judulCerita);
            isiCerita = itemView.findViewById(R.id.isiCerita);
        }
    }
}
