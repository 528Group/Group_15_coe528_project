+/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

/**
 *
 * @author pruth
 */
public class Silver extends Status {
    @Override
    public void setSilver(Customer c){}
    @Override
    public void setGold(Customer c){
        c.setStatus(new Gold());
    }
}
