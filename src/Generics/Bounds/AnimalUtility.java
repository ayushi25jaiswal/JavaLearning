package Generics.Bounds;

import java.util.List;

public class AnimalUtility {

//    public static void printAnimalName(List<Animal> animalList){
//        for(Animal animal : animalList){
//            System.out.println(animal.getName());
//        }
//    }


    public static <T extends Animal> List<T> printAnimalName(List<T> animalList){
        for(Animal animal : animalList){
            System.out.println(animal.getName());
        }
        return animalList;
    }

    //if we don't want any return type then rather then using placeholder T we can use '?'

    public static void printAnimalName2(List<? extends Animal> animalList){
        for(Animal animal : animalList){
            System.out.println(animal.getName());
        }
    }
}
