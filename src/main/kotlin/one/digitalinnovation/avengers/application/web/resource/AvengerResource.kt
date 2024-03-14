package one.digitalinnovation.avengers.application.web.resource

import one.digitalinnovation.avengers.application.web.request.AvengerRequest
import one.digitalinnovation.avengers.application.web.response.AvengerResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping(value = ["/v1/api/avenger"])
class AvengerResource {
  @GetMapping
  fun getAvengers(): ResponseEntity<List<AvengerResponse>> =
    ResponseEntity.ok().body(emptyList<AvengerResponse>())

  @GetMapping(value = ["{id}"])
  fun getAvengerDetails(@PathVariable(value = "id") id: Long) =
    ResponseEntity.ok().build<AvengerResponse>()

  /*@PostMapping
  fun createAvenget(@Valid @RequestBody request: AvengerRequest) =*/
}