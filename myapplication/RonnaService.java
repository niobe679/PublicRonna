package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RonnaService {
    private static final String URL = "http://192.168.43.247:4311/api/";
    //private retrofit.RestAdapter restAdapter;
    private InstituteService apiService;
    public  static Retrofit restAdapter;

    public static Retrofit getService()
    {
        restAdapter =new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        // apiService = restAdapter.create(InstituteService.class);
        return restAdapter;
    }
}
