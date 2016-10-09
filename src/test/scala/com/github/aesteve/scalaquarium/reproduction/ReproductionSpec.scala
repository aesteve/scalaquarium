package com.github.aesteve.scalaquarium.reproduction

import com.github.aesteve.scalaquarium._
import com.github.aesteve.scalaquarium.impl.{Tuna, Carp}
import org.scalatest.{FlatSpec, Matchers}

class ReproductionSpec extends FlatSpec with Matchers {

	val aquarium = new Aquarium

	"Same fishes species " should " be recognized" in {
		val magicarp = Carp("magicarp", aquarium)
		val mrTuna = Tuna("Mr. Tuna", aquarium)

		sameSpecies(magicarp, magicarp) should be(true)
		sameSpecies(magicarp, mrTuna) should be(false)
	}

	"Fishes " should " not be asexual" in {
		val magicarp = Carp("magicarp", aquarium)
		goodReproducingConditions(magicarp, magicarp) should be(false)
	}

	"Fishes from the same species " should " be viable if they're not hungry" in {
		val magicarp = Carp("magicarp", aquarium)
		val leviathor = Carp("leviathor", aquarium)

		goodReproducingConditions(magicarp, leviathor) should be(true)
		1 to 3 /* viva l'algérie */ foreach { _ =>
			magicarp.grow()
		}
		magicarp.health should be(4)
		magicarp.isHungry should be(true)
		goodReproducingConditions(magicarp, leviathor) should be(false)
		goodReproducingConditions(leviathor, magicarp) should be(false)
	}

	"Fishes from different species " should " not be viable partners" in {
		val magicarp = Carp("magicarp", aquarium)
		val mrTuna = Tuna("leviathor", aquarium)

		goodReproducingConditions(magicarp, mrTuna) should be(false)
	}

	"MonoSexual " should "only reproduce with the opposite sex" in {
		val mrTuna = Tuna("Mr Tuna", aquarium)
		mrTuna.sex = Sex.MALE
		val mrsTuna = Tuna("Mrs Tuna", aquarium)
		mrsTuna.sex = Sex.FEMALE

		val maybeChild = mrTuna.reproduce(mrsTuna)
		maybeChild shouldNot be(empty)
		maybeChild.orNull.name shouldBe "Child of Mr Tuna and Mrs Tuna"

	}

}
