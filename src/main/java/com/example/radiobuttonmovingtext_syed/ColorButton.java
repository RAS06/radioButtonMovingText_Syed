package com.example.radiobuttonmovingtext_syed;

import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;

public class ColorButton extends RadioButton {
    public Color colorID;
    public ColorButton(String name, Color ID){
        super(name);
        colorID = ID;
    }
}
