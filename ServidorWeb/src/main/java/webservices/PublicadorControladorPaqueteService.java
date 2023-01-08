
package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "PublicadorControladorPaqueteService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:9128/webservices/ControladorPaquete?wsdl")
public class PublicadorControladorPaqueteService
    extends Service
{

    private final static URL PUBLICADORCONTROLADORPAQUETESERVICE_WSDL_LOCATION;
    private final static WebServiceException PUBLICADORCONTROLADORPAQUETESERVICE_EXCEPTION;
    private final static QName PUBLICADORCONTROLADORPAQUETESERVICE_QNAME = new QName("http://webservices/", "PublicadorControladorPaqueteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9128/webservices/ControladorPaquete?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PUBLICADORCONTROLADORPAQUETESERVICE_WSDL_LOCATION = url;
        PUBLICADORCONTROLADORPAQUETESERVICE_EXCEPTION = e;
    }

    public PublicadorControladorPaqueteService() {
        super(__getWsdlLocation(), PUBLICADORCONTROLADORPAQUETESERVICE_QNAME);
    }

    public PublicadorControladorPaqueteService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PUBLICADORCONTROLADORPAQUETESERVICE_QNAME, features);
    }

    public PublicadorControladorPaqueteService(URL wsdlLocation) {
        super(wsdlLocation, PUBLICADORCONTROLADORPAQUETESERVICE_QNAME);
    }

    public PublicadorControladorPaqueteService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PUBLICADORCONTROLADORPAQUETESERVICE_QNAME, features);
    }

    public PublicadorControladorPaqueteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PublicadorControladorPaqueteService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PublicadorControladorPaquete
     */
    @WebEndpoint(name = "PublicadorControladorPaquetePort")
    public PublicadorControladorPaquete getPublicadorControladorPaquetePort() {
        return super.getPort(new QName("http://webservices/", "PublicadorControladorPaquetePort"), PublicadorControladorPaquete.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublicadorControladorPaquete
     */
    @WebEndpoint(name = "PublicadorControladorPaquetePort")
    public PublicadorControladorPaquete getPublicadorControladorPaquetePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "PublicadorControladorPaquetePort"), PublicadorControladorPaquete.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUBLICADORCONTROLADORPAQUETESERVICE_EXCEPTION!= null) {
            throw PUBLICADORCONTROLADORPAQUETESERVICE_EXCEPTION;
        }
        return PUBLICADORCONTROLADORPAQUETESERVICE_WSDL_LOCATION;
    }

}
