package org.example;

public class Entidad {
    public String nombre;
    ENTIDADESTADO entidadestado;
    public ENTIDADCLASE entidadclase;
    public int hp;
    public int mp;
    public int atk;

    public void defend()
    {
        entidadestado = ENTIDADESTADO.DEFENDIENDO;
        System.out.println(nombre+ " esta esperando un ataque!");
    }

    public void attack()
    {
        entidadestado = ENTIDADESTADO.ATACANDO;
        System.out.println(nombre+ " da tremendo sopapo!");
    }

    public void cast()
    {
        entidadestado = ENTIDADESTADO.CASTEANDO;
        System.out.println(nombre+ " te cancela en Twitter");
    }

}
