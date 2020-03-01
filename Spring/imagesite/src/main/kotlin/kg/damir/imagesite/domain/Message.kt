package kg.damir.imagesite.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null
    private var firstName: String? = null
    private var lastName: String? = null

    protected constructor() {}
    constructor(firstName: String?, lastName: String?) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName)
    }

    fun getId(): Long? {
        return id
    }

    fun getFirstName(): String? {
        return firstName
    }

    fun getLastName(): String? {
        return lastName
    }
}