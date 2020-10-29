package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class TransactQuery {
    @SerializedName("VCode")
    public String VerficationCode;
    @SerializedName("amount")
    public Integer Amount;
    @SerializedName("RBankCode")
    public String RecieverBankCode;
}
