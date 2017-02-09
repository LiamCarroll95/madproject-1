package com.example.whitelegg_n.osmdroid1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 1carrl31 on 09/02/2017.
 */
public class MapChooseActivity extends Activity implements View.OnClickListener
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mca);

        Button Regular = (Button)findViewById(R.id.btnRegular);
        Regular.setOnClickListener(this);

        Button Cyclemap = (Button)findViewById(R.id.btnCyclemap);
        View.OnClickListener(this);

    }

    public void onClick(View view){

        boolean cyclemap = false;
        if(view.getId()== R.btnCyclemap){
            cyclemap = true;
        }
        Intent Intent = new Intent ();
        Bundle Bundle = new Bundle ();
        Bundle.putBoolean("com.cyclemap", cyclemap);
        Intent.putExtras(Bundle);
        setResult(RESULT_OK, Intent);
        finish();
    }



}

