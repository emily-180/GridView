package br.edu.ifsuldeminas.mch.gridview;

public class Item {
    private int imageResourceId;
    private String text;

    public Item(int imageResourceId, String text) {
        this.imageResourceId = imageResourceId;
        this.text = text;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getText() {
        return text;
    }
}

