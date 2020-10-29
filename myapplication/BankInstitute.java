package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface BankInstitute {
    @GET("/Values")//gets the phone number from bank server
    public void getNumber(Callback<List<AccountInfo>> callback);

    @POST("/api/UserInfo")
    Call<String> makeTransaction(@Body TransactQuery q);
}
