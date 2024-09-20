public class Activity{
    public static void main(String[] args){
  
      Dog puppy = new Dog();

      puppy.setName("Spikey");
    
      System.out.println(puppy.showName());
      System.out.println();
  
      puppy.isMale = true;
    
  
      System.out.println(puppy.showName() + " is a Male: " + puppy.isMale);

      System.out.println();
  
      puppy.bark();
      System.out.println();
  
      puppy.setListOfPuppies(new String[] {"Juan","Dos","Tres","Kwatro"});

      puppy.setNumOfPuppies(4);
      
      System.out.println("My Dog " + puppy.showName() + " friends are " + puppy.showNumberOfPuppies());
      puppy.showPuppies();
      System.out.println();
  
    
    }
 }
