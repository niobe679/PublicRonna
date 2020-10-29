/*
package com.example.myapplication;

import android.widget.Toast;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SMSService {
    public  void SMSService() throws Exception{
        // TODO Auto-generated method stub
        String message = "Junk characters? method sendMultipartTextMessage only send text message. If you want to send non text message, you should look to method sendDataMessage. Below is the code excerpt from android cts. It has example on how to send long messages.";
        String phone = "0920804314";
        String username = "abcd";
        String password = "1234";
        String address = "http://192.168.43.108";
        String port = "8090";

        URL url = new URL(
                address+":"+port+"/SendSMS?username="+username+"&password="+password+
                        "&phone="+phone+"&message="+ URLEncoder.encode(message,"UTF-8"));

        URLConnection connection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while((inputLine = bufferedReader.readLine()) !=null){
            System.out.println(inputLine);
        }
       // bufferedReader.close();
*/
/*
    private static final String URL = "https://rest-api.d7networks.com/secure/send";
    private retrofit.RestAdapter restAdapter;
    private smsInstitute apiService;

    public SMSService()
    {
        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        apiService = restAdapter.create(smsInstitute.class);
    }

    String ToastVal= null;
    public String Sendsms() throws IOException {

        OkHttpClient Client = new OkHttpClient();
        // Request.Builder Client = new Request.Builder();
        //Client.build();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "{\n\t\"to\":\"0920804314\",\n\t\"content\":\"Welcome to D7 sms , we will help you to talk with your customer effectively\",\n\t\"from\":\"SMSINFO\",\n\t\"dlr\":\"yes\",\n\t\"dlr-method\":\"GET\", \n\t\"dlr-level\":\"2\", \n\t\"dlr-url\":\"http://yourcustompostbackurl.com\"\n}");
        Request request = new Request.Builder()
                .url("https://rest-api.d7networks.com/secure/send")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Authorization", "Basic eXBxazk3MjE6Wm82azl1SGU=")
                .build();

        //Response response = //.newCall(request).execute();
        Client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                //Toast.makeText(new MainActivity(), "Failed.", Toast.LENGTH_LONG).show();
                ToastVal = "failed";
            }

            @Override
            public void onResponse(Response response) throws IOException {
                if (!response.isSuccessful()) {
                    //ToastVal = response.message();
                    throw new IOException("unexpected " + response);

                } else ToastVal= null;
                  //  Toast.makeText(SMSService.this, "Hopfully Sent.", Toast.LENGTH_LONG).show();
            }
        });
        if(ToastVal!=null)
        return ToastVal;
        else return null;
    }
*//*

}
}

*/
