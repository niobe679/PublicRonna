package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//192.168.43.66:5680
//4311
public class RestService {
    private static final String URL = "http://192.168.43.247:4311/api/";
    retrofit.RestAdapter restAdapter;
     InstituteService apiService;
    public RestService()
    {
             restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();
     //  restAdapter =new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        apiService = restAdapter.create(InstituteService.class);
    }
    public InstituteService getService()
    {
       return apiService;
    }
    // private retrofit.RestAdapter restAdapter;
  //  private InstituteService apiService;

//public  static Retrofit restAdapter;

    //public InstituteService getService()
    //public static Retrofit getService()
    //{
       // restAdapter =new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
       // apiService = restAdapter.create(InstituteService.class);
      //  return restAdapter;
    //}


}
