package com.makeus.blive.src.tab_home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.makeus.blive.R;
import com.makeus.blive.src.MusicianInfo;

import static androidx.recyclerview.widget.RecyclerView.HORIZONTAL;

public class HomeFragment extends Fragment {
    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() { return new HomeFragment(); }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        setRvMyFavoriteMusicians(view);

        return view;
    }

    private void setRvMyFavoriteMusicians(View view) {
        MyFavoriteRvAdapter myFavoriteRvAdapter = new MyFavoriteRvAdapter();
        RecyclerView rvMyFavorite = view.findViewById(R.id.main_rv_my_favorite_musicians);
        rvMyFavorite.setHasFixedSize(true);
        rvMyFavorite.setLayoutManager(new LinearLayoutManager(view.getContext(), HORIZONTAL, false));
        rvMyFavorite.setAdapter(myFavoriteRvAdapter);

        // TODO: test code. erase it later
        myFavoriteRvAdapter.add(new MusicianInfo(R.drawable.photo_woman_1, "suzy", "경기도 하남시", true));
        myFavoriteRvAdapter.add(new MusicianInfo(R.drawable.photo_man_1, "mike", "부산 해운대구", true));
        myFavoriteRvAdapter.add(new MusicianInfo(R.drawable.photo_woman_2, "jane", "서울 금천구", false));
        myFavoriteRvAdapter.add(new MusicianInfo(R.drawable.photo_man_2, "rock", "중랑구 상봉동", false));
        myFavoriteRvAdapter.add(new MusicianInfo(R.drawable.photo_man_3, "yoondy", "중랑구 중화동", false));
        myFavoriteRvAdapter.add(new MusicianInfo(R.drawable.photo_woman_3, "grace", "서울 대학로", false));
        myFavoriteRvAdapter.add(new MusicianInfo(R.drawable.photo_man_4, "sky", "인천 부평구", false));
    }
}
