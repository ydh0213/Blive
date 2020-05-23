package com.makeus.blive.src.tab_home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeus.blive.R;
import com.makeus.blive.src.MusicianInfo;

import java.util.ArrayList;

class MyFavoriteRvAdapter extends RecyclerView.Adapter<MyFavoriteRvAdapter.MyFavoriteViewHolder> {
    private ArrayList<MusicianInfo> myFavoriteList = new ArrayList<>();

    @NonNull
    @Override
    public MyFavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_my_favorite_musician, parent, false);
        return new MyFavoriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyFavoriteViewHolder holder, int position) {
        holder.bind(myFavoriteList.get(position));
    }

    public void add(MusicianInfo musicianInfo) { myFavoriteList.add(musicianInfo); }

    @Override
    public int getItemCount() {
        return myFavoriteList.size();
    }

    public class MyFavoriteViewHolder extends RecyclerView.ViewHolder {
        ImageView ivProfilePhoto;
        ImageView ivProfileDot;
        TextView tvName;
        ImageView ivPin;
        TextView tvLocation;

        public MyFavoriteViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfilePhoto = itemView.findViewById(R.id.my_favorite_iv_profile_photo);
            ivProfileDot = itemView.findViewById(R.id.my_favorite_iv_profile_dot);
            tvName = itemView.findViewById(R.id.my_favorite_tv_name);
            ivPin = itemView.findViewById(R.id.my_favorite_iv_pin_icon);
            tvLocation = itemView.findViewById(R.id.my_favorite_tv_location);
        }

        public void bind(MusicianInfo musicianInfo) {
            ivProfilePhoto.setImageResource(musicianInfo.getProfilePhotoId());
            ivProfileDot.setImageResource(musicianInfo.isActive() ?
                    R.drawable.ic_dot_light_green : R.drawable.ic_dot_inactive);
            tvName.setText(musicianInfo.getName());
            ivPin.setImageResource(musicianInfo.isActive() ?
                    R.drawable.ic_pin_active : R.drawable.ic_pin_inactive);
            tvLocation.setText(musicianInfo.getLocation());
            tvLocation.setTextColor(musicianInfo.isActive() ?
                    itemView.getResources().getColor(R.color.color_active)
                    : itemView.getResources().getColor(R.color.color_inactive));
        }
    }
}
