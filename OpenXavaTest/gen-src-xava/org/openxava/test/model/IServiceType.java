

// File generated by OpenXava: Thu Jun 13 13:15:39 CEST 2019
// Archivo generado por OpenXava: Thu Jun 13 13:15:39 CEST 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: ServiceType		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IServiceType  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException; 	
	public static final String PROPERTY_subfamily = "subfamily"; 
	int getSubfamily() throws RemoteException;
	void setSubfamily(int subfamily) throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException; 	
	public static final String PROPERTY_family = "family"; 
	int getFamily() throws RemoteException;
	void setFamily(int family) throws RemoteException;		

	// References/Referencias

	// Methods 


}