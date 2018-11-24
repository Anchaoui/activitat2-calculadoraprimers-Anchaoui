package com.example.noureddine.numerosprims;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edNumero;
    Button bCalcular;
    TextView tRespuesta;
    AlertDialog.Builder dialog;
    int[] numerosPr=new int[999999];
    int i=0;
    int fin = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNumero = findViewById(R.id.edNumero);
        bCalcular = findViewById(R.id.bCalcular);
        tRespuesta = findViewById(R.id.tRespuesta);
        bCalcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(edNumero.getText().toString());
                    if(edNumero.getText().length() == 0||numero>=numerosPr.length){
                        dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("Error");
                        dialog.setMessage(R.string.Ingressar);
                        dialog.setCancelable(true);
                        dialog.setPositiveButton(R.string.Cerrar, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo, int id) {
                                dialogo.cancel();
                                edNumero.requestFocus();
                            }
                        });
                        dialog.show();
                    }else{
                        NumerosPrims numerosPrims=new NumerosPrims(numerosPr.length,numero);
                        tRespuesta.setText(getString(R.string.el)+" "+numero+" "+getString(R.string.numero_primo)+" "+numerosPrims.getResoltado());
                        edNumero.setEnabled(true);
                    }
                }
        });
    }
}
