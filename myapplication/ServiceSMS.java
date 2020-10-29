package com.example.myapplication;

public class ServiceSMS {
    retrofit.RestAdapter restAdapter;
    smsInstitute apiService;
    String URL = "http://192.168.43.247:21218/api"; //+ IP + "/api";//+ Key +"/";


    public ServiceSMS()
    {
        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        apiService = restAdapter.create(smsInstitute.class);
    }
}
