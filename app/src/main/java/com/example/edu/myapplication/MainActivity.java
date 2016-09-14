package com.example.edu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        public void calcular(View view) {
            EditText numero1 = (EditText) findViewById(R.id.numer1);
            EditText numero2 = (EditText) findViewById(R.id.numer2);
            TextView comparacion = (TextView) findViewById(R.id.rComparacion);
            TextView suma = (TextView) findViewById(R.id.rSuma);
            TextView resta = (TextView) findViewById(R.id.rResta);
            TextView multiplicacion = (TextView) findViewById(R.id.rMultiplicacion);
            TextView mensaje = (TextView) findViewById(R.id.mensaje);
            Button calcular = (Button) findViewById(R.id.calcular);
            Button limpiar = (Button) findViewById(R.id.limpiar);


            int numero = Integer.parseInt(numero1.getText().toString());
            int numeroo = Integer.parseInt(numero2.getText().toString());
            int cero = 0;


            if (numeroo == cero) {
                mensaje.setText("ERROR, EL NUMERO ES CERO");
            } else {

                int resultado = numero + numeroo;
                suma.setText(String.valueOf("" + resultado));

                int resultadoresta = numero - numeroo;
                resta.setText(String.valueOf("" + resultadoresta));

                int resultadomulti = numero * numeroo;
                multiplicacion.setText(String.valueOf("" + resultadomulti));


                if (numero == numeroo) {
                    comparacion.setText(String.valueOf(numero + "=" + numeroo));
                } else if (numero < numeroo) {
                    comparacion.setText(String.valueOf(numero + "<" + numeroo));
                } else if (numero > numeroo) {
                    comparacion.setText(String.valueOf(numero + ">" + numeroo));
                }
            }
        }

        public void limpiar(View view) {
            String mensajee;
            mensajee = "";
            TextView comparacion = (TextView) findViewById(R.id.rComparacion);
            TextView suma = (TextView) findViewById(R.id.rSuma);
            TextView resta = (TextView) findViewById(R.id.rResta);
            TextView multiplicacion = (TextView) findViewById(R.id.rMultiplicacion);
            TextView mensaje = (TextView) findViewById(R.id.mensaje);

            comparacion.setText(mensajee);
            suma.setText(mensajee);
            resta.setText(mensajee);
            multiplicacion.setText(mensajee);
            mensaje.setText(mensajee);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

    }

