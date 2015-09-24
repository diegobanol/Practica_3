package com.diegobanol.ejercicio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup gR;
    private double numero1, numero2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gR=(RadioGroup)findViewById(R.id.seleccion);
        final TextView T1 = (TextView) findViewById(R.id.text1);
        final TextView T2 = (TextView) findViewById(R.id.text2);
        final EditText N1 = (EditText) findViewById(R.id.num1);
        final EditText N2 = (EditText) findViewById(R.id.num2);
        final TextView Res = (TextView) findViewById(R.id.result);
        T1.setVisibility(View.INVISIBLE);
        N1.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        N2.setVisibility(View.INVISIBLE);

        N1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            public void afterTextChanged(Editable s) {
                String qtyString = s.toString().trim();
                if (qtyString.length() > 0) {
                    String str1 = N1.getText().toString();
                    String str2 = N2.getText().toString();

                    int opselec = gR.getCheckedRadioButtonId();
                    if (opselec == R.id.r1) {

                        if (str1.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            result = numero1 * numero1;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }
                    } else if (opselec == R.id.r2) {

                        if (str1.equals("") || str2.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            numero2 = Double.parseDouble(str2);
                            result = numero1 * numero2;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }
                    } else if (opselec == R.id.r3) {

                        if (str1.equals("") || str2.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            numero2 = Double.parseDouble(str2);
                            result = (numero1 * numero2) / 2.0;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }

                    } else if (opselec == R.id.r4) {

                        if (str1.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            result = Math.PI * numero1 * numero1;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }


                    }


                }
            }
        });

        N2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            public void afterTextChanged(Editable s) {
                String qtyString = s.toString().trim();
                if (qtyString.length() > 0) {
                    String str1 = N1.getText().toString();
                    String str2 = N2.getText().toString();

                    int opselec = gR.getCheckedRadioButtonId();
                    if (opselec == R.id.r1) {

                        if (str1.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            result = numero1 * numero1;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }
                    } else if (opselec == R.id.r2) {

                        if (str1.equals("") || str2.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            numero2 = Double.parseDouble(str2);
                            result = numero1 * numero2;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }
                    } else if (opselec == R.id.r3) {

                        if (str1.equals("") || str2.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            numero2 = Double.parseDouble(str2);
                            result = (numero1 * numero2) / 2.0;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }

                    } else if (opselec == R.id.r4) {

                        if (str1.equals("")) {
                            Res.setText(String.valueOf("0"));
                        } else {
                            numero1 = Double.parseDouble(str1);
                            result = Math.PI * numero1 * numero1;
                            result = Math.round(result * 100) / 100;
                            Res.setText(String.valueOf(result));
                        }
                    }
                }
            }
        });

        gR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String str1 = N1.getText().toString();
                String str2 = N2.getText().toString();


                if (checkedId == R.id.r1) {
                    T1.setText(String.valueOf("Side"));
                    T1.setVisibility(View.VISIBLE);
                    N1.setVisibility(View.VISIBLE);
                    T2.setVisibility(View.INVISIBLE);
                    N2.setVisibility(View.INVISIBLE);

                    if (str1.equals("")) {
                        Res.setText(String.valueOf("0"));
                    } else {
                        numero1 = Double.parseDouble(str1);
                        result = numero1 * numero1;
                        result = Math.round(result * 100) / 100;
                        Res.setText(String.valueOf(result));
                    }
                } else if (checkedId == R.id.r2) {
                    T1.setText(String.valueOf("Side 1"));
                    T2.setText(String.valueOf("Side 2"));
                    T1.setVisibility(View.VISIBLE);
                    N1.setVisibility(View.VISIBLE);
                    T2.setVisibility(View.VISIBLE);
                    N2.setVisibility(View.VISIBLE);

                    if (str1.equals("") || str2.equals("")) {
                        Res.setText(String.valueOf("0"));
                    } else {
                        numero1 = Double.parseDouble(str1);
                        numero2 = Double.parseDouble(str2);
                        result = numero1 * numero2;
                        result = Math.round(result * 100) / 100;
                        Res.setText(String.valueOf(result));
                    }
                } else if (checkedId == R.id.r3) {
                    T1.setText(String.valueOf("Base"));
                    T2.setText(String.valueOf("Height"));
                    T1.setVisibility(View.VISIBLE);
                    N1.setVisibility(View.VISIBLE);
                    T2.setVisibility(View.VISIBLE);
                    N2.setVisibility(View.VISIBLE);

                    if (str1.equals("") || str2.equals("")) {
                        Res.setText(String.valueOf("0"));
                    } else {
                        numero1 = Double.parseDouble(str1);
                        numero2 = Double.parseDouble(str2);
                        result = (numero1 * numero2) / 2.0;
                        result = Math.round(result * 100) / 100;
                        Res.setText(String.valueOf(result));
                    }

                } else if (checkedId == R.id.r4) {
                    T1.setText(String.valueOf("Radius"));
                    T1.setVisibility(View.VISIBLE);
                    N1.setVisibility(View.VISIBLE);
                    T2.setVisibility(View.INVISIBLE);
                    N2.setVisibility(View.INVISIBLE);

                    if (str1.equals("")) {
                        Res.setText(String.valueOf("0"));
                    } else {
                        numero1 = Double.parseDouble(str1);
                        result = Math.PI * numero1 * numero1;
                        result = Math.round(result * 100) / 100;
                        Res.setText(String.valueOf(result));
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
