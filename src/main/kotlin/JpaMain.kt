import domain.MemberSample
import domain.Team
import jpabook.jpashop.domain.Order
import jpabook.jpashop.domain.OrderItem
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.EntityTransaction
import javax.persistence.OrderBy
import javax.persistence.Persistence

fun main(){
    val emf : EntityManagerFactory = Persistence.createEntityManagerFactory("hello");
    val em: EntityManager = emf.createEntityManager();

    val tx: EntityTransaction = em.transaction;
    tx.begin()
    try {
        var order : Order = Order();
        em.persist(order);

        order.addOrderItem(OrderItem());
        tx.commit();
    } catch (e: Exception){
        tx.rollback();
    } finally {
        em.close();
    }

    emf.close();
}