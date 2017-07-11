package com.example.android.cardifftourguideapp;

/**
 * Created by tom.mills-mock on 07/06/2017.
 */

public class Castle {

    private int mCastleTitleId;
    private int mCastleImageId;
    private int mCastleDesId;
    private int mCastleAddressId;

    public Castle(int CastleTitleId, int CastleImageId, int CastleDesId, int CastleAddressId) {
        mCastleTitleId = CastleTitleId;
        mCastleImageId = CastleImageId;
        mCastleDesId = CastleDesId;
        mCastleAddressId = CastleAddressId;
    }

    public int getCastleTitleId() {
        return mCastleTitleId;
    }

    public int getCastleImageId() {
        return mCastleImageId;
    }

    public int getCastleDesId() {
        return mCastleDesId;
    }

    public int getCastleAddressId() {
        return mCastleAddressId;
    }


}
