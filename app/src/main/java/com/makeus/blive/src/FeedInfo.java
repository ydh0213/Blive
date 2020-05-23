package com.makeus.blive.src;

public class FeedInfo {
    private int profilePhotoId;
    private String name;
    private String location;
    private String date;
    private String videoUrl;
    private int peopleCount;
    private int heartCount;
    private int musicNoteCount;
    private String content;

    public FeedInfo(int profilePhotoId, String name, String location, String date, String videoUrl, int peopleCount, int heartCount, int musicNoteCount, String content) {
        this.profilePhotoId = profilePhotoId;
        this.name = name;
        this.location = location;
        this.date = date;
        this.videoUrl = videoUrl;
        this.peopleCount = peopleCount;
        this.heartCount = heartCount;
        this.musicNoteCount = musicNoteCount;
        this.content = content;
    }

    public int getProfilePhotoId() { return profilePhotoId; }

    public String getName() { return name; }

    public String getLocation() { return location; }

    public String getDate() { return date; }

    public String getVideoUrl() { return videoUrl; }

    public int getPeopleCount() { return peopleCount; }

    public int getHeartCount() { return heartCount; }

    public int getMusicNoteCount() { return musicNoteCount; }

    public String getContent() { return content; }
}
