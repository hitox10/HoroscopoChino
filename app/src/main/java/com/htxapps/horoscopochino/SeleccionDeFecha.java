package com.htxapps.horoscopochino;

import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Date;

public class SeleccionDeFecha extends AppCompatActivity {

    Button Siguiente;
    DatePicker Calendario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_de_fecha);
        Calendario = (DatePicker) findViewById(R.id.calendario);
        Calendario.setMaxDate(new Date().getTime());
        Siguiente = (Button) findViewById(R.id.btnSiguiente);
        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent propio = new Intent(SeleccionDeFecha.this, Inicio.class);
                propio.putExtra("Año",""+Calendario.getYear());
                startActivity(propio);
            }
        });
    }
}
