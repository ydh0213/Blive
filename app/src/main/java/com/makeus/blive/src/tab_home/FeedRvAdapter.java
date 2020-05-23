package com.makeus.blive.src.tab_home;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeus.blive.R;
import com.makeus.blive.src.FeedInfo;

import java.util.ArrayList;

class FeedRvAdapter extends RecyclerView.Adapter<FeedRvAdapter.FeedViewHolder> {
    private ArrayList<FeedInfo> feedInfoList = new ArrayList<>();
    
    @NonNull
    @Override
    public FeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_feed, parent, false);
        return new FeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedViewHolder holder, int position) {
        holder.bind(feedInfoList.get(position));
    }

    @Override
    public int getItemCount() { return feedInfoList.size(); }

    public void add(FeedInfo feedInfo) { feedInfoList.add(feedInfo); }

    public class FeedViewHolder extends RecyclerView.ViewHolder {
        ImageView ivProfilePhoto;
        TextView tvName;
        TextView tvLocation;
        TextView tvDate;
        VideoView vv;
        TextView tvPeopleCount;
        TextView tvHeartCount;
        TextView tvMusicNoteCount;
        TextView tvContent;

        public FeedViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfilePhoto = itemView.findViewById(R.id.feed_iv_profile_photo);
            tvName = itemView.findViewById(R.id.feed_tv_name);
            tvLocation = itemView.findViewById(R.id.feed_tv_location);
            tvDate = itemView.findViewById(R.id.feed_tv_date);
            vv = itemView.findViewById(R.id.feed_vv);
            tvPeopleCount = itemView.findViewById(R.id.feed_tv_people_count);
            tvHeartCount = itemView.findViewById(R.id.feed_tv_heart_count);
            tvMusicNoteCount = itemView.findViewById(R.id.feed_tv_music_note_count);
            tvContent = itemView.findViewById(R.id.feed_tv_content);
        }

        public void bind(FeedInfo feedInfo) {
            ivProfilePhoto.setImageResource(feedInfo.getProfilePhotoId());
            tvName.setText(feedInfo.getName());
            tvLocation.setText(feedInfo.getLocation());
            tvDate.setText(feedInfo.getDate());

            Uri videoUri = Uri.parse(feedInfo.getVideoUrl());
//            vv.setMediaController(new MediaController(itemView.getContext()));
            vv.setVideoURI(videoUri);
            vv.setOnPreparedListener(mp -> vv.start());

            tvPeopleCount.setText(String.valueOf(feedInfo.getPeopleCount()));
            tvHeartCount.setText(String.valueOf(feedInfo.getHeartCount()));
            tvMusicNoteCount.setText(String.valueOf(feedInfo.getMusicNoteCount()));
            tvContent.setText(feedInfo.getContent());
        }
    }
}
