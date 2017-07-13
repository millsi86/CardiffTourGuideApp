package com.example.android.cardifftourguideapp;

/**
 * Created by tom.mills-mock on 07/06/2017.
 */

public class Item {

    // Constant value that represents no item was provided for this item
    private static final int NO_ITEM_PROVIDED = -1;

    // String resource ID declatations
    private int mTitleId = NO_ITEM_PROVIDED;
    private int mImageId = NO_ITEM_PROVIDED;
    private int mDesId = NO_ITEM_PROVIDED;
    private int mAddressId = NO_ITEM_PROVIDED;

    // Create items with various views present
    public Item(int TitleId, int ImageId, int DesId, int AddressId) {
        mTitleId = TitleId;
        mImageId = ImageId;
        mDesId = DesId;
        mAddressId = AddressId;
    }

    public Item(int TitleId, int DesId, int AddressId) {
        mTitleId = TitleId;
        mDesId = DesId;
        mAddressId = AddressId;
    }

    public Item(int TitleId, int DesId) {
        mTitleId = TitleId;
        mDesId = DesId;
    }

    public Item(int ImageId) {
        mImageId = ImageId;
    }

    // method declarations for returning field ID and if ID's have been used
    public int getTitleId() {
        return mTitleId;
    }

    public boolean hasTitle() {
        return mTitleId != NO_ITEM_PROVIDED;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != NO_ITEM_PROVIDED;
    }

    public int getDesId() {
        return mDesId;
    }

    public boolean hasDes() {
        return mDesId != NO_ITEM_PROVIDED;
    }

    public int getAddressId() {
        return mAddressId;
    }

    public boolean hasAddress() {
        return mAddressId != NO_ITEM_PROVIDED;
    }


}
