/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import domain.Employee;
import thread.ThreadController;
import transfer.ResponseObject;
import util.DOperation;

/**
 *
 * @author Dudat
 */
public class LoginModel {
    
    public ResponseObject login(String username, String password) throws Exception {
        Employee emp = new Employee(username, password);
        return (ResponseObject) ThreadController.getInstance().request(DOperation.LOGIN, emp);
    }
}
