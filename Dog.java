public class Dog {
    String name;
    boolean isMale;
    int puppies;
    String listofpuppies[] = new String [5];


    public void setName(String thisName){
        thisName = name; 
    }
   
    public String showName( String thisName){
        return thisName;
    }

    public String bark(){
        return "woof woof";
    }

   
}

