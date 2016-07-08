
package ru.naumen.thomsonreuters.client.search;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WokSearchService", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", wsdlLocation = "http://search.webofknowledge.com/esti/wokmws/ws/WokSearch?wsdl")
public class WokSearchService
    extends Service
{

    private final static URL WOKSEARCHSERVICE_WSDL_LOCATION;
    private final static WebServiceException WOKSEARCHSERVICE_EXCEPTION;
    private final static QName WOKSEARCHSERVICE_QNAME = new QName("http://woksearch.v3.wokmws.thomsonreuters.com", "WokSearchService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://search.webofknowledge.com/esti/wokmws/ws/WokSearch?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WOKSEARCHSERVICE_WSDL_LOCATION = url;
        WOKSEARCHSERVICE_EXCEPTION = e;
    }

    public WokSearchService() {
        super(__getWsdlLocation(), WOKSEARCHSERVICE_QNAME);
    }

    public WokSearchService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WOKSEARCHSERVICE_QNAME, features);
    }

    public WokSearchService(URL wsdlLocation) {
        super(wsdlLocation, WOKSEARCHSERVICE_QNAME);
    }

    public WokSearchService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WOKSEARCHSERVICE_QNAME, features);
    }

    public WokSearchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WokSearchService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WokSearch
     */
    @WebEndpoint(name = "WokSearchPort")
    public WokSearch getWokSearchPort() {
        return super.getPort(new QName("http://woksearch.v3.wokmws.thomsonreuters.com", "WokSearchPort"), WokSearch.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WokSearch
     */
    @WebEndpoint(name = "WokSearchPort")
    public WokSearch getWokSearchPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://woksearch.v3.wokmws.thomsonreuters.com", "WokSearchPort"), WokSearch.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WOKSEARCHSERVICE_EXCEPTION!= null) {
            throw WOKSEARCHSERVICE_EXCEPTION;
        }
        return WOKSEARCHSERVICE_WSDL_LOCATION;
    }

}
