package com.example.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;

import androidx.appcompat.app.AppCompatActivity;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class Bank extends AppCompatActivity {



    Bitmap bitmap;
    private static int RESULT_LOAD_IMAGE = 1;
    private static int RESULT_LOAD_IMG = 1;
    String imgDecodableString;
ImageView imageView ;// findViewById(R.id.ImageView);
    BankInfo Bank = new BankInfo();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addbank);
//(VOL 2)
/*        Button buttonLoadImage = (Button) findViewById(R.id.buttonLoadPicture);
        buttonLoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });*/
    }/*
    public void loadImagefromGallery(View view) {
        // Create intent to Open Image applications like Gallery, Google Photos
        Intent galleryIntent = new Intent();
        galleryIntent.setType("image/*");
        galleryIntent.setAction(Intent.ACTION_GET_CONTENT);

        // Start the Intent
        startActivityForResult(Intent.createChooser(galleryIntent,"Pick an icon"), RESULT_LOAD_IMG);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        imageView = findViewById(R.id.ImageView);
        try {
            // When an Image is picked
            if (requestCode == RESULT_LOAD_IMG && resultCode == RESULT_OK
                    && null != data) {
                // Get the Image from data

                Uri selectedImage = data.getData();
imageView.setImageURI(selectedImage);
String[] filePathColumn = { MediaStore.Images.Media.DATA };

                // Get the cursor
                Cursor cursor = getContentResolver().query(selectedImage,
                        filePathColumn, null, null, null);
                // Move to first row
                cursor.moveToFirst();

                int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                imgDecodableString = cursor.getString(columnIndex);
                cursor.close();
                ImageView imgView = (ImageView) findViewById(R.id.ImageView);
                // Set the Image in ImageView after decoding the String
                imgView.setImageBitmap(BitmapFactory
                        .decodeFile(imgDecodableString));
                imageView.setImageURI();

            } else {
                Toast.makeText(this, "You haven't picked Image",
                        Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG)
                    .show();
        }*/
    //----------------------------------------------------------------------------------------------
/*

            Button buttonLoadImage = (Button) findViewById(R.id.buttonLoadPicture);
        buttonLoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });
*/

    //----------------------------------------------------------------------------------------------


//to add image for the damn banks
//(VOL2)
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            ImageView imageView = (ImageView) findViewById(R.id.ImageView);
            imageView.setImageBitmap(BitmapFactory.decodeFile(picturePath));
            BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();

imageView.setImageURI(selectedImage);
            Bank.img = getBytesFromBitmap(drawable.getBitmap());
// Bitmap bitmap = imageView;//.setImageBitmap(BitmapFactory.decodeFile(picturePath));
            //img = imageView.toByteArray;
*//* ByteArrayOutputStream stream = new ByteArrayOutputStream();
            imageView.(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] byteArray = imageView.setImageBitmap(BitmapFactory.decodeByteArray());
            imageView.recycle();


            try {
                FileInputStream imageStream = new FileInputStream(picturePath);
                Byte [] bytimg = imageStream.();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }*//**//*

        }

*//*
        }
    }*/
    public byte[] getBytesFromBitmap(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, stream);
        return stream.toByteArray();
    }

    public void SaveBankInfo(View v)
    {
    /*    Bank userBankInfo = new Bank();
        Image img = findViewById(R.id.ImageView);
        img.
        BufferedImage BImage = ImageIO.read*/



        RestService restService= new RestService();


        // user.FirstName= ((EditText) findViewById(R.id.editTextTextFName)).getText().toString();
        //Bank.img =  getBytesFromBitmap(bitmap);
        Bank.BankName=((EditText) findViewById(R.id.editTextTextBankName)).getText().toString();
        Bank.IP= ((EditText) findViewById(R.id.editTextTextIP)).getText().toString();
        Bank.KeyPath= ((EditText) findViewById(R.id.editTextTextKeyPath)).getText().toString();
     /*   restService.getService().addBank(Bank, new Callback<com.example.myapplication.Bank>() {
            @Override
            public void success(com.example.myapplication.Bank bankInfo, Response response) {
                Toast.makeText(com.example.myapplication.Bank.this , "New Bank Inserted.", Toast.LENGTH_LONG).show();
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(com.example.myapplication.Bank.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

            }
        });*/
    }
}
