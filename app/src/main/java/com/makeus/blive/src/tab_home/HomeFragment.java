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
/*
        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_2, "rock", "중랑구", "12분 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%5B%EC%B1%84%ED%99%98%EB%B2%84%EC%8A%A4%ED%82%B9%5D%EB%8C%80%EA%B5%AC%20%EA%B9%80%EA%B4%91%EC%84%9D%EA%B1%B0%EB%A6%AC%2C%20%EA%B9%80%EA%B4%91%EC%84%9D%EA%B8%B8%EC%97%90%EC%84%9C%20%EC%B1%84%ED%99%98%EC%86%A1%20%EC%8B%A4%EC%8B%9C%EA%B0%84%2C%20%EA%B9%80%EA%B4%91%EC%84%9D%EB%85%B8%EB%9E%98%20%ED%95%A8%EA%BB%98%20%EB%B6%88%EB%9F%AC%EB%B4%85%EB%8B%88%EB%8B%A4%2819%2010%206%29.mp4", 56, 10, 13,
                "대구 김광석 거리에서 채환송 실시간 어쿠스틱 버스킹 라이브... 김광석 노래 함께 불러봅니다."));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_4, "sky", "부평구", "49분 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/160301%20%ED%95%98%EB%9E%8C%EA%BE%BC%20%ED%99%8D%EB%8C%80%EB%B2%84%EC%8A%A4%ED%82%B9%EA%B3%B5%EC%97%B0%20%EC%A1%B0%EC%9A%A9%ED%95%84%28ChoYongPil%29_%EB%B0%94%EC%9A%B4%EC%8A%A4%28Bounce%29%28%EC%83%88%EB%82%B4%EA%B8%B0%28FreshMan%29_%EC%8A%B9%ED%98%B8focus%29.mp4", 17, 3, 0,
                "홍대에서 귀엽게 깜찍하게 >ㅅ< 신입생들 단체 댄스 버스킹!! 조용필 - 바운스 곡에 맞춰 안무 맞춰봤습니다."));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_1, "윤하", "하남시", "5시간 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/190804%20%EC%9C%A4%ED%95%98%20%EC%86%8C%EA%B7%B9%EC%9E%A5%20%EC%BD%98%EC%84%9C%ED%8A%B8%20%E6%BD%A4%E5%A4%8F%20-%20My%20Song%20And...%20%28Korean%20Ver.%29.mp4", 765, 127, 225,
                "My Song And... (Korean Ver.) 공연 라이브 현장감 그대로"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_5_small, "윤도현", "신촌", " 5시간 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/190730%20YB%EC%9C%A4%EB%8F%84%ED%98%84%20%ED%99%8D%EB%8C%80%EB%B2%84%EC%8A%A4%ED%82%B9%20%EC%A7%81%EC%BA%A0-%20%EB%82%98%EB%8A%94%20%EB%82%98%EB%B9%84.mp4", 18733, 1684, 2834,
                "YB윤도현 홍대버스킹 직캠 - 나는 나비, 담배가게 아가씨, ..."));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_6_small, "김강현", "홍대", "8시간 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%EC%9D%B4%20%EB%82%A8%ED%95%99%EC%83%9D%EC%9D%98%20%EB%86%80%EB%9D%BC%EC%9A%B4%20%ED%94%BC%EC%95%84%EB%85%B8%20%EC%86%8D%EC%A3%BC%20%E3%85%8E%E3%84%B7%E3%84%B7%20%EC%82%AC%EB%9E%8C%20%EB%AA%A8%EC%9D%B4%EB%8A%94%20%EC%86%8D%EB%8F%84%20%EB%B3%B4%EC%84%B8%EC%9A%94%20%28%EA%B9%80%EA%B4%91%EC%97%B0%20%ED%99%8D%EB%8C%80%20%EC%8B%A0%EC%B4%8C%29.mp4", 242, 100, 50,
                "홍대 피아노 연주 버스킹 놀라운 실력의 소년"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_4_small, "Jyukai", "도쿄", "1일 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/Amazing%20Violin%20Street%20Performer%20-%20Japan.mp4", 72, 12, 15,
                "일본 길거리 바이올린 버스킹 공연 소름돋는 연주... 급속도로 몰려드는 인파... 돈주고 들어도 아깝지 않은 전율 돋는 실력"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_5_small, "데일리 버스킹", "신촌", "1일 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%EB%8C%84%EC%8A%A4%EB%8C%80%ED%9A%8C%20%EB%82%9C%EC%9E%85%ED%95%9C%20%EA%B3%A0%EC%96%91%EC%9D%B4%20%EC%95%8C%EB%B0%94%EC%9D%98%20%EB%AF%B8%EC%B9%9C%20%EC%A6%89%ED%9D%A5%20%EB%8C%84%EC%8A%A4%20%EC%8B%A4%EB%A0%A5%20%E3%85%8E%E3%84%B7%E3%84%B7%20%EC%A7%84%ED%96%89%EC%9E%90%20%EB%86%80%EB%9E%8C%20%E3%85%8B%E3%85%8B%28%EC%8B%A0%EC%B4%8C%29.mp4", 895, 37, 37,
                "댄스대회 난입한 고양이 알바의 미친 댄스 실력 ㅋㅋㅋㅋ"));
*/
/*
        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_6_small, "체리필터", "강남", "2일 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%5B%EC%A7%81%EC%BA%A0%5D%5B4K%2060P%5D%20%EC%B2%B4%EB%A6%AC%ED%95%84%ED%84%B0%20-%20Five%20%5B190518%20%EC%B2%B4%EB%A6%AC%ED%95%84%ED%84%B0%20%EC%86%8C%EA%B7%B9%EC%9E%A5%20%EC%BD%98%EC%84%9C%ED%8A%B8%5D.mp4", 2728, 1080, 512,
                "[4K] 체리필터 소극장 공연 라이브 - 가창력의 정점 보컬 끝판왕 현장감 대박!"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_3, "Charlie and Boys", "맨하탄", "3일 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%EA%B1%B0%EB%A6%AC%EA%B3%B5%EC%97%B0%EC%A4%91%20%EC%9A%B0%EC%97%B0%ED%9E%88%20%EB%A7%8C%EB%82%9C%203%EB%AA%85%EC%9D%98%20%EB%AF%B8%EA%B5%AD%EC%84%B1%EB%8B%98%EB%93%A4%E3%84%B7%E3%84%B7.mp4", 16, 1, 2,
                "길거리 기타 연주 미국 성님들 클라스"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_man_1, "산타토마스 합창단", "금천구", "5일 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%EC%9C%A0%EB%9F%BD%ED%95%A9%EC%B0%BD%20%EB%8C%80%EC%83%81%ED%8C%80%EC%9D%B4%20%ED%95%9C%EA%B5%AD%20%EB%8F%BC%EC%A7%80%EA%B5%AD%EB%B0%A5%EC%A7%91%EC%97%90%EC%84%9C%20%EC%8B%9D%EC%82%AC%ED%95%98%EB%A9%B4%20%EC%83%9D%EA%B8%B0%EB%8A%94%20%EC%9D%BC%20%20%20%ED%95%84%EB%A6%AC%ED%95%80%20%EC%82%B0%ED%83%80%ED%86%A0%EB%A7%88%EC%8A%A4%20%ED%95%A9%EC%B0%BD%EB%8B%A8.mp4", 94, 25, 8,
                "[감동주의] 유럽합창 대상팀이 한국 돼지국밥집에서 식사하면 생기는 일"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_7_small, "성윤", "건대", "1주일 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%EB%B0%95%ED%9A%A8%EC%8B%A0%20GOODBYE%20%EC%97%AC%EC%9E%90%ED%82%A4%20%EA%B1%B4%EB%8C%80%20%EB%B2%84%EC%8A%A4%ED%82%B9.mp4", 43, 2, 15,
                "건대에서 박효신 여자키 고음 열창"));

        feedRvAdapter.add(new FeedInfo(R.drawable.photo_woman_3, "grace", "대학로", "2시간 전",
                "https://nas.yoondy.com/Drama%20-%20Korea/temp/%EA%B7%80%EA%B0%80%20%ED%98%B8%EA%B0%95%ED%95%98%EB%8A%94%20%EC%B2%AD%EA%B3%84%EC%B2%9C%20%EC%95%84%EC%B9%B4%ED%8E%A0%EB%9D%BC%20%EB%B2%84%EC%8A%A4%ED%82%B9%EA%B3%B5%EC%97%B0%20%28%EB%9D%BC%EC%9D%B4%EC%98%A8%ED%82%B9OST%29.mp4", 507, 43, 26,
                "귀가 호강하는 청계천 아카펠라 버스킹 공연~~~ (라이온킹 OST)"));
*/
    }
}
