package com.example.listviewsnadapters;

public class Diagnostico {

    //Atributos
    private String name;
    private String description;
    private int imageResourceId;

    //Drinks is an array of Drinks
    public static final Diagnostico[] diagnosticos = {
            new Diagnostico("Sintomas", "Sintomas presentados",R.drawable.sintoms),
            new Diagnostico("Examenes", "Resultados de examenes",R.drawable.exam),
    };

    //Constructor
    public Diagnostico(String name, String description, int imageResourceId) {
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
