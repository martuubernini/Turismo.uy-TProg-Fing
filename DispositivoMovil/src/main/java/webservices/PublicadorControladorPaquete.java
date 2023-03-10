
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
@WebService(name = "PublicadorControladorPaquete", targetNamespace = "http://webservices/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublicadorControladorPaquete {


    /**
     * 
     * @param arg0
     * @return
     *     returns webservices.DtPaqueteActividades
     * @throws CampoInvalidoException_Exception
     * @throws EntidadNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorPaquete/findRequest", output = "http://webservices/PublicadorControladorPaquete/findResponse", fault = {
        @FaultAction(className = EntidadNoExisteException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/find/Fault/EntidadNoExisteException"),
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/find/Fault/CampoInvalidoException")
    })
    public DtPaqueteActividades find(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws CampoInvalidoException_Exception, EntidadNoExisteException_Exception
    ;

    /**
     * 
     * @return
     *     returns webservices.WrapperArrayList
     * @throws NoHayEntidadesParaListarException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorPaquete/listarPaquetesRequest", output = "http://webservices/PublicadorControladorPaquete/listarPaquetesResponse", fault = {
        @FaultAction(className = NoHayEntidadesParaListarException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/listarPaquetes/Fault/NoHayEntidadesParaListarException")
    })
    public WrapperArrayList listarPaquetes()
        throws NoHayEntidadesParaListarException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws CampoInvalidoException_Exception
     * @throws EntidadRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://webservices/PublicadorControladorPaquete/darDeAltaPaqueteRequest", output = "http://webservices/PublicadorControladorPaquete/darDeAltaPaqueteResponse", fault = {
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/darDeAltaPaquete/Fault/CampoInvalidoException"),
        @FaultAction(className = EntidadRepetidaException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/darDeAltaPaquete/Fault/EntidadRepetidaException")
    })
    public void darDeAltaPaquete(
        @WebParam(name = "arg0", partName = "arg0")
        DtPaqueteActividades arg0)
        throws CampoInvalidoException_Exception, EntidadRepetidaException_Exception
    ;

    /**
     * 
     * @param arg0
     * @param arg1
     * @throws CampoInvalidoException_Exception
     * @throws EntidadRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://webservices/PublicadorControladorPaquete/ingresarActividadTuristicaAPaqueteRequest", output = "http://webservices/PublicadorControladorPaquete/ingresarActividadTuristicaAPaqueteResponse", fault = {
        @FaultAction(className = EntidadRepetidaException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/ingresarActividadTuristicaAPaquete/Fault/EntidadRepetidaException"),
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/ingresarActividadTuristicaAPaquete/Fault/CampoInvalidoException")
    })
    public void ingresarActividadTuristicaAPaquete(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1)
        throws CampoInvalidoException_Exception, EntidadRepetidaException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns webservices.WrapperArrayList
     * @throws NoHayEntidadesParaListarException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorPaquete/listarPaquetesAsociadosAActividadRequest", output = "http://webservices/PublicadorControladorPaquete/listarPaquetesAsociadosAActividadResponse", fault = {
        @FaultAction(className = NoHayEntidadesParaListarException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/listarPaquetesAsociadosAActividad/Fault/NoHayEntidadesParaListarException")
    })
    public WrapperArrayList listarPaquetesAsociadosAActividad(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws NoHayEntidadesParaListarException_Exception
    ;

    /**
     * 
     * @param arg0
     * @param arg1
     * @throws CampoInvalidoException_Exception
     * @throws EntidadRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://webservices/PublicadorControladorPaquete/ingresarCategoriaAPaqueteRequest", output = "http://webservices/PublicadorControladorPaquete/ingresarCategoriaAPaqueteResponse", fault = {
        @FaultAction(className = EntidadRepetidaException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/ingresarCategoriaAPaquete/Fault/EntidadRepetidaException"),
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/ingresarCategoriaAPaquete/Fault/CampoInvalidoException")
    })
    public void ingresarCategoriaAPaquete(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1)
        throws CampoInvalidoException_Exception, EntidadRepetidaException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws CampoInvalidoException_Exception
     * @throws EntidadRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://webservices/PublicadorControladorPaquete/comprarPaqueteRequest", output = "http://webservices/PublicadorControladorPaquete/comprarPaqueteResponse", fault = {
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/comprarPaquete/Fault/CampoInvalidoException"),
        @FaultAction(className = EntidadRepetidaException_Exception.class, value = "http://webservices/PublicadorControladorPaquete/comprarPaquete/Fault/EntidadRepetidaException")
    })
    public void comprarPaquete(
        @WebParam(name = "arg0", partName = "arg0")
        DtCompraPaquete arg0)
        throws CampoInvalidoException_Exception, EntidadRepetidaException_Exception
    ;

}
