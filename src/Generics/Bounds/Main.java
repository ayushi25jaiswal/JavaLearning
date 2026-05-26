package Generics.Bounds;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {


        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Jimmy"));
        animalList.add(new Dog("Tarzan", "GR")); //Can add Dog object to Animal list

        List<Dog> DogList = new ArrayList<>();

        DogList.add(new Dog("Kittu", "GR"));
//        DogList.add(new Animal("YoYo")); // Cant add the parent object to child list;


        AnimalUtility.printAnimalName(animalList);
        AnimalUtility.printAnimalName(DogList);
        // Now it works for both AnimalList and DogList, as we have bounded the function to
        // use any list which extend animal class

        AnimalUtility.printAnimalName2(animalList);
        AnimalUtility.printAnimalName2(DogList);

        //AnimalUtility.printAnimalName(DogList);
        // Now here you cant pass the Dog list even if it extends the Animal class
        //this is not compared on class, it's on List, which type you can pass on.
    }
}
