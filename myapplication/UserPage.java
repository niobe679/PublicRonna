package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import retrofit.RetrofitError;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPage extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userpage);
    }

    public void RequestCode(View v)
    {
        EditText txt = (EditText) findViewById(R.id.editTextTextCode);
        txt.setVisibility(View.VISIBLE);
        Button bt = findViewById(R.id.buttonRequestCode);
        bt.setVisibility(View.VISIBLE);
    }

    public void makeTransaction(View v)
    {


       // RonnaService ronnaService= new RonnaService();
       InstituteService rs = RonnaService.getService().create(InstituteService.class);
/*         Call<List<UserBankInfo>> call = rs.getBankCode("852");
        call.enqueue(new Callback<List<UserBankInfo>>() {
            @Override
            public void onResponse(Call<List<UserBankInfo>> call, Response<List<UserBankInfo>> response) {
              List<UserBankInfo> ubinf = response.body();
                Toast.makeText(UserPage.this , ubinf.get(0).BankCode, Toast.LENGTH_LONG).show();
            }

            @Override
                public void onFailure(Call<List<UserBankInfo>> call, Throwable t) {

            }
        });*/ 
        //----------------------------------------------------------------------------------------
        TransactQuery query = new TransactQuery();
        //query.VerficationCode="852";
        //List<TransactQuery> q = (List) query;
        query.Amount=200;
        query.RecieverBankCode="852";
        query.VerficationCode="v12";
       /* final Call<String> acall = rs.makeTransaction(query, new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                //Toast.makeText(UserPage.this ,response.toString(), Toast.LENGTH_LONG).show();
                //Toast.makeText(UserPage.this ,response.body().toString(), Toast.LENGTH_LONG).show();
                //Toast.makeText(UserPage.this ,aca, Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(UserPage.this ,"Failedbad", Toast.LENGTH_LONG).show();

            }
        });*/

rs.makeTransaction(query).enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        Toast.makeText(UserPage.this ,response.body().toString(), Toast.LENGTH_LONG).show();



    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {

    }
});
        /*acall.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                Boolean and= response.body();
                Toast.makeText(UserPage.this ,response.toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {

            }
        });*/
        AccountInfo acc = new AccountInfo();
        acc.BankCode=((EditText) findViewById(R.id.editTextTextbankcode)).toString();
        acc.Amount =((EditText) findViewById(R.id.editTextTextamount)).toString();
        acc.PhoneNumber=null;
/*        restService.getService().addUser(acc, new Callback<AccountInfo>() {
            @Override
            public void success(AccountInfo acc, Response response) {
                Toast.makeText(UserPage.this , "transaction inseted.", Toast.LENGTH_LONG).show();
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(UserPage.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

            }
        });*/
    }
}
