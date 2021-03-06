package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.util.Eater;
import com.zipcodewilmington.froilansfarm.util.NoiseMaker;
import com.zipcodewilmington.froilansfarm.util.Edible;

public abstract class Person extends Animal implements NoiseMaker, Eater {
    public String makeNoise() {
        return null;
    }

    public String eat(Edible edible) {
        return Farmer.createFarmer(null, null) + " ate " + edible;
    }
}
