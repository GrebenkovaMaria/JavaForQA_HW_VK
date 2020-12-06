package ru.netology.domain;

public class ContentPostsInfo {
    private String id;
    private String postUrl;
    private boolean image; // в посте может быть картинка, может отсутствовать
    private boolean soundtrack; // в посте может быть звуковая дорожка, может отсутствовать
    private boolean quize; // в посте может быть опрос, может отсутствовать
    private boolean video;// в посте может быть видео, может отсутствовать
    private boolean hashTag; // в посте могут быть хештеги, может отсутствовать
    private boolean userMark; // в посте может быть отмечен пользователь, может отсутствовать
    private String imageUrl;
    private String soundtrackUrl;
    private String singerId;
    private String quizeUrl;
    private String videoUrl;
    private String hashtagUrl;
    private String text;
    private String userMarkUrl; // если boolean userMark true

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public boolean isImage() {
        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    public boolean isSoundtrack() {
        return soundtrack;
    }

    public void setSoundtrack(boolean soundtrack) {
        this.soundtrack = soundtrack;
    }

    public boolean isQuize() {
        return quize;
    }

    public void setQuize(boolean quize) {
        this.quize = quize;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public boolean isHashTag() {
        return hashTag;
    }

    public void setHashTag(boolean hashTag) {
        this.hashTag = hashTag;
    }

    public boolean isUserMark() {
        return userMark;
    }

    public void setUserMark(boolean userMark) {
        this.userMark = userMark;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSoundtrackUrl() {
        return soundtrackUrl;
    }

    public void setSoundtrackUrl(String soundtrackUrl) {
        this.soundtrackUrl = soundtrackUrl;
    }

    public String getSingerId() {
        return singerId;
    }

    public void setSingerId(String singerId) {
        this.singerId = singerId;
    }

    public String getQuizeUrl() {
        return quizeUrl;
    }

    public void setQuizeUrl(String quizeUrl) {
        this.quizeUrl = quizeUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getHashtagUrl() {
        return hashtagUrl;
    }

    public void setHashtagUrl(String hashtagUrl) {
        this.hashtagUrl = hashtagUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserMarkUrl() {
        return userMarkUrl;
    }

    public void setUserMarkUrl(String userMarkUrl) {
        this.userMarkUrl = userMarkUrl;
    }
}
