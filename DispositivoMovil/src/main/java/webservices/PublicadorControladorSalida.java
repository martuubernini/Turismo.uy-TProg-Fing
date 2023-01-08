
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
@WebService(name = "PublicadorControladorSalida", targetNamespace = "http://webservices/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublicadorControladorSalida {


    /**
     * 
     * @param fileName
     * @return
     *     returns byte[]
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorSalida/getFileRequest", output = "http://webservices/PublicadorControladorSalida/getFileResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://webservices/PublicadorControladorSalida/getFile/Fault/IOException")
    })
    public byte[] getFile(
        @WebParam(name = "fileName", partName = "fileName")
        String fileName)
        throws IOException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns webservices.WrapperArrayList
     * @throws CampoInvalidoException_Exception
     * @throws NoHayEntidadesParaListarException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorSalida/listarSalidasAsociadasAActividadTuristicaRequest", output = "http://webservices/PublicadorControladorSalida/listarSalidasAsociadasAActividadTuristicaResponse", fault = {
        @FaultAction(className = NoHayEntidadesParaListarException_Exception.class, value = "http://webservices/PublicadorControladorSalida/listarSalidasAsociadasAActividadTuristica/Fault/NoHayEntidadesParaListarException"),
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorSalida/listarSalidasAsociadasAActividadTuristica/Fault/CampoInvalidoException")
    })
    public WrapperArrayList listarSalidasAsociadasAActividadTuristica(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws CampoInvalidoException_Exception, NoHayEntidadesParaListarException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws CampoInvalidoException_Exception
     * @throws EntidadRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://webservices/PublicadorControladorSalida/darDeAltaSalidaTuristicaRequest", output = "http://webservices/PublicadorControladorSalida/darDeAltaSalidaTuristicaResponse", fault = {
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorSalida/darDeAltaSalidaTuristica/Fault/CampoInvalidoException"),
        @FaultAction(className = EntidadRepetidaException_Exception.class, value = "http://webservices/PublicadorControladorSalida/darDeAltaSalidaTuristica/Fault/EntidadRepetidaException")
    })
    public void darDeAltaSalidaTuristica(
        @WebParam(name = "arg0", partName = "arg0")
        DtSalidaTuristica arg0)
        throws CampoInvalidoException_Exception, EntidadRepetidaException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns webservices.DtSalidaTuristica
     * @throws CampoInvalidoException_Exception
     * @throws EntidadNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorSalida/getSalidaTuristicaRequest", output = "http://webservices/PublicadorControladorSalida/getSalidaTuristicaResponse", fault = {
        @FaultAction(className = EntidadNoExisteException_Exception.class, value = "http://webservices/PublicadorControladorSalida/getSalidaTuristica/Fault/EntidadNoExisteException"),
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorSalida/getSalidaTuristica/Fault/CampoInvalidoException")
    })
    public DtSalidaTuristica getSalidaTuristica(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws CampoInvalidoException_Exception, EntidadNoExisteException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns webservices.WrapperArrayList
     * @throws CampoInvalidoException_Exception
     * @throws NoHayEntidadesParaListarException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorSalida/listarSalidasVigentesAsociadasAActividadTuristicaRequest", output = "http://webservices/PublicadorControladorSalida/listarSalidasVigentesAsociadasAActividadTuristicaResponse", fault = {
        @FaultAction(className = NoHayEntidadesParaListarException_Exception.class, value = "http://webservices/PublicadorControladorSalida/listarSalidasVigentesAsociadasAActividadTuristica/Fault/NoHayEntidadesParaListarException"),
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorSalida/listarSalidasVigentesAsociadasAActividadTuristica/Fault/CampoInvalidoException")
    })
    public WrapperArrayList listarSalidasVigentesAsociadasAActividadTuristica(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws CampoInvalidoException_Exception, NoHayEntidadesParaListarException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws CampoInvalidoException_Exception
     * @throws EntidadRepetidaException_Exception
     * @throws MaximoDeTuristasAlcanzadoException_Exception
     */
    @WebMethod
    @Action(input = "http://webservices/PublicadorControladorSalida/inscribirTuristaASalidaTuristicaRequest", output = "http://webservices/PublicadorControladorSalida/inscribirTuristaASalidaTuristicaResponse", fault = {
        @FaultAction(className = EntidadRepetidaException_Exception.class, value = "http://webservices/PublicadorControladorSalida/inscribirTuristaASalidaTuristica/Fault/EntidadRepetidaException"),
        @FaultAction(className = CampoInvalidoException_Exception.class, value = "http://webservices/PublicadorControladorSalida/inscribirTuristaASalidaTuristica/Fault/CampoInvalidoException"),
        @FaultAction(className = MaximoDeTuristasAlcanzadoException_Exception.class, value = "http://webservices/PublicadorControladorSalida/inscribirTuristaASalidaTuristica/Fault/MaximoDeTuristasAlcanzadoException")
    })
    public void inscribirTuristaASalidaTuristica(
        @WebParam(name = "arg0", partName = "arg0")
        DtInscripcionSalida arg0)
        throws CampoInvalidoException_Exception, EntidadRepetidaException_Exception, MaximoDeTuristasAlcanzadoException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://webservices/PublicadorControladorSalida/existeSalidaConNombreRequest", output = "http://webservices/PublicadorControladorSalida/existeSalidaConNombreResponse")
    public boolean existeSalidaConNombre(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}