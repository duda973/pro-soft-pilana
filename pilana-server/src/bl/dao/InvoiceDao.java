/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl.dao;

import domain.Invoice;

/**
 *
 * @author Dudat
 */
public interface InvoiceDao {

    public Invoice insert(Invoice invoice) throws Exception;
    
}
