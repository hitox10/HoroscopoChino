package com.htxapps.horoscopochino;

/**
 * Created by Fernando on 01-11-2017.
 */

public class Usuario {

    public String Nombre;
    public String Nickname;
    public String Contraseña;

    public Usuario(String nombre, String nickname, String contraseña) {
        Nombre = nombre;
        Nickname = nickname;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
