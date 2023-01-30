import java.util.*;
 public class RolesAndPermissonsMain{

public static void main(String[] args) {
char choice;
String roleName;
int roleId;

Scanner scan = new Scanner(System.in);
Role role=new Role();
while(true){

System.out.print("Enter  RoleName:");

roleName= scan.nextLine();



System.out.print("Enter  Role-Id:");

roleId=scan.nextInt();

scan.nextLine();


 System.out.print("Do you want to continue (yes/no) ");
            String answer = scan.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
}

role.setRoleName(roleName);
role.setRoleId(roleId);
 System.out.println("Details entered:");
        System.out.println("Role Name: " + roleName + ", Role ID: " + roleId);
        scan.close();
}
}

