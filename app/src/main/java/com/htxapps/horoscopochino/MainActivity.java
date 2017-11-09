package com.htxapps.horoscopochino;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList <Usuario> lista = new ArrayList<Usuario>();
    static Usuario EnSesion;
    Button Iniciar,Registro;
    EditText Usuario,Contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista.add(new Usuario("Franco","Franco1122","2323"));
        lista.add(new Usuario("Rafael","Rafael2233","1212"));
        lista.add(new Usuario("Fernando","Fernando3344","3434"));
        lista.add(new Usuario("Andres","Andres532","123"));
        lista.add(new Usuario("Mario","Mario2321","234"));

        Iniciar = (Button) findViewById(R.id.btnIniciarSesion);
        Registro = (Button) findViewById(R.id.btnRegistro);
        Usuario = (EditText) findViewById(R.id.txtUsuario);
        Contraseña = (EditText) findViewById(R.id.txtContraseña);

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean ban=false;
                for (int i=0;i<lista.size();i++)
                {
                    if (Usuario.getText().toString().equals(lista.get(i).getNickname()))
                    {
                     if (Contraseña.getText().toString().equals(lista.get(i).getContraseña()))
                     {
                         ban=true;
                         EnSesion = new Usuario(lista.get(i).getNombre(),lista.get(i).Nickname,lista.get(i).getContraseña());
                         Intent propio = new Intent(MainActivity.this, SeleccionDeFecha.class);
                         startActivity(propio);
                     }
                    }
                }
                if (ban==false){
                    Toast.makeText(getApplicationContext(),"Error usuario no encontrado o contraseña incorrecta",Toast.LENGTH_LONG).show();
                }
            }
        });

        Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent propio = new Intent(MainActivity.this, Registro.class);
                startActivity(propio);
            }
        });
    }


    public void agregarUsuario (String Nombre,String Contraseña,String Nickname)
    {
        lista.add(new Usuario(Nombre,Nickname,Contraseña));
    }



}
