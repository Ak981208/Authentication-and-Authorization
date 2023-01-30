import java.util.*;  
class Permissions{

public  void showAllPermissions (){
List<String> permission=new ArrayList<String>();  
 
permission.add("leaves");  
permission.add("projects");  
permission.add("tasks");  
permission.add("Business units");  
permission.add("requisitions");
permission.add("holidays");
permission.add("designation");
permission.add("Timesheet");
permission.add("Bands");
 
 //Iterating the List element using for-each loop  
 for(String fruit:permission)  
  System.out.println(fruit);  

}
}