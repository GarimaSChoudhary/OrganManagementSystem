/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OrganFindingTeam;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namangupta
 */
public class Facilities extends Organization{
    
    public Facilities(String name){
        super(name);

    }
    int counterNumber;

    public int getCounterNumber() {
        return counterNumber;
    }

    public void setCounterNumber(int counterNumber) {
        this.counterNumber = counterNumber;
    }

    @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrganFindingTeam());
        return roles;
    }
    @Override
    public Organization.getRole getOrgType() {
        return Organization.getRole.Facilities;
    } 
} 