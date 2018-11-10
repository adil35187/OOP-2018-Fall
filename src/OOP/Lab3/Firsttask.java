package OOP.Lab3;
class Animal{
    int ears;
    boolean hasPaws;
    String name;
    Animal(){}
    Animal(int ears,boolean haspaws){
        this.ears = ears;
        this.hasPaws = haspaws;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
}
class Panda extends Animal{
    String colour;
    Panda(){
        super();                                //using super constructor;
    }
    Panda(int ears,boolean hasPaws,String colour){
        super(ears,hasPaws);                          //using of super constructor with variables
        this.colour = colour;
    }
    public String getColour(){
        return this.colour;
    }
    public int CountEars(){
        return super.ears;
    }
    public void setName(String newName){
        this.name = newName;                 //overloading
    }
    public String getName(){
        return this.name + " is a panda colour of " + this.colour;   //overriding
    }
}

public class Firsttask{

    public static void main(String[] args){
        Animal animal = new Animal();
        Panda panda = new Panda(2,true,"black-white");
        animal.hasPaws = true;
        animal.setName("Aktaban");
        panda.setName("Po");
        System.out.println(animal.getName());
        System.out.println(panda.getName());
        System.out.println(panda.CountEars());
        System.out.println(panda.getColour());
    }
}