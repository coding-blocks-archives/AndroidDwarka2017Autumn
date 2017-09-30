package com.dagger.services;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by harshitdwivedi on 30/09/17.
 */

//implements Serializable

public class User implements Parcelable{

    private String name,age,address,contace,dob;

    public User(String name, String age, String address, String contace, String dob) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contace = contace;
        this.dob = dob;
    }


    protected User(Parcel in) {
        name = in.readString();
        age = in.readString();
        address = in.readString();
        contace = in.readString();
        dob = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getContace() {
        return contace;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
        dest.writeString(address);
        dest.writeString(contace);
        dest.writeString(dob);
    }
}
