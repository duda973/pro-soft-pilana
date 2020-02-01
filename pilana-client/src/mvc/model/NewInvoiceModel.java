/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import domain.Client;
import domain.WoodProduct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import thread.ThreadController;
import transfer.ResponseObject;
import util.DOperation;

/**
 *
 * @author Dudat
 */
public class NewInvoiceModel {
    public List<WoodProduct> findWoodProducts() throws IOException, Exception{
        ResponseObject response = (ResponseObject) ThreadController.getInstance().request(DOperation.FIND_WOOD_PRODUCTS, null);
        return (List<WoodProduct>) response.getData();
    }

    public List<Client> findClients() throws IOException, Exception {
        ResponseObject response = (ResponseObject) ThreadController.getInstance().request(DOperation.FIND_CLIENTS, null);
        return (List<Client>) response.getData();
    }

    public List<WoodProduct> search(String term, List<WoodProduct> list) {
        List<WoodProduct> searchResults = new ArrayList<>();

        for (WoodProduct wp : list) {
            if (wp.getName().toLowerCase().trim().contains(term.toLowerCase().trim()) || wp.getId() == Integer.valueOf(term)) {
                searchResults.add(wp);
            }
        }

        return searchResults;
    }
}
