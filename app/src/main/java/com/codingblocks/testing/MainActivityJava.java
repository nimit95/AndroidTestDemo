package com.codingblocks.testing;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityJava extends AppCompatActivity {

    Button btnCalcFare;
    EditText etkm, etmin;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcFare = (Button) findViewById(R.id.btnCalcFare);
        etkm = (EditText) findViewById(R.id.etkm);
        etmin = (EditText) findViewById(R.id.etmin);
        result = (TextView) findViewById(R.id.result);


        btnCalcFare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText( String.valueOf( caclFare(
                        Float.parseFloat( etkm.getText().toString() ),
                        Integer.parseInt(etmin.getText().toString())
                ))
                );
            }
        });

    }



    static float caclFare(float km, int min) {
        return 50 + ((km>5)?(km-5)*12:0) + ((min>15)?(min-15):0) ;
    }
}
