
package soa.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import soa.webservice.Person;

@XmlRootElement(name = "addPerson", namespace = "http://soa.webservice")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPerson", namespace = "http://soa.webservice")
public class AddPerson {

    @XmlElement(name = "arg0", namespace = "")
    private Person arg0;

    /**
     * 
     * @return
     *     returns Person
     */
    public Person getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Person arg0) {
        this.arg0 = arg0;
    }

}
