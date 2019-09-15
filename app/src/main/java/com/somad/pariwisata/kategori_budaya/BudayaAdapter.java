package com.somad.pariwisata.kategori_budaya;

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

public class BudayaAdapter extends RecyclerView.Adapter<BudayaAdapter.BudayaViewHolder> {

    private List<ModelBudaya> listBudaya = new ArrayList<>();
    public BudayaAdapter(List<ModelBudaya> listBudaya){
        this.listBudaya = listBudaya;
    }

    private OnBudayaClickListener listener;

    public interface OnBudayaClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(OnBudayaClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public BudayaAdapter.BudayaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_budaya, viewGroup, false);
        BudayaViewHolder viewHolder = new BudayaViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BudayaViewHolder budayaViewHolder, int i) {
        ModelBudaya item = listBudaya.get(i);
        budayaViewHolder.txtPhone.setText(item.getPhone());
        budayaViewHolder.txtName.setText(item.getName());
        Picasso.get().load(item.getImageUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(budayaViewHolder.imageBudaya);
    }

    @Override
    public int getItemCount() {
        return listBudaya.size();
    }



    public class BudayaViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageBudaya;
        public TextView txtName, txtPhone;

        public BudayaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageBudaya = itemView.findViewById(R.id.imageContact);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }

}
