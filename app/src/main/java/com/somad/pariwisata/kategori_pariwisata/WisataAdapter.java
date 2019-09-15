package com.somad.pariwisata.kategori_pariwisata;

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

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {
    private List<Wisata> listWisata = new ArrayList<>();
    public WisataAdapter(List<Wisata> listWisata){
        this.listWisata = listWisata;
    }

    private OnWisataClickListener listener;

    public interface OnWisataClickListener{
        public void onClick(View view, int position);
    }

    public void setListener(OnWisataClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public WisataAdapter.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_pariwisata, viewGroup, false);
        WisataViewHolder viewHolder = new WisataViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WisataViewHolder wisataViewHolder, int i) {
        Wisata item = listWisata.get(i);
        wisataViewHolder.txtPhone.setText(item.getPhone());
        wisataViewHolder.txtName.setText(item.getName());
        Picasso.get().load(item.getImageUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(wisataViewHolder.imageWisata);
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageWisata;
        public TextView txtName, txtPhone;

        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageWisata = itemView.findViewById(R.id.imageContact);
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
