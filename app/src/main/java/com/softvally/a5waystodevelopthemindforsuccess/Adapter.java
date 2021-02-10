package com.softvally.a5waystodevelopthemindforsuccess;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    private static ClickListener clickListener;
    Context context;
    int[] images;
    String[] country;


    public Adapter() {
    }

    public Adapter(Context context, int[] images, String[] country) {
        this.context = context;
        this.images = images;
        this.country = country;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.sample, viewGroup, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
        viewholder.title.setText(country[i]);
        //viewholder.title1.setText(country1[i]);
        viewholder.image.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return country.length;
    }

    public class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        ImageView image;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.bookId);
            //title1 = itemView.findViewById(R.id.book1Id);
            image = itemView.findViewById(R.id.image);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {


            clickListener.onItemClick(getAdapterPosition(), v);


        }
    }

    public interface ClickListener {

        void onItemClick(int position, View v);

    }

    public void setOnItemClickListener(ClickListener clickListener) {


        Adapter.clickListener = clickListener;
    }
}
