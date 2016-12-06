package soa.webservice;

import java.util.List;

import javax.jws.WebService;
@WebService(name = "NotebookService", targetNamespace="http://soa.webservice")
public interface NotebookService {
	boolean addPerson(Person p);
/**
 * liste des personnes ?????????????????
 * @return
 */
	List<Person> getPersons();

	Person getPersonAt(String name);
}
