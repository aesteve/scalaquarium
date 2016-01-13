package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.diet.Carnivorous
import com.github.aesteve.scalaquarium.reproduction.AgeHermaphrodit
import com.github.aesteve.scalaquarium.{Aquarium, Fish}

case class Grouper (
	name: String,
	aquarium: Aquarium
) extends Fish with Carnivorous with AgeHermaphrodit {

	def breed(partner: Fish): Fish = {
		Grouper(s"Child of $name and ${partner.name}", aquarium)
	}


}
