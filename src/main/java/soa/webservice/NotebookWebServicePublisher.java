package soa.webservice;

import javax.xml.ws.Endpoint;

public class NotebookWebServicePublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9991/ws/NotebookService", new NotebookServiceImpl());
	}

}
