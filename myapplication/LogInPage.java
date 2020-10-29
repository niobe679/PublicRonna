package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class LogInPage extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
    }

    public void OnLogingIn(View v)
    {
       // RestService restService= new RestService();
       // String Res=  restService.getService().getUserLog(new String() );
       // Toast.makeText(LogInPage.this, "hello", Toast.LENGTH_LONG).show();


       // Intent intent = new Intent(this,UserPage.class);
       // startActivity(intent);


        /*final AdminLog Temp = new AdminLog();
        Temp.UserName = ((EditText) findViewById(R.id.editTextTextUName)).getText().toString();
        Temp.Password =((EditText) findViewById(R.id.editTextTextPassword)).getText().toString();
        final RestService restService= new RestService();
        restService.getService().getAdminLog(new Callback<List<AdminLog>>() {

            @Override
            public void success(List<AdminLog> adminlog, Response response) {
        */

                ///THE STRINGS FOR SOE REASON IT WONT MUCH IT DESPLAYS IT AND EVERYTHING BUT IT WONT MATHC MAYBE TRY ASSIGNING THE USER VALUES WITH
                //THE ADMIN LOG CLASS THE THEY MIGHT EQUATE AND REMEMBER IT A LIST TYPE MAYBE THAT MAKES A DIFFERENCE
//tried making it and adminlog class type maybe it being a list makes a difference try it as a list type try first assigning the adminlog instance
                //then add it to a list typt else fucking google why android is dumb as fuck


                /*if(adminlog.get(0).Password == Temp.Password) {
                   Toast.makeText(LogInPage.this, adminlog.get(0).Password, Toast.LENGTH_LONG).show();
                }else {
                    String AdminUserName = adminlog.get(0).UserName;
                    String Adminpassword = adminlog.get(0).Password;
                    if(adminlog.get(0).Password != Temp.Password)
                    {
                        Toast.makeText(LogInPage.this, "hello", Toast.LENGTH_LONG).show();
                        GotoAdminPage();
                    }
                    else
                    {
                      String Res=  restService.getService().getUserLog(new String() );
                        Toast.makeText(LogInPage.this, "hello", Toast.LENGTH_LONG).show();
                    }
                    //i tried to return a string typed user password i have taken out the callback thing im not sure how it will return it
                    // just log in and see if it returns...if it doesnt work try to make the call back ting idk how that works
                   //
                    // ListView lv = (ListView) findViewById(R.id.listView);

                    //CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, R.layout.activity_main, accountInfo);

                }*/
           //     }

 /*           @Override
            public void failure(RetrofitError error) {
                Toast.makeText(LogInPage.this, "didnt work "+error.getMessage().toString(), Toast.LENGTH_LONG).show();

            }
        });*/
    }

    public void GotoAdminPage()
    {
        Intent intent = new Intent(this,AdminPage.class);
        startActivity(intent);
    }

    public void GotoLogIn(View v)
    {
        Intent intent = new Intent(this,LogInPage.class);
        startActivity(intent);
    }

}
