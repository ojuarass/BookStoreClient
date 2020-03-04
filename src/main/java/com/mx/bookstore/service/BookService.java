
package com.mx.bookstore.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookService", targetNamespace = "http://service.bookstore.mx.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.mx.bookstore.service.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createBook", targetNamespace = "http://service.bookstore.mx.com/", className = "com.mx.bookstore.service.CreateBook")
    @ResponseWrapper(localName = "createBookResponse", targetNamespace = "http://service.bookstore.mx.com/", className = "com.mx.bookstore.service.CreateBookResponse")
    public Book createBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.mx.bookstore.service.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://service.bookstore.mx.com/", className = "com.mx.bookstore.service.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://service.bookstore.mx.com/", className = "com.mx.bookstore.service.GetAllResponse")
    public List<Book> getAll();

}