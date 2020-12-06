package ru.netology.domain;

public class DonatInfo {// характеристики о записи VK Donut:
    private boolean isDonut ; // запись доступна только платным подписчикам VK Donut;
    private int paidDuration ; // время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    private String placeHolder; // заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
    private boolean canPublishFreeCopy ; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    private String editMode ;// информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    private boolean allEditMode ; // всю информацию о VK Donut.

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public boolean isAllEditMode() {
        return allEditMode;
    }

    public void setAllEditMode(boolean allEditMode) {
        this.allEditMode = allEditMode;
    }

    public boolean isDurationEditMode() {
        return durationEditMode;
    }

    public void setDurationEditMode(boolean durationEditMode) {
        this.durationEditMode = durationEditMode;
    }

    private boolean durationEditMode ; // время, в течение которого запись будет доступна только платным подписчикам VK Donut.
}
