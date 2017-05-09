package com.example.gaojael.asynctask;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;

/**
 * Created by gaojael on 08/05/2017.
 */

public class ProgressBarTest extends Activity {

    private ProgressBar mProgressBar;

    private MyAsyncTask mTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.progressbar);

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);

        mTask = new MyAsyncTask();

        mTask.execute();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mTask!=null && mTask.getStatus() == AsyncTask.Status.RUNNING){
            mTask.cancel(true);
        }
    }

    class MyAsyncTask extends AsyncTask <Void,Integer,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            for(int i=0;i<100;i++){
                publishProgress(i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            mProgressBar.setProgress(values[0]);

        }
    }
}
