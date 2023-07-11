
package net.dsw.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.dsw.services package. 
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

    private final static QName _GetStudentById_QNAME = new QName("http://services.dsw.com", "getStudentById");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://services.dsw.com", "getStudentByIdResponse");
    private final static QName _GetStudentList_QNAME = new QName("http://services.dsw.com", "getStudentList");
    private final static QName _GetStudentListResponse_QNAME = new QName("http://services.dsw.com", "getStudentListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.dsw.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentById }
     * 
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     * 
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link StudentContainerData }
     * 
     */
    public StudentContainerData createStudentContainerData() {
        return new StudentContainerData();
    }

    /**
     * Create an instance of {@link StudentData }
     * 
     */
    public StudentData createStudentData() {
        return new StudentData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dsw.com", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dsw.com", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dsw.com", name = "getStudentList")
    public JAXBElement<GetStudentById> createGetStudentList(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentList_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.dsw.com", name = "getStudentListResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentListResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentListResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

}
