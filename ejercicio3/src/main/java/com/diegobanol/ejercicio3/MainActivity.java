package com.diegobanol.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText N1 = (EditText) findViewById(R.id.num1);
        final EditText N2 = (EditText) findViewById(R.id.num2);
        final EditText N3 = (EditText) findViewById(R.id.num3);
        final EditText N4 = (EditText) findViewById(R.id.num4);
        final TextView result = (TextView) findViewById(R.id.end);
        Button Cargar = (Button) findViewById(R.id.boton);

        Cargar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String str1=N1.getText().toString();
                String str2=N2.getText().toString();
                String str3=N3.getText().toString();
                String str4=N4.getText().toString();

                if(str1.equals(""))
                    str1="0";
                if(str2.equals(""))
                    str2="0";
                if(str3.equals(""))
                    str3="0";
                if(str4.equals(""))
                    str3="0";

                res=Double.parseDouble(str1)*0.15+Double.parseDouble(str2)*0.1+Double.parseDouble(str3)*0.4+Double.parseDouble(str3)*0.35;
                result.setText(String.valueOf(res));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
