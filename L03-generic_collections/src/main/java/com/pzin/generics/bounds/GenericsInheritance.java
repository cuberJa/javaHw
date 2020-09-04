package com.pzin.generics.bounds;

import java.util.ArrayList;
import java.util.List;
import com.pzin.generics.bounds.entries.Animal;
import com.pzin.generics.bounds.entries.Cat;

public class GenericsInheritance {

    public static void main(String[] args) {

        Animal cat = new Cat();

        List<Cat> catList = new ArrayList<>();
        //List<Animal> animalList = catList; //ошибка
    }
}