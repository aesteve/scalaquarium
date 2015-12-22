package com.github.aesteve.scalaquarium.scalaquarium

abstract class Fish extends Living {

	val name: String
	val aquarium: Aquarium

	def hunt(): Living
	def eat(other: Living): Unit

	override def grow(): Unit = {
		super.grow()
		health -= 2
	}

	def breed(partner: Fish): Fish = {
		return null // TODO : reproduction traits
	}

	def ++(): Unit = {
		grow()
		val other = hunt()
		if (eatable(other)) {
			eat(other)
		}
		val partner = aquarium.randomFish()
		val child = breed(partner)
		if (child != null) {
			aquarium + child
		}
	}

	def eatable(other: Living): Boolean = {
		other != this && other.getClass() != getClass()
	}
}
