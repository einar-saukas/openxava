

// File generated by OpenXava: Fri Mar 22 11:39:01 CET 2019
// Archivo generado por OpenXava: Fri Mar 22 11:39:01 CET 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Delivery		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IDelivery  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_date = "date"; 
	java.util.Date getDate() throws RemoteException;
	void setDate(java.util.Date date) throws RemoteException; 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException; 	
	public static final String PROPERTY_distance = "distance"; 
	int getDistance() throws RemoteException;
	void setDistance(int distance) throws RemoteException; 	
	public static final String PROPERTY_dateAsLabel = "dateAsLabel"; 	
	java.util.Date getDateAsLabel() throws RemoteException; 	
	public static final String PROPERTY_incidents = "incidents"; 
	java.lang.String getIncidents() throws RemoteException;
	void setIncidents(java.lang.String incidents) throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_transportMode = "transportMode"; 	
	String getTransportMode() throws RemoteException; 	
	public static final String PROPERTY_employee = "employee"; 
	String getEmployee() throws RemoteException;
	void setEmployee(String employee) throws RemoteException; 	
	public static final String PROPERTY_driverType = "driverType"; 
	String getDriverType() throws RemoteException;
	void setDriverType(String driverType) throws RemoteException; 	
	public static final String PROPERTY_remarks = "remarks"; 
	java.lang.String getRemarks() throws RemoteException;
	void setRemarks(java.lang.String remarks) throws RemoteException; 	
	public static final String PROPERTY_vehicle = "vehicle"; 
	String getVehicle() throws RemoteException;
	void setVehicle(String vehicle) throws RemoteException;	

	java.util.Collection getDetails() throws RemoteException;		

	// References/Referencias 

	// Carrier : Reference/Referencia
	
	org.openxava.test.model.ICarrier getCarrier() throws RemoteException;
	void setCarrier(org.openxava.test.model.ICarrier newCarrier) throws RemoteException; 

	// Shipment : Reference/Referencia
	
	org.openxava.test.model.IShipment getShipment() throws RemoteException;
	void setShipment(org.openxava.test.model.IShipment newShipment) throws RemoteException; 

	// Invoice : Reference/Referencia
	
	org.openxava.test.model.IInvoice getInvoice() throws RemoteException;
	void setInvoice(org.openxava.test.model.IInvoice newInvoice) throws RemoteException; 

	// Type : Reference/Referencia
	
	org.openxava.test.model.IDeliveryType getType() throws RemoteException;
	void setType(org.openxava.test.model.IDeliveryType newType) throws RemoteException;

	// Methods 


}