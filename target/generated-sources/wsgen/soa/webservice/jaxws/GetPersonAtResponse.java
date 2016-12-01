
package soa.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import soa.webservice.Person;

@XmlRootElement(name = "getPersonAtResponse", namespace = "http://soa.webservice")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonAtResponse", namespace = "http://soa.webservice")
public class GetPersonAtResponse {

    @XmlElement(name = "return", namespace = "")
    private Person _return;

    /**
     * 
     * @return
     *     returns Person
     */
    public Person getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Person _return) {
        this._return = _return;
    }

}
