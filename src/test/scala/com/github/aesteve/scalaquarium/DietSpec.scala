package com.github.aesteve.scalaquarium

import com.github.aesteve.scalaquarium.impl.{ClownFish, Plant, Tuna, Carp}
import org.scalatest._

class DietSpec extends FlatSpec with Matchers {

	val aquarium = new Aquarium

	"A carp " should "eat a plant" in {
		val magicarp = Carp("magicarp", aquarium)
		val plant = new Plant

		magicarp.health should be(10)
		plant.health should be(10)

		magicarp.eat(plant)
		plant.health should be(8)
		magicarp.health should be(13)
	}

	"A fish " should " not eat himself" in {
		val tuna1 = Tuna("tuna", aquarium)

		tuna1.eatable(tuna1) should be(false)
	}

	"A fish " should " not eat another fish from the same species" in {
		val tuna1 = Tuna("tuna", aquarium)
		val tuna2 = Tuna("tuna2", aquarium)

		tuna1.eatable(tuna2) should be(false)
	}

	"A carnivorous fish " should " eat another fish from a different species" in {
		val tuna1 = Tuna("tuna", aquarium)
		val clown = ClownFish("clown", aquarium)

		tuna1.eatable(clown) should be(true)
		clown.eatable(tuna1) should be(true)
	}

}
