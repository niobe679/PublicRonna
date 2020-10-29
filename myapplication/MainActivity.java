package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import retrofit.RetrofitError;
import retrofit2.Call;
//import retrofit2.Call;
import java.util.List;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//import retrofit2.Call;
//import retrofit2.Callback;
import com.google.gson.JsonObject;

import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*public void tryclc(View v) throws IOException {
    SMSService sms = new SMSService();
   // String resp = sms.Sendsms();
    //if(resp!=null)
    //Toast.makeText(MainActivity.this, resp, Toast.LENGTH_LONG).show();
    //sms.Sendsms();
}*/


    public  void GoToSignUp(View v)
    {
  //  Intent intent = new Intent(this,SignUpPage.class);
   // startActivity(intent);
        //------------------------------------------------------------------------
    InstituteService rs = BankService.getService().create(InstituteService.class);
        Call<List<AccountInfo>> call = rs.getNumber("852");
        call.enqueue(new Callback<List<AccountInfo>>() {
            @Override
            public void onResponse(Call<List<AccountInfo>> call, Response<List<AccountInfo>> response) {
               List<AccountInfo> accountInfo =  response.body();
                Toast.makeText(MainActivity.this,accountInfo.get(0).getAmount(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<AccountInfo>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"shit failed dumb ass", Toast.LENGTH_LONG).show();

            }
        });
        //--------------------------------------------------------------------------------------------------
    }
    public void GotoLogIn(View v)
    {
        Intent intent = new Intent(this, UserPage.class);
        startActivity(intent);
    }

    public  void Getnum(View v)
    {
        /*
Bank userBankInfo = new Bank();
userBankInfo.BankCode="123456789";

        Call<List<Bank>> listCall = restService.getService().getNumber();
        listCall.enqueue(new retrofit2.Callback<List<Bank>>() {
            @Override
            public void onResponse(Call<List<Bank>> call, retrofit2.Response<List<Bank>> response) {
               // (response.body());
                Toast.makeText(MainActivity.this,response.body().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<Bank>> call, Throwable t) {

            }
        });
        */
       // BankService restService= new BankService("192.168.43.247");
     /*   restService.getService().getNumber(new Callback<List<AccountInfo>>() {

            @Override
            public void success(List<AccountInfo> accountInfo, Response response) {
                if(accountInfo == null) {
                    Toast.makeText(MainActivity.this, "fix this shit bro it empty", Toast.LENGTH_LONG).show();
                                   }else {
                    Toast.makeText(MainActivity.this, "it  isnt " + accountInfo.get(0).BankCode, Toast.LENGTH_LONG).show();
                   // ListView lv = (ListView) findViewById(R.id.listView);

                    //CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, R.layout.activity_main, accountInfo);

                }
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(MainActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

            }
        });*/
    }
}