package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailServiceSpec extends Specification {
    def "send email with order only "() {
        setup : "initialise email service"
        EmailService emailService = EmailService.getInstance()

        and: "to set mock object of order "
        def order = Mock(Order)

        when: "to send email"
        emailService.sendEmail(order)

        then: "throw exception"
        thrown(RuntimeException)
    }

    def "send email with order and email string "() {

        setup: "initialise email service "
        EmailService emailService = EmailService.getInstance()

        and: "to set mock object of order "
        def order = Mock(Order)

        and:"initialise string"
        String str="emailName"

        when: "to send email"
        Boolean result =emailService.sendEmail(order,str)

        then: "throw exception"
        result

    }
}