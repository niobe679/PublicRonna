package com.example.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountInfo {
    @SerializedName("BankCode")
    @Expose
    public String BankCode;

    @SerializedName("Amount")
    @Expose
    public String Amount;

    @SerializedName("PhoneNumber")
    @Expose
    public String PhoneNumber;



    public String getBankCode() {
        return BankCode;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public String getAmount() {
        return Amount;
    }

}
