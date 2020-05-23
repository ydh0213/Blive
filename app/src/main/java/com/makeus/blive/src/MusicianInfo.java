package com.makeus.blive.src;

public class MusicianInfo {
    private int profilePhotoId;
    private String name;
    private String location;
    private boolean isActive;

    public MusicianInfo(int profilePhotoId, String name, String location, boolean isActive) {
        this.profilePhotoId = profilePhotoId;
        this.name = name;
        this.location = location;
        this.isActive = isActive;
    }

    public int getProfilePhotoId() { return profilePhotoId; }

    public String getName() { return name; }

    public String getLocation() { return location; }

    public boolean isActive() { return isActive; }
}
