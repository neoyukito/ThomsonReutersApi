
package ru.naumen.thomsonreuters.client.auth;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InternalServerException", targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com")
public class InternalServerException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InternalServerException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InternalServerException_Exception(String message, InternalServerException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InternalServerException_Exception(String message, InternalServerException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ru.naumen.thomsonreuters.client.auth.InternalServerException
     */
    public InternalServerException getFaultInfo() {
        return faultInfo;
    }

}
