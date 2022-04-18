package domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Team {
    @Id
    @Column(name = "item_id")
    var id: Long = 0
    lateinit var name: String;

    @OneToMany(mappedBy = "team")
    lateinit var members : MutableList<MemberSample>;

    /*fun addMember(memberSample: MemberSample){
        memberSample.team = this;
        members.add(memberSample);
    }*/
}