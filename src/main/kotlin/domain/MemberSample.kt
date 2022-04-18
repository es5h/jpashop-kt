package domain

import javax.persistence.*

@Entity
@Table(name = "MEMBER_SAMPLE")
class MemberSample {
    @Id @GeneratedValue
    @Column(name = "member_id")
    var id: Long? = null

    lateinit var userName: String;

    @ManyToOne
    lateinit var team: Team

    fun changeTeam(team: Team){
        this.team = team;
        team.members.add(this);
    }
}