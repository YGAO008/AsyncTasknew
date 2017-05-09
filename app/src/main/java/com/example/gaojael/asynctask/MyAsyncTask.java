package com.example.gaojael.asynctask;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by gaojael on 08/05/2017.
 */

public class MyAsyncTask extends AsyncTask <Void,Void,Void>{

    @Override
    protected Void doInBackground(Void... voids) {
        Log.d("xys","doInBackground");
        onProgressUpdate();
        return null;
    }

    @Override
    protected void onPreExecute() {
        Log.d("xys","onPreExecute");
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        Log.d("xys","onPostExecute");
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        Log.d("xys","onProgressUpdate");
        super.onProgressUpdate(values);
    }
}
