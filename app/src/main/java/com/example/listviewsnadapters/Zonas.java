package com.example.listviewsnadapters;

public class Zonas {

    //Atributos
    private String name;
    private String description;
    private int imageResourceId;

    //Drinks is an array of Drinks
    public static final Zonas[] zonas = {
            new Zonas("Toma decisiones estados", "decision según estado",R.drawable.salud),
            new Zonas("Reportes", "Reporte",R.drawable.reportes),
    };

    //Constructor
    public Zonas(String name, String description, int imageResourceId) {
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

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
