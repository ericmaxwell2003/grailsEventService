package credible.software.event.marshallers

import org.grails.web.converters.marshaller.ClosureObjectMarshaller
import credible.software.event.Person

class PersonMarshallerJson extends ClosureObjectMarshaller<Person> {

    public static marshal = { Person person ->
        def json = [:]
        json.fullName = person.fullName
        json.email = person.email
        json.username = person.username
        json
    }

    public PersonMarshallerJson() {
        super(Person, marshal)
    }
}
