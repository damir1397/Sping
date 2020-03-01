package kg.damir.imagesite.repos

import kg.damir.imagesite.domain.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepo: CrudRepository<Message, Long> {
}