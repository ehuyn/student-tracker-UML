public class Extracurricular{
  private String name;
  private String supervisor;

  Extracurricular(String aName, String aSupervisor){
    name = aName;
    supervisor = aSupervisor;
  }

  public String getName(){
    return name;
  }

  public String getSupervisor(){
    return supervisor;
  }
  
  public void displayInfo(){
    System.out.println("Club: " + name);
    System.out.println("Supervisor: " + supervisor);
  }
}