class Person{
private String name;
private String address;
  
public Person(String name, String address){
this.name = name;
this.address = address;
}
  
public String getName(){
return name;
}
  public String setName(String name){
    this.name = name;
    return name;
  } 
  
 public String getAddress(){
return address;
}
    public String setAddress(String address){
    this.address = address;
      return address;
  }

  public String toString(){
    return "Name: " + name + " Address: " + address;
  }

  
}