package com.github.aesteve.scalaquarium

import com.github.aesteve.scalaquarium.Sex.Sex

import scala.util.Random

abstract class Fish extends Living {

	val name: String
	val aquarium: Aquarium
	var sex: Sex = Random.shuffle(Sex.values.toList).head

	def hunt(): Living
	def eat(other: Living): Unit
	def reproduce(other: Fish): Option[Fish]
	def breed(partner: Fish): Fish

	override def grow(): Unit = {
		super.grow()
		health -= 2
	}

	def isHungry: Boolean = health <= 5

	def ++(): Unit = {
		grow()
		val pray = hunt()
		pray match { case isPartner => eat(pray) }
		reproduce(lover) match {
			case Some(fish) => aquarium + fish
			case None => ;
		}
	}

	def lover: Fish = aquarium.livingFishes.filter(isPartner).head

	def isPartner(other: Living): Boolean = other != this && sameSpecies(this, other)

	def eatable(other: Living) = other != this && !sameSpecies(this, other)

}
