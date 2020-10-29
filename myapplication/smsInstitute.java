package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface smsInstitute {
    @GET("/api/values")
    Call<String> getMessage(@Query("phoneNumber") String phonenum);
    @POST("/api/values")
    Call<String> sendCode(@Body SMSMessageData data);
}
