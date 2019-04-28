package com.example.test;

import android.app.ProgressDialog;
import android.content.Context;

public class ServerRequests {

    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 1000 * 15;
    public static final String SERVER_ADDRESS = "https://superlunary-hyphens.000webhostapp.com";

    public ServerRequests(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please wait....");
    }

    public void storeUserDataInBackground(){


    }

    public void fetchUserDataInBackground(){

    }

}
