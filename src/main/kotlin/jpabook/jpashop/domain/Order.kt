package jpabook.jpashop.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Order {
    fun addOrderItem(orderItem: OrderItem) {
        orderItems.add(orderItem);
        orderItem.order = this;
    }

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    var id:Long = 0;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    lateinit var member: Member;

    lateinit var orderDate: LocalDateTime;

    @Enumerated(EnumType.STRING)
    lateinit var status: OrderStatus;

    @OneToMany(mappedBy = "order")
    lateinit var orderItems: MutableList<OrderItem>;
}