package com.zh.study.bean;

public class Goods {

    private Integer position;
    private Integer id;
    private Integer style;
    private Integer operate;
    private Integer subPosition;
    private Integer releaseType;

    private String text;


    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
    }

    public Integer getSubPosition() {
        return subPosition;
    }

    public void setSubPosition(Integer subPosition) {
        this.subPosition = subPosition;
    }

    public Integer getReleaseType() {
        return releaseType;
    }

    public void setReleaseType(Integer releaseType) {
        this.releaseType = releaseType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "position=" + position +
                ", id=" + id +
                ", style=" + style +
                ", operate=" + operate +
                ", subPosition=" + subPosition +
                ", releaseType=" + releaseType +
                ", text='" + text + '\'' +
                '}';
    }
}
