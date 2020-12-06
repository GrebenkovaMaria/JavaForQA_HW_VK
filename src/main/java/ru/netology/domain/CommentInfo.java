package ru.netology.domain;

public class CommentInfo { // характеристики для комментариев
    private int count;
    private boolean canPost; // може ли текущий пользователь комментировать
    private boolean groupsCanCpost; // могут ли сообщества комментировать запись;
    private boolean canClose; //может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи.

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanCpost() {
        return groupsCanCpost;
    }

    public void setGroupsCanCpost(boolean groupsCanCpost) {
        this.groupsCanCpost = groupsCanCpost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }



}

