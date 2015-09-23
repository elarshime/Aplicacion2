package com.example.windows81.aplicacion2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    RadioGroup rg;
    CheckBox chkdcto1,chkdcto2;
    Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=(RadioGroup)findViewById(R.id.radioGroup);
        chkdcto1=(CheckBox)findViewById(R.id.Chkdcto1);
        chkdcto2=(CheckBox)findViewById(R.id.Chkdcto2);
        btncalcular=(Button)findViewById(R.id.btncalcular);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pre=0;
                String cur="";

                if (rg.getCheckedRadioButtonId()==R.id.rb1){
                    pre=800;
                    cur="Lenguaje de Programacion III";
                }else if (rg.getCheckedRadioButtonId()==R.id.rb2){
                    pre=600;
                    cur="Redes";
                }else  if (rg.getCheckedRadioButtonId()==R.id.rb3){
                    pre=700;
                    cur="Base de Datos";
                }

                double d1=0,d2=0;

                if (chkdcto1.isChecked()){
                    d1=pre*0.10;
                }

                if (chkdcto2.isChecked()){
                    d2=pre*0.20;
                }
                double total = pre-d1-d2;

                Toast.makeText(getApplicationContext(),"Curso: "+cur+"\nPrecio: "+pre+
                "\nDcto1: "+d1+ "\nDcto2: "+d2+"\nTotal: "+total,Toast.LENGTH_LONG).show();
            }
        });
    }



}
