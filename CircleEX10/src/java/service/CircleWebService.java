/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author natthidak
 */
@WebService(serviceName = "CircleWebService")
public class CircleWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "circum")
    public double circum(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        return 2 * ((double)22/7) * radius;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "area")
    public double area(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        return ((double)22/7) * radius * radius;
    }

    /**
     * This is a sample web service operation
     */
    
}
