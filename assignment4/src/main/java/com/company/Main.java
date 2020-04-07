package com.company;

import com.company.animals.Eagle;
import com.company.animals.Lion;
import com.company.cages.BirdAviary;
import com.company.cages.LionAviary;
import com.company.cages.MammalAviary;
import com.company.exceptions.NoFreePlaceException;
import com.company.exceptions.RemovingAnimalNotFoundException;

public class Main {

    public static void main(String[] args) throws NoFreePlaceException, RemovingAnimalNotFoundException {
        Zoo zoo = new Zoo();
        LionAviary<Lion> newB = new LionAviary<>(2);
        newB.addAnimal(new Lion("Dog",2,4,123.4,321.2));
        newB.addAnimal(new Lion("Tiger",2,4,123.4,321.2));
        zoo.addCage(newB);
        BirdAviary<Eagle> birdAviary = new BirdAviary<>(2);
        Eagle eagle = new Eagle("Eagle",1,2,0.5,20,"2");
        birdAviary.addAnimal(eagle);
        zoo.addCage(birdAviary);
        System.out.println(zoo.getCountOfAnimals());
    }
}
