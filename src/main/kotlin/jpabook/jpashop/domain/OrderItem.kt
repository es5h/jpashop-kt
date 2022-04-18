package jpabook.jpashop.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne


@Entity
class OrderItem {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    var Id : Long = 0;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    lateinit var order: Order;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    lateinit var item: Item;

    var orderPrice : Int = 0;
    var count : Int = 0;
}