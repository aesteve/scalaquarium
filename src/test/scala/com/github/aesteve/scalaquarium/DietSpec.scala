package com.github.aesteve.scalaquarium

import com.github.aesteve.scalaquarium.scalaquarium.Aquarium
import com.github.aesteve.scalaquarium.scalaquarium.impl.{Carp, Plant}
import org.scalatest._

class DietSpec extends FlatSpec with Matchers {

	"A carp " should "eat a plant" in {
		val aquarium = new Aquarium
		val magicarp = new Carp("magicarp", aquarium)
		val plant = new Plant
		magicarp.health should be(10)
		plant.health should be(10)

		magicarp.eat(plant)
		plant.health should be(8)
		magicarp.health should be(13)
	}

}
