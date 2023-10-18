/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cis170assignment9;

/**
 *
 *  @author Clay Skidmore
 * Professor Lowrance
 * Class: 23/FA-CIS-170-W01
 * Assignment 9
 */
public class CIS170Assignment9 {

    public static class Animal{
       public String Type= "";
        String Breed = "";
        String Name= "";
        String Color= "";
        byte numlegs = 0;
        String favoriteFood = "";
        
        void makeSound(){
            System.out.println("A sound");
        }
        void eat(){
            System.out.println(Name + " is eating their favorite food, " + favoriteFood + "!!!");
        }
        void sleep(){
            System.out.println(Name + " is sleeping, Zzzzzzzzz zzzzzzzzzzZZzzzz");
        }
    
    public static class Cat extends Animal{
           @Override void makeSound(){
               System.out.println("Prrrrrrrr");
           }
           
        }
      public static class Dog extends Animal{
             @Override void makeSound(){
               System.out.println("Woof woof!");
           }
        }
      public static class Fish extends Animal{
             @Override void makeSound(){
               System.out.println("Glub, glub, glub");
           }
        }
       public static class Bird extends Animal{
             @Override void makeSound(){
               System.out.println("Tweet, tweet, tweet!!");
           }
        }
    
    }
    
    public static void main(String[] args) {
       System.out.println("Here we are about to make and list some animals!");
       String[] catOne = {"Cat","Norweigian Forest Cat", "Hairy","Red","4","tuna"};
       String[] catTwo = {"Cat","Siamese", "Tom","Blue","4","tuna"};
       String[] dog = {"Dog","Terrier", "Dingo","Grey","4","beef"};
       String[] birdOne = {"Bird","Finch", "Tweety","Yellow","2","sunflower seeds"};
       String[] birdTwo = {"Bird","Parrot", "Polly","Red","2","sunflower seeds"};
        String[] fish = {"Fish","Clown fish", "Nemo","Red","0","coral"};
    
        String[][] Animals = {catOne,catTwo,dog,birdOne,birdTwo,fish};
//        Animals[0] = catOne;
//        Animals[1] = catTwo;
//        Animals[2] = dog;
//        Animals[3] = birdOne;
//        Animals[4] = birdTwo;
//        Animals[5] = fish;
        
        
    
    for (String[] animal: Animals){
       
        if (animal[0].equals("Cat")){
        Animal pet = new  Animal.Cat();
        pet.Type = animal[0];
        pet.Breed = animal[1];
        pet.Name = animal[2];
        pet.Color = animal[3];
        pet.numlegs = convertStringToByte(animal[4]);
        pet.favoriteFood = animal[5];  
       pet.makeSound();
        pet.eat();
        pet.sleep();
        
        } else if (animal[0].equals("Dog")){
           Animal pet = new Animal.Dog();
        pet.Type = animal[0];
        pet.Breed = animal[1];
        pet.Name = animal[2];
        pet.Color = animal[3];
        pet.numlegs = convertStringToByte(animal[4]);
        pet.favoriteFood = animal[5]; 
        pet.makeSound();
        pet.eat();
        pet.sleep();
        
        } else if (animal[0].equals("Fish")){
            Animal pet = new Animal.Fish();
         pet.Type = animal[0];
        pet.Breed = animal[1];
        pet.Name = animal[2];
        pet.Color = animal[3];
        pet.numlegs = convertStringToByte(animal[4]);
        pet.favoriteFood = animal[5]; 
        pet.makeSound();
        pet.eat();
        pet.sleep();
        
        }  else if (animal[0].equals("Bird")){
            Animal pet = new Animal.Bird();
        pet.Type = animal[0];
        pet.Breed = animal[1];
        pet.Name = animal[2];
        pet.Color = animal[3];
        pet.numlegs = convertStringToByte(animal[4]);
        pet.favoriteFood = animal[5]; 
        pet.makeSound();
        pet.eat();
        pet.sleep();
        }
  
    }

    }
    
    public static byte convertStringToByte(String str) 
    { 
  
        // Convert string to byte 
        // using parseByte() method 
        return Byte.parseByte(str); 
    }
}

