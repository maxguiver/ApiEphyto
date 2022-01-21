/**
 * DeliveryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class DeliveryServiceLocator extends org.apache.axis.client.Service implements _int.ippc.ephyto.DeliveryService {

    public DeliveryServiceLocator() {
    }


    public DeliveryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DeliveryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IDeliveryServiceImplPort
    private java.lang.String IDeliveryServiceImplPort_address = "https://uat-hub.ephytoexchange.org/hub/DeliveryService";

    public java.lang.String getIDeliveryServiceImplPortAddress() {
        return IDeliveryServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IDeliveryServiceImplPortWSDDServiceName = "IDeliveryServiceImplPort";

    public java.lang.String getIDeliveryServiceImplPortWSDDServiceName() {
        return IDeliveryServiceImplPortWSDDServiceName;
    }

    public void setIDeliveryServiceImplPortWSDDServiceName(java.lang.String name) {
        IDeliveryServiceImplPortWSDDServiceName = name;
    }

    public _int.ippc.ephyto.IDeliveryService getIDeliveryServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IDeliveryServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIDeliveryServiceImplPort(endpoint);
    }

    public _int.ippc.ephyto.IDeliveryService getIDeliveryServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            _int.ippc.ephyto.DeliveryServiceSoapBindingStub _stub = new _int.ippc.ephyto.DeliveryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIDeliveryServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIDeliveryServiceImplPortEndpointAddress(java.lang.String address) {
        IDeliveryServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (_int.ippc.ephyto.IDeliveryService.class.isAssignableFrom(serviceEndpointInterface)) {
                _int.ippc.ephyto.DeliveryServiceSoapBindingStub _stub = new _int.ippc.ephyto.DeliveryServiceSoapBindingStub(new java.net.URL(IDeliveryServiceImplPort_address), this);
                _stub.setPortName(getIDeliveryServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IDeliveryServiceImplPort".equals(inputPortName)) {
            return getIDeliveryServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ephyto.ippc.int/", "DeliveryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "IDeliveryServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IDeliveryServiceImplPort".equals(portName)) {
            setIDeliveryServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
