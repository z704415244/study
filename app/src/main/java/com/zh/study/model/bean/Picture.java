package com.zh.study.model.bean;

public class Picture {

    private Long id;
    private Long skuId;
    private String img;
    private String inventoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", skuId=" + skuId +
                ", img='" + img + '\'' +
                ", inventoryId='" + inventoryId + '\'' +
                '}';
    }
}
