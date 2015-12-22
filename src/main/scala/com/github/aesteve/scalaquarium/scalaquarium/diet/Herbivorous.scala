package com.github.aesteve.scalaquarium.scalaquarium.diet

import com.github.aesteve.scalaquarium.scalaquarium.{Fish, Living}

trait Herbivorous { self: Fish =>

	def hunt(): Living = {
		return self.aquarium.randomPlant()
	}

	def eat(other: Living): Unit = {
		other.health -= 2
		self.health += 3
	}

}
