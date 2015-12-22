package com.github.aesteve.scalaquarium

import com.github.aesteve.scalaquarium.impl.Plant
import org.scalatest._

class AquariumSpec extends FlatSpec with Matchers {

	"An aquarium" should "be empty by default" in {
		val aquarium = new Aquarium
		aquarium.empty should be (true)
	}

	"When I add plants, aquarium size " should "grow" in {
		val aquarium = new Aquarium
		aquarium + new Plant
		aquarium.empty should be (false)
	}
}
