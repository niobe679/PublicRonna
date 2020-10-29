package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BankService {
    //retrofit.RestAdapter restAdapter;
   //InstituteService apiService;

    private static final String URL = "http://192.168.43.247:5595/api/";
     //private retrofit.RestAdapter restAdapter;
    private BankInstitute apiService;
    public  static Retrofit restAdapter;


   /* public  BankService(String IP)
    {
         String URL = "http://192.168.43.247:5595/api"; //+ IP + "/api";//+ Key +"/";


        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        apiService = restAdapter.create(InstituteService.class);
    }*/
    /*public InstituteService getService()
    {
       return apiService;
    }*/





    //------------------------------------------------------------
   public static Retrofit getService()
   {
       restAdapter =new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
       // apiService = restAdapter.create(InstituteService.class);
       return restAdapter;
   }

}
