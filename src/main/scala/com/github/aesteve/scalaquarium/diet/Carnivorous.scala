package com.github.aesteve.scalaquarium.diet

import com.github.aesteve.scalaquarium.{Fish, Living}

trait Carnivorous { self: Fish =>

	def hunt(): Living = {
		self.aquarium.randomPlant()
	}

	def eat(other: Living): Unit = {
		other.health -= 4
		self.health += 5
	}

}
