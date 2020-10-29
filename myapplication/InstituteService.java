package com.example.myapplication;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
//import retrofit2.Call;

public interface InstituteService {
   /*@POST("/UserInfo")//saves a signed up information
    public void addUser(@Body User userinf, Callback<User> callback);

    @POST("/values")//saves a signed up information
    public void addUser(@Body AccountInfo accinf, Callback<AccountInfo> callback);


    @GET("/Values")//gets the phone number from bank server
    public void getNumber(Callback<List<AccountInfo>> callback);
    */

/*i think this is where you tried to retriebe data with Get request eiter ways i forgot its purpose
 @GET("/api/values")
  Call<List<AccountInfo>> getNumber(@Query("BankCode") String bankcode);
@GET("/api/UserInfo")
 Call<List<UserBankInfo>> getBankCode(@Query("Vcode") String verificationCode);
*/

 //@GET("/api/UserInfo")
 //Call<Boolean> makeTransaction(@Query("data") TransactQuery verificationCode);


 /*@POST("/api/UserInfo")
    Call<String> makeTransaction(@Body TransactQuery q);
*/

 //done/ transact query edergual so fix the othe rshit accordingly
//@GET("/api/values")
 //Call<List<Boolean>> Transact(@Query("SenderBankCode") String bancode,@Query("Amount") String amount,@Query("RecieverBankCode"));
   /* @GET("/AdminLog")//gets admin log information
    public void getAdminLog(Callback<List<AdminLog>> callback);
   @POST("/BankInfo")//registers bank information
    public  void addBank(@Body BankInfo bankInfo, Callback<Bank> callback);
   @GET("/UserLog/{username}")//hopefully gets a user's log info
    public Call<List<AccountInfo>> getUserLog(@Path("username") String username);
 */

   //   @GET("/Values?BankCode=BankCode")
 //   public void getNumber(@Query("BankCode") Bank BankCode, Callback<AccountInfo> callback);
  //  @retrofit2.http.GET("/Values")
   // Call<List<Bank>> getNumber();

}
