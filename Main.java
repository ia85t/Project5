/*
 * CMPSCI 2261 7/25/2021 Project 5
 * Author: Illia Arzamastsev

For your fifth project, you will be needing to do three things:

Implement an Interface.
Inherit from an abstract class.
Create either a SET or List of your elements.
 
All creatures on earth share DNA in some manner. Taxonomists love to classify these creatures into classes. Because computers are the way of the future, these unnamed taxonomists want you to write a program which classifies Plants, Animals, and Fungi!

Your Plant, Animal, and Fungi classes should all inherit from an abstract class called "creature" which has the function "eatFood".
- Your Plant class must override the function eat food and return "sunlight (aka photosynthesis)".
- Your Animal class must override the function eatFood and return "ingestion".
- Your Fungi class must override the function eatFood and return "external digestion with hyphae".

Your classes must also implement the interface Reproduction, which has the function "modeOfReproduction".
Implementing the interface:
- Animals must return the string "Sexual Reproduction" as their mode of production
- Plants must return the string "Seeds" as their mode of production.
- Fungi must return the string "Spores" as their mode of production.

Then create 2 classes that extend Animal, 2 classes that extend Plant, and 2 classes that extend Fungi.  Each of your classes should additionally override the 'toString' method. Be sure your toString method uses both your interface and abstract class methods and add some extra stuff that represents your class.

In your main function, after implementing your classes, create each type, and place them in a SET or a LIST. That is, for animals, have an Animal list, for plants, have a plant list, and for Fungi, have a fungi list.

Then print out each of your sets/lists. When printing your lists be sure to print them with your overridden toString methods.

 */

import java.util.ArrayList;
import java.util.List;

interface Reproduction {//1.implement an interface
	String modeOfReproduction();
}

abstract class Creature {//2.inherit from abstract class
	abstract String eatFood();
}

//Plant, Animal, and Fungi classes should all inherit from an abstract class called "creature" which has the function "eatFood".

//Classes must also implement the interface Reproduction, which has the function "modeOfReproduction".
class Animal extends Creature implements Reproduction {      
	  //Override eatFood and modeOfReproduction
	   @Override
	   public String eatFood() {                                
	       return "ingestion";
	   }
	   
	   @Override
	   public String modeOfReproduction() {
	       return "Sexual Reproduction";
	   }
	}



class Plant extends Creature implements Reproduction {
	//Override eatFood and modeOfReproduction
	
	   @Override
	   public String eatFood() {
	       return "sunlight (aka photosynthesis)";
	   }
	   
	   @Override
	   public String modeOfReproduction() {
	       return "Seeds";
	   }
	}


	class Fungi extends Creature implements Reproduction {       //Create a sub class Fungi
	   @Override
		public String eatFood() {
	       return "external digestion with hyphae";
	   }
	   
	   @Override
	   public String modeOfReproduction() {
	       return "Spores";
	   }
	}
	
	//Create 2 classes that extend Animal, 2 classes that extend Plant, and 2 classes that extend Fungi.  Each of your classes should additionally override the 'toString' method.
	
	class Lion extends Animal {
		   @Override
		   public String toString() {
		       String data = "Food is  " + eatFood() + " and reproduction mode is " + modeOfReproduction();
		       return data;
		   }
		}
	
	class Zebra extends Animal {
		@Override
		   public String toString() {
		       String data = "Food is  " + eatFood() + " and reproduction mode is " + modeOfReproduction();
		       return data;
		   }
		}
	
	class Apple extends Plant {
		   @Override
		   public String toString() {
		       String data = "Food is " + eatFood() + " and reproduction mode is " + modeOfReproduction();
		       return data;
		   }
		}
	class Orange extends Plant {
		   @Override
		   public String toString() {
		       String data = "Food is " + eatFood() + " and reproduction mode is " + modeOfReproduction();
		       return data;
		   }
		}
	
	class Agaricus extends Fungi {
		   @Override
		   public String toString() {
		       String data = "Food is " + eatFood() + " and reproduction mode is " + modeOfReproduction();
		       return data;
		   }
		}
	
	class Eomycota extends Fungi {
		   @Override
		   public String toString() {
		       String data = "Food is " + eatFood() + " and reproduction mode is " + modeOfReproduction();
		       return data;
		   }
		}
	
	
	
//Main class to test program
public class Main {
	public static void main(String[] args) {
		
		//In your main function, after implementing your classes, create each type, and place them in a SET or a LIST. That is, for animals, have an Animal list, for plants, have a plant list, and for Fungi, have a fungi list.
		   List<Animal> animals = new ArrayList<Animal>();
		   //add elements
		   animals.add(new Zebra());
	       animals.add(new Lion());
	       //print added elements to list
	       System.out.println("Animal list");
	       for (Animal animal : animals) {
	           System.out.println(animal);
	       }
		
	       List<Plant> plants = new ArrayList<Plant>();
	       
	       plants.add(new Apple());
	       plants.add(new Orange());
	       System.out.println("Plant list");
	       for (Plant plant : plants) {
	           System.out.println(plant);
	       }
	       
	       List<Fungi> fungis = new ArrayList<Fungi>();
	       fungis.add(new Agaricus());
	       fungis.add(new Agaricus());
	       System.out.println("Fungis list");
	       for (Fungi fungi : fungis) {
	           System.out.println(fungi);
	       }
	       
	       
	       



	}

}
