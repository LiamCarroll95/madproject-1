package com.example.whitelegg_n.osmdroid1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 1carrl31 on 09/02/2017.
 */
public class MapChooseActivity extends Activity implements View.OnClickListener
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mca);

        Button Regular = (button)findViewById(R.id.btnRegular);
        regular.setOnCLickListener(this);

        Button Cyclemap = (button)findViewById(R.id.btnCyclemap);
        cyclemap.OnClickListener(this);

    }

    public void onClick(View v){

        boolean cyclemap = false;
        if(view.getID()== R.btnCyclemap){
            cyclemap = true;
        }
        intent Intent = new intent ();
        Bundle Bundle = new bundle ();
        Bundle-PutBoolean("cyclemap", cyclemap);
        intent.putExtras(bundle);
        SetResult(RESULT_OK, intent);
        finish();
    }

}

