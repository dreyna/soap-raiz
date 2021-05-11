
package com.raiz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.raiz package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RaizCalcularResponse_QNAME = new QName("http://raiz.com/", "raizCalcularResponse");
    private final static QName _RaizCalcular_QNAME = new QName("http://raiz.com/", "raizCalcular");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.raiz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RaizCalcular }
     * 
     */
    public RaizCalcular createRaizCalcular() {
        return new RaizCalcular();
    }

    /**
     * Create an instance of {@link RaizCalcularResponse }
     * 
     */
    public RaizCalcularResponse createRaizCalcularResponse() {
        return new RaizCalcularResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RaizCalcularResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://raiz.com/", name = "raizCalcularResponse")
    public JAXBElement<RaizCalcularResponse> createRaizCalcularResponse(RaizCalcularResponse value) {
        return new JAXBElement<RaizCalcularResponse>(_RaizCalcularResponse_QNAME, RaizCalcularResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RaizCalcular }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://raiz.com/", name = "raizCalcular")
    public JAXBElement<RaizCalcular> createRaizCalcular(RaizCalcular value) {
        return new JAXBElement<RaizCalcular>(_RaizCalcular_QNAME, RaizCalcular.class, null, value);
    }

}
