package com.diegobanol.ejercicio5;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
    private RadioGroup op1, op2;
    EditText dato1, dato2, dato3;
    TextView v1, v2, v3, v4, v5, v6;

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dato1 = (EditText) findViewById(R.id.num1);
        dato2 = (EditText) findViewById(R.id.num2);
        dato3 = (EditText) findViewById(R.id.num3);
        spinner1 = (Spinner) findViewById(R.id.num4);
        op1= (RadioGroup) findViewById(R.id.sexo);
        op2= (RadioGroup) findViewById(R.id.hobbi);
        v1= (TextView) findViewById(R.id.s1);
        v2= (TextView) findViewById(R.id.s2);
        v3= (TextView) findViewById(R.id.s3);
        v4= (TextView) findViewById(R.id.s4);
        v5= (TextView) findViewById(R.id.s5);
        v6= (TextView) findViewById(R.id.s6);
        Button Cargar = (Button) findViewById(R.id.bt);

        Cargar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String str1=dato1.getText().toString();
                String str2=dato2.getText().toString();
                String str3=dato3.getText().toString();
                String sp1=String.valueOf(spinner1.getSelectedItem());
                int ops1 = op1.getCheckedRadioButtonId();
                int ops2 = op2.getCheckedRadioButtonId();

                if (ops1 == R.id.rhom) {
                    v2.setText(String.valueOf("Hombre"));
                }
                else if (ops1 == R.id.rmu) {
                    v2.setText(String.valueOf("Mujer"));
                }
                else{
                    v2.setText(String.valueOf(" "));
                }

                if (ops2 == R.id.runo) {
                    v6.setText(String.valueOf("Deporte"));
                }
                else if (ops2 == R.id.rdos) {
                    v6.setText(String.valueOf("Lectura"));
                }
                else if (ops2 == R.id.rtres){
                    v6.setText(String.valueOf("Videojuegos"));
                }
                else if (ops2 == R.id.rcuatro){
                    v6.setText(String.valueOf("Cine"));
                }
                else{
                    v6.setText(String.valueOf(" "));
                }

                if (str1.equals("")){
                    v1.setText(String.valueOf(" "));
                }
                else{
                    v1.setText(String.valueOf(str1));
                }

                if (str2.equals("")){
                    v3.setText(String.valueOf(" "));
                }
                else{
                    v3.setText(String.valueOf(str2));
                }

                if (str3.equals("")){
                    v4.setText(String.valueOf(" "));
                }
                else{
                    v4.setText(String.valueOf(str3));
                }

                if (sp1.equals("")){
                    v5.setText(String.valueOf(" "));
                }
                else{
                    v5.setText(String.valueOf(sp1));
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

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");

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
