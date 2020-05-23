package com.makeus.blive.src.tab_home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.makeus.blive.R;
import com.makeus.blive.src.FeedInfo;
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
        setRvFeed(view);

        return view;
    }

    private void setRvMyFavoriteMusicians(View view) {
        MyFavoriteRvAdapter myFavoriteRvAdapter = new MyFavoriteRvAdapter();
        RecyclerView rvMyFavorite = view.findViewById(R.id.home_rv_my_favorite_musicians);
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

    private void setRvFeed(View view) {
        FeedRvAdapter feedRvAdapter = new FeedRvAdapter();
        RecyclerView rvFeed = view.findViewById(R.id.home_rv_feed);
        rvFeed.setHasFixedSize(true);
        rvFeed.setLayoutManager(new LinearLayoutManager(view.getContext(), RecyclerView.VERTICAL, false));
        rvFeed.setAdapter(feedRvAdapter);

        // TODO: test code. erase it later
        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_2, "rock", "중랑구", "12분 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%5B%EC%B1%84%ED%99%98%EB%B2%84%EC%8A%A4%ED%82%B9%5D%EB%8C%80%EA%B5%AC%20%EA%B9%80%EA%B4%91%EC%84%9D%EA%B1%B0%EB%A6%AC%2C%20%EA%B9%80%EA%B4%91%EC%84%9D%EA%B8%B8%EC%97%90%EC%84%9C%20%EC%B1%84%ED%99%98%EC%86%A1%20%EC%8B%A4%EC%8B%9C%EA%B0%84%2C%20%EA%B9%80%EA%B4%91%EC%84%9D%EB%85%B8%EB%9E%98%20%ED%95%A8%EA%BB%98%20%EB%B6%88%EB%9F%AC%EB%B4%85%EB%8B%88%EB%8B%A4%2819%2010%206%29.mp4", 56, 10, 13,
                "대구 김광석 거리에서 채환송 실시간 어쿠스틱 버스킹 라이브... 김광석 노래 함께 불러봅니다."));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_4, "sky", "부평구", "49분 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/160301%20%ED%95%98%EB%9E%8C%EA%BE%BC%20%ED%99%8D%EB%8C%80%EB%B2%84%EC%8A%A4%ED%82%B9%EA%B3%B5%EC%97%B0%20%EC%A1%B0%EC%9A%A9%ED%95%84%28ChoYongPil%29_%EB%B0%94%EC%9A%B4%EC%8A%A4%28Bounce%29%28%EC%83%88%EB%82%B4%EA%B8%B0%28FreshMan%29_%EC%8A%B9%ED%98%B8focus%29.mp4", 17, 3, 0,
                "홍대에서 귀엽게 깜찍하게 >ㅅ< 신입생들 단체 댄스 버스킹!! 조용필 - 바운스 곡에 맞춰 안무 맞춰봤습니다."));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_3, "grace", "대학로", "2시간 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%EA%B7%80%EA%B0%80%20%ED%98%B8%EA%B0%95%ED%95%98%EB%8A%94%20%EC%B2%AD%EA%B3%84%EC%B2%9C%20%EC%95%84%EC%B9%B4%ED%8E%A0%EB%9D%BC%20%EB%B2%84%EC%8A%A4%ED%82%B9%EA%B3%B5%EC%97%B0%20%28%EB%9D%BC%EC%9D%B4%EC%98%A8%ED%82%B9OST%29.mp4", 507, 43, 26,
                "귀가 호강하는 청계천 아카펠라 버스킹 공연~~~ (라이온킹 OST)"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_1, "suzy", "하남시", "5시간 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/190804%20%EC%9C%A4%ED%95%98%20%EC%86%8C%EA%B7%B9%EC%9E%A5%20%EC%BD%98%EC%84%9C%ED%8A%B8%20%E6%BD%A4%E5%A4%8F%20-%20My%20Song%20And...%20%28Korean%20Ver.%29.mp4", 765, 127, 225,
                "My Song And... (Korean Ver.) 공연 라이브 현장감 그대로"));
    }
}
