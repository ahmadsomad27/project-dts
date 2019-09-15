package com.somad.pariwisata.kategori_tari;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.somad.pariwisata.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class TariAdapter extends RecyclerView.Adapter<TariAdapter.TariViewHolder> {
    private List<ModelTari> listTari = new ArrayList<>();
    public TariAdapter(List<ModelTari> listTari){
        this.listTari = listTari;
    }

    private OnTariClickListener listener;

    public interface OnTariClickListener{
        public void onClick(View view, int position);
    }

    public void setListener(OnTariClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public TariAdapter.TariViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_tari, viewGroup, false);
        TariViewHolder viewHolder = new TariViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TariViewHolder tariViewHolder, int i) {
        ModelTari item = listTari.get(i);
        tariViewHolder.txtPhone.setText(item.getPhone());
        tariViewHolder.txtName.setText(item.getName());
        Picasso.get().load(item.getImageUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(tariViewHolder.imageTari);
    }

    @Override
    public int getItemCount() {
        return listTari.size();
    }

    public class TariViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageTari;
        public TextView txtName, txtPhone;

        public TariViewHolder(@NonNull View itemView) {
            super(itemView);
            imageTari = itemView.findViewById(R.id.imageContact);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }
}
