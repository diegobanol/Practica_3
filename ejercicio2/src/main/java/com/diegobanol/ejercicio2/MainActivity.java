package com.diegobanol.ejercicio2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Numero1 = (EditText) findViewById(R.id.num1);
        final EditText Numero2 = (EditText) findViewById(R.id.num2);
        final TextView result = (TextView) findViewById(R.id.res);
        op = (RadioGroup) findViewById(R.id.operacion);
        Button Cargar = (Button) findViewById(R.id.enviar);


        Cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double numero1, numero2, res;
                String str1=Numero1.getText().toString();
                String str2=Numero2.getText().toString();

                int opselec = op.getCheckedRadioButtonId();

                if (str1.equals("") || str2.equals("")) {
                    result.setText(String.valueOf("Campo vacio"));

                }else {

                    numero1 = Double.parseDouble(str1);
                    numero2 = Double.parseDouble(str2);

                    if (opselec == R.id.runo) {
                        res = numero1 + numero2;
                        result.setText(String.valueOf(res));
                    }

                    if (opselec == R.id.rdos) {
                        res = numero1 - numero2;
                        result.setText(String.valueOf(res));
                    }

                    if (opselec == R.id.rtres) {
                        res = numero1 * numero2;
                        result.setText(String.valueOf(res));
                    }

                    if (opselec == R.id.rcuatro) {
                        res = numero1 / numero2;
                        result.setText(String.valueOf(res));
                    }
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
