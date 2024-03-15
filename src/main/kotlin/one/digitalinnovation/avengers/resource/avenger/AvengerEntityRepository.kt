package one.digitalinnovation.avengers.resource.avenger

import org.springframework.data.jpa.repository.JpaRepository

interface AvengerEntityRepository : JpaRepository<AvengerEntity, Long> {
}