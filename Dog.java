 class Dog {
    String name;
    int numOfPuppies;
    boolean isMale;
    String[] listOfPuppies;
  
    public void setName(String thisName){
      name = thisName;
    }
  
    public String showName(){
      return name;
    }
  
    public void bark(){
      System.out.println("woof! woof!");
    }  
  
    public void setNumOfPuppies(int numOfPuppy){
      numOfPuppies = numOfPuppy;
    }
  
    public int showNumberOfPuppies(){
      return numOfPuppies;
    }
  
    public void setListOfPuppies(String[] puppies){
      listOfPuppies = puppies;
  
    }
  
    public void showPuppies(){
      for(int i = 0; i < listOfPuppies.length; i++){
        System.out.println("Puppy " + listOfPuppies[i]);
      }
    }
}

