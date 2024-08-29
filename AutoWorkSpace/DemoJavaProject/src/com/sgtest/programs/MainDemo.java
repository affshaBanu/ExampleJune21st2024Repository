package com.sgtest.programs;

class  Human1{
    String firstName;
    int age;
        }
        class Birds {
            String festherColor;
            int noOfWings;
        }
        class DomesticAnimal{
            String breedName;
            String quantityOfMilkProvides;
        }
public class MainDemo {
    public static void main(String args[]) {
        Human1 ref1=new Human1();
        ref1.firstName="Affi";
        ref1.age=21;
        System.out.println("First Name:"+ref1.firstName);
        System.out.println("Age is:"+ref1.age);

        Birds sparrow=new Birds();
        sparrow.festherColor="Grey Color";
        sparrow.noOfWings=2;
        System.out.println("Feather Color:"+sparrow.festherColor);
        System.out.println("No of Wings:"+sparrow.noOfWings);

        DomesticAnimal cow=new DomesticAnimal();
        cow.breedName="Jersy";
        cow.quantityOfMilkProvides="10 Litres";
        System.out.println("Breed Name:"+cow.breedName);
        System.out.println("Qunatity Of Milk Provides:"+cow.quantityOfMilkProvides);

    }
}
