package jpabook.jpashop.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Item {
    @Id
    @Column(name = "ITEM_ID")
    var Id: Long = 0
    lateinit var name: String;
    var price: Int = 0
    var stockQuantity: Int = 0;

}