package demo.domain

import spock.lang.Specification

class OrderSpec extends Specification {

    def "set quantity of an item"() {
        given:
        def order = new Order()

        when: "add only one item"
        order.setQuantity(5)

        then: "expect value of the item"
        order.getQuantity() == 5
    }

    def "set item name of an item"() {
        given:
        def order = new Order()

        when: "add only one item"
        order.setItemName("apple")

        then: "expect value of the item"
        order.getItemName() == "apple"
    }
    def "set price of an item"() {
        given:
        def order = new Order()

        when: "add only one item"
        order.setPrice(55)

        then: "expect value of the item"
        order.getPrice() == 55
    }


}
