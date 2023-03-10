
package webservices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "PublicadorControladorDepartamento", targetNamespace = "http://webservices/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublicadorControladorDepartamento {


    /**
     * 
     * @return
     *     returns webservices.WrapperArrayList
     * @throws NoHayEntidadesParaListarException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorDepartamento/listarDepartamentosRequest", output = "http://webservices/PublicadorControladorDepartamento/listarDepartamentosResponse", fault = {
        @FaultAction(className = NoHayEntidadesParaListarException_Exception.class, value = "http://webservices/PublicadorControladorDepartamento/listarDepartamentos/Fault/NoHayEntidadesParaListarException")
    })
    public WrapperArrayList listarDepartamentos()
        throws NoHayEntidadesParaListarException_Exception
    ;

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @throws CampoInvalidoException_Exception
     * @throws EntidadRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://webservices/PublicadorControladorDepartamento/darDeAltaDepartamentoRequest", output = "http://webservices/PublicadorControladorDepartamento/darDeAltaDepartamentoResponse", fault = {
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorDepartamento/darDeAltaDepartamento/Fault/CampoInvalidoException"),
        @FaultAction(className = EntidadRepetidaException_Exception.class, value = "http://webservices/PublicadorControladorDepartamento/darDeAltaDepartamento/Fault/EntidadRepetidaException")
    })
    public void darDeAltaDepartamento(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws CampoInvalidoException_Exception, EntidadRepetidaException_Exception
    ;

}
