package com.pzin.generics.bounds;

import com.pzin.generics.bounds.entries.Cat;
import com.pzin.generics.bounds.entries.HomeCat;
import com.pzin.generics.bounds.entries.WildCat;

public class GenericsBounded<T extends Cat> {

    public static void main(String[] args) {

        //GenericsBounded<Animal> genericsBounded = new GenericsBounded<>(); //ошибка
        GenericsBounded<Cat> ok1 = new GenericsBounded<>();
        GenericsBounded<HomeCat> ok2 = new GenericsBounded<>();
        GenericsBounded<WildCat> wk = new GenericsBounded<>();
    }

}