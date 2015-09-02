package com.akshay.gappa;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Akshay on 02-09-2015.
 */
public class Gappa extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "CarsTvWcTuHknZ9FONmdkbaH7PA15J7ya69HakPs", "kb3dCyNIKdHezY7GAZtm9QAFagCONJru1d76MLvg");

    }
}
