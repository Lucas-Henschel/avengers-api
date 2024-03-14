package one.digitalinnovation.avengers.domain.avenger

interface AvengerReository {
  fun getDetail(id: Long): Avenger
  fun getAvengers(): List<Avenger>
  fun create(avenger: Avenger): Avenger
  fun delete(id: Long)
  fun update(avenger: Avenger): Avenger
}