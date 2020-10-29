package com.example.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserBankInfo {
    @SerializedName("UserName")
    @Expose
    public String UserName;
    @SerializedName("BankName")
    @Expose
    public String BankName;
    @SerializedName("BankCode")
    @Expose
    public String BankCode;

    public String getUserName() {
        return UserName;
    }

    public String getBankName() {
        return BankName;
    }

    public String getBankCode() {
        return BankCode;
    }
}
