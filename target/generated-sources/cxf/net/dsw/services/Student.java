package net.dsw.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2023-07-11T01:12:36.291+01:00
 * Generated source version: 3.4.5
 *
 */
@WebService(targetNamespace = "http://services.dsw.com", name = "Student")
@XmlSeeAlso({ObjectFactory.class})
public interface Student {

    @WebMethod
    @Action(input = "http://services.dsw.com/Student/getStudentByIdRequest", output = "http://services.dsw.com/Student/getStudentByIdResponse")
    @RequestWrapper(localName = "getStudentById", targetNamespace = "http://services.dsw.com", className = "net.dsw.services.GetStudentById")
    @ResponseWrapper(localName = "getStudentByIdResponse", targetNamespace = "http://services.dsw.com", className = "net.dsw.services.GetStudentByIdResponse")
    @WebResult(name = "StudentContainer", targetNamespace = "")
    public net.dsw.services.StudentContainerData getStudentById(

        @WebParam(name = "idStudent", targetNamespace = "")
        int idStudent
    );

    @WebMethod
    @Action(input = "http://services.dsw.com/Student/getStudentListRequest", output = "http://services.dsw.com/Student/getStudentListResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "getStudentListResponse", targetNamespace = "http://services.dsw.com", partName = "parameters")
    public GetStudentByIdResponse getStudentList(

        @WebParam(partName = "parameters", name = "getStudentList", targetNamespace = "http://services.dsw.com")
        GetStudentById parameters
    );
}
