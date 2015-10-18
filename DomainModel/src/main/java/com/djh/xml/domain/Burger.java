package com.djh.xml.domain;

/**
 * @author David Hancock
 */
public class Burger {

    private MeatType meatType;

    private int meatWeight;

    private Sauce sauce;

    private boolean withBread;

    public Burger(MeatType meatType, int meatWeight, Sauce sauce, boolean withBread) {
        this.meatType = meatType;
        this.meatWeight = meatWeight;
        this.sauce = sauce;
        this.withBread = withBread;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public int getMeatWeight() {
        return meatWeight;
    }

    public void setMeatWeight(int meatWeight) {
        this.meatWeight = meatWeight;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public boolean isWithBread() {
        return withBread;
    }

    public void setWithBread(boolean withBread) {
        this.withBread = withBread;
    }
}
