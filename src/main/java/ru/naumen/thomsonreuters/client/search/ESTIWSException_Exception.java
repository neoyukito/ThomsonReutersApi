
package ru.naumen.thomsonreuters.client.search;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ESTIWSException", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com")
public class ESTIWSException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ESTIWSException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ESTIWSException_Exception(String message, ESTIWSException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ESTIWSException_Exception(String message, ESTIWSException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ru.naumen.thomsonreuters.client.search.ESTIWSException
     */
    public ESTIWSException getFaultInfo() {
        return faultInfo;
    }

}
