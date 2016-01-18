package com.github.aesteve.scalaquarium.diet

import com.github.aesteve.scalaquarium.{Fish, Living}

trait Herbivorous { self: Fish =>

	def hunt(): Living = {
		self.aquarium.somePlant()
	}

	def eat(other: Living): Unit = {
		other.health -= 2
		self.health += 3
	}

}
