package com.example.listviewsnadapters;

public class Seguimiento {
    //Atributos
    private String name;
    private String description;
    private int imageResourceId;

    //Drinks is an array of Drinks
    public static final Seguimiento[] seguimientos = {
            new Seguimiento("Reporte Ubicacion", "Ubicacion actual", R.drawable.ubicacion),
            new Seguimiento("Reportes", "Reportes", R.drawable.reportes),
    };

    //Constructor
    public Seguimiento(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    //Metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
