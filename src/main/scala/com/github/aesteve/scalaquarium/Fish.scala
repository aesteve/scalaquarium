package com.github.aesteve.scalaquarium

import com.github.aesteve.scalaquarium.Sex.Sex

import scala.util.Random

abstract class Fish extends Living {

	val name: String
	val aquarium: Aquarium
	var sex: Sex = Random.shuffle(Sex.values.toList).head

	def hunt(): Living
	def eat(other: Living): Unit
	def reproduce(other: Fish): Fish
	def breed(partner: Fish): Fish

	override def grow(): Unit = {
		super.grow()
		health -= 2
	}

	def isHungry(): Boolean = health <= 5

	def ++(): Unit = {
		grow()
		val pray = hunt()
		if (eatable(pray)) eat(pray)
		val partner = aquarium.someFish()
		val child = reproduce(partner)
		if (child != null) aquarium + child
	}

	def isPartner(other: Living): Boolean = sameSpecies(this, other)

	def eatable(other: Living): Boolean = {
		other != this && !this.isPartner(other)
	}
}
