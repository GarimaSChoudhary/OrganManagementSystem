package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.Users.Users;

/**
 *
 * @author garima
 */
public class ConfigureASystem {
        public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee(1,"sysadmin");
        
        Users ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
