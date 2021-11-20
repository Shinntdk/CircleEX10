/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlesoapclient;

import java.util.Scanner;

/**
 *
 * @author natthidak
 */
public class CircleSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Circle Curcumferance = "+circum(radius));
        System.out.println("Circle Area = "+area(radius));
    }
    private static Double circum(double radius) {
        serviceclient.CircleWebService_Service service = new serviceclient.CircleWebService_Service();
        serviceclient.CircleWebService port = service.getCircleWebServicePort();
        return 2 * ((double)22/7) * radius;
    }
    private static Double area(double radius) {
        serviceclient.CircleWebService_Service service = new serviceclient.CircleWebService_Service();
        serviceclient.CircleWebService port = service.getCircleWebServicePort();
        return ((double)22/7) * radius * radius;
    }
    
}
