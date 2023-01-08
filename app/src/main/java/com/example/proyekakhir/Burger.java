package com.example.proyekakhir;

import android.os.Parcel;
import android.os.Parcelable;

public class Burger implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public Burger(){

    }

    protected Burger(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Burger> CREATOR = new Creator<Burger>() {
        @Override
        public Burger createFromParcel(Parcel in) {
            return new Burger(in);
        }

        @Override
        public Burger[] newArray(int size) {
            return new Burger[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }
}
