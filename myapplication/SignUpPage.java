package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class SignUpPage extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.signuppage);
        }
/*

    public void SaveUser(View v)
    {
        RestService restService= new RestService();

        User user = new User();
        // user.FirstName= ((EditText) findViewById(R.id.editTextTextFName)).getText().toString();
        user.FirstName=((EditText) findViewById(R.id.editTextTextFName)).getText().toString();
        user.LastName= ((EditText) findViewById(R.id.editTextTextLastName)).getText().toString();
        user.Email= ((EditText) findViewById(R.id.editTextTextEmail)).getText().toString();
        user.Bank= ((EditText) findViewById(R.id.editTextTextBank)).getText().toString();
        user.BankNo= ((EditText) findViewById(R.id.editTextTextBankNo)).getText().toString();
        restService.getService().addUser(user, new Callback<User>() {
            @Override
            public void success(User user, Response response) {
                Toast.makeText(SignUpPage.this , "New user Inserted.", Toast.LENGTH_LONG).show();
            }

            @Override
            public void failure(RetrofitError error) {
              Toast.makeText(SignUpPage.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

            }
        });
        GotoLogIn(null);
    }

    public void GotoLogIn(View v)
    {
        Intent intent = new Intent(this,LogInPage.class);
        startActivity(intent);
    }*/
}
