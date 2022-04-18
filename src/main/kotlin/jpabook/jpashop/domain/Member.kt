package jpabook.jpashop.domain

import javax.persistence.*

@Entity
class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    var id: Long? = null
    lateinit var name: String;
    lateinit var city: String;
    lateinit var street: String;
    lateinit var zipCode: String;

    @OneToMany(mappedBy = "order")
    lateinit var orders : MutableList<Order>;

}