package ru.netology.domain;

public class PostInfo {
    private String id;
    private String postUrl;
    private String title; // название поста
    private String authorAvatar; // картинка с аватаром автора поста
    private String releaseTime; // дата и время опубликования поста
    private String content; // содержание поста (смотреть class СontentPostInfo)
    private String likesQuantity; // кол-во лайков
    private String repostsQuantity; // количество репостов
    private String viewingsQuantity; // количество просмотров
    private String comment; // комментарии
    private boolean commentBlocking; // заблокировать комментарии
    private boolean publicAccess; // все могуст смотреть пост? или огарничение доступа (друзья, друзья друзей и т.д.)
    private boolean interestingForUser; //если truе для конкретного пользователя,то попадает в "сначала интересные"
    private boolean longPost; // для длинных постов появляется кнопка "показать полностью"

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isCommentBlock() {
        return commentBlock;
    }

    public void setCommentBlock(boolean commentBlock) {
        this.commentBlock = commentBlock;
    }

    public boolean isPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(boolean publicAccess) {
        this.publicAccess = publicAccess;
    }

    public boolean isHidingForlongPost() {
        return hidingForlongPost;
    }

    public void setHidingForlongPost(boolean hidingForlongPost) {
        this.hidingForlongPost = hidingForlongPost;
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

    public String getLikesQuantity() {
        return likesQuantity;
    }

    public void setLikesQuantity(String likesQuantity) {
        this.likesQuantity = likesQuantity;
    }

    public String getRepostsQuantity() {
        return repostsQuantity;
    }

    public void setRepostsQuantity(String repostsQuantity) {
        this.repostsQuantity = repostsQuantity;
    }

    public String getViewingsQuantity() {
        return viewingsQuantity;
    }

    public void setViewingsQuantity(String viewingsQuantity) {
        this.viewingsQuantity = viewingsQuantity;
    }

    public boolean isInterestingForUser() {
        return interestingForUser;
    }

    public void setInterestingForUser(boolean interestingForUser) {
        this.interestingForUser = interestingForUser;
    }
}
