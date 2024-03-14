package one.digitalinnovation.avengers.application.web.request

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AvengerRequest(
  @field:NotNull
  @field:NotBlank
  @field:NotEmpty
  val nick: String,
  @field:NotNull
  @field:NotBlank
  @field:NotEmpty
  val person: String,
  val description: String? = "",
  val history: String? = "",
)
