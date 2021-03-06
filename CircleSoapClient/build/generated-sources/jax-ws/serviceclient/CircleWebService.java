
package serviceclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CircleWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CircleWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://service/", className = "serviceclient.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service/", className = "serviceclient.HelloResponse")
    @Action(input = "http://service/CircleWebService/helloRequest", output = "http://service/CircleWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
