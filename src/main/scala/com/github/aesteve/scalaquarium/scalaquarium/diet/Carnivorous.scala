package com.github.aesteve.scalaquarium.scalaquarium.diet

import com.github.aesteve.scalaquarium.scalaquarium.{Fish, Living}

trait Carnivorous { self: Fish =>

	def hunt(): Living = {
		self.aquarium.randomPlant()
	}

	def eat(other: Living): Unit = {
		other.health -= 4
		self.health += 5
	}

}
