package ru.netology.domain;

public class PostInfo {
    public static class LikesInfo{};
    public static class DonatInfo{};
    public static class RepostsInfo{};
    public static class CommentInfo{};
    public static class ContentPostInfo{};
    private String id;
    private String postUrl;
    private String ownerId;
    private String fromId;
    private String createdBy;
    private String replyOwnerId;
    private String replyPostId;
    private String copyright;
    private String postType;
    private String postSource;
    private String geo;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean marksAsAds;
    private boolean ifFavorite;
    private boolean donat;
    private String postPondId;
    private boolean isPinned;
    private String title; // название поста
    private String authorAvatar; // картинка с аватаром автора поста
    private String releaseTime; // дата и время опубликования поста
    private String content; // содержание поста (смотреть class СontentPostInfo)
    private int viewingsQuantity; // количество просмотров
    private boolean commentBlocking; // заблокировать комментарии
    private boolean publicAccess; // в VK это "friendsOnly" все могуст смотреть пост? или огарничение доступа (друзья, друзья друзей и т.д.)
    private boolean interestingForUser; //если truе для конкретного пользователя,то попадает в "сначала интересные"
    private boolean longPost; // для длинных постов появляется кнопка "показать полностью"

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(String replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public String getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(String replyPostId) {
        this.replyPostId = replyPostId;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostSource() {
        return postSource;
    }

    public void setPostSource(String postSource) {
        this.postSource = postSource;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isMarksAsAds() {
        return marksAsAds;
    }

    public void setMarksAsAds(boolean marksAsAds) {
        this.marksAsAds = marksAsAds;
    }

    public boolean isIfFavorite() {
        return ifFavorite;
    }

    public void setIfFavorite(boolean ifFavorite) {
        this.ifFavorite = ifFavorite;
    }

    public boolean isDonat() {
        return donat;
    }

    public void setDonat(boolean donat) {
        this.donat = donat;
    }

    public String getPostPondId() {
        return postPondId;
    }

    public void setPostPondId(String postPondId) {
        this.postPondId = postPondId;
    }
    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }
    public boolean isCommentBlocking() {
        return commentBlocking;
    }

    public void setCommentBlocking(boolean commentBlocking) {
        this.commentBlocking = commentBlocking;
    }

    public boolean isLongPost() {
        return longPost;
    }

    public void setLongPost(boolean longPost) {
        this.longPost = longPost;
    }

    public boolean isPublicAccess() {

        return publicAccess;
    }

    public void setPublicAccess(boolean publicAccess) {

        this.publicAccess = publicAccess;
    }

    public boolean isHidingForlongPost() {

        return longPost;
    }

    public void setHidingForlongPost(boolean hidingForlongPost) {

        this.longPost = longPost;
    }

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

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getAuthorAvatar() {

        return authorAvatar;
    }

    public void setAuthorAvatar(String authorAvatar) {

        this.authorAvatar = authorAvatar;
    }

    public String getReleaseTime() {

        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {

        this.releaseTime = releaseTime;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public int getViewingsQuantity() {

        return viewingsQuantity;
    }

    public void setViewingsQuantity(int viewingsQuantity) {

        this.viewingsQuantity = viewingsQuantity;
    }

    public boolean isInterestingForUser()
    {
        return interestingForUser;
    }

    public void setInterestingForUser(boolean interestingForUser) {

        this.interestingForUser = interestingForUser;
    }
}
