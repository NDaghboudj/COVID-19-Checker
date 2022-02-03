package com.github.ndaghboudj.covid19_checker;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


class AdapterFeature extends RecyclerView.Adapter<AdapterFeature.ViewHolderFeature>{
    ArrayList<String> features = new ArrayList<>();
    private OnItemClickedListener listener;

    class ViewHolderFeature extends RecyclerView.ViewHolder {
        private CheckBox checkBox;

        public ViewHolderFeature(@NonNull View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.chb_feature_name);
            checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClicked(getAdapterPosition(), ((CheckBox) v).isChecked());
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolderFeature onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_features, parent, false);
        return new ViewHolderFeature(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFeature holder, int position) {
        String feature_name = features.get(position);
        holder.checkBox.setText(feature_name);
    }

    @Override
    public int getItemCount() {
        return features.size();
    }

    public void setFeatures(ArrayList<String> features) {
        this.features = features;
        notifyDataSetChanged();
    }

    public interface OnItemClickedListener {
        void onItemClicked(int position, boolean checked);
    }

    public void setOnItemClickedListener(OnItemClickedListener listener) {
        this.listener = listener;
    }
}
