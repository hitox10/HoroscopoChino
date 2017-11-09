package com.htxapps.horoscopochino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Registro extends AppCompatActivity {

    Button Registrar;
    EditText Nombre,Contraseña,Nickname2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Registrar = (Button) findViewById(R.id.btnRegistrar);
        Nombre = (EditText) findViewById(R.id.txtNombre);
        Contraseña = (EditText) findViewById(R.id.txtContra);
        Nickname2 = (EditText) findViewById(R.id.txtNickname);

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList <Usuario> Usuarios = MainActivity.lista;
                boolean ban = false;
                for (int i=0;i<Usuarios.size();i++)
                {
                 if (Usuarios.get(i).getNickname().equals(Nickname2.getText().toString()))
                 {
                   ban=true;
                 }
                }
                if(ban==false)
                {
                    if (Nombre.getText().toString().equals("")|Contraseña.getText().toString().equals("")|Nickname2.getText().toString().equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "Rellene los campos vacios", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Usuario registrado exitosamente", Toast.LENGTH_LONG).show();
                        MainActivity a = new MainActivity();
                        a.agregarUsuario(Nombre.getText().toString(), Contraseña.getText().toString(), Nickname2.getText().toString());
                        finish();
                    }
                }
                else if(ban==true)
                {
                    Toast.makeText(getApplicationContext(),"Error usuario ya existente",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
