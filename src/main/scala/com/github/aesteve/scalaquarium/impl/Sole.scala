package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.diet.Herbivorous
import com.github.aesteve.scalaquarium.reproduction.Opportunist
import com.github.aesteve.scalaquarium.{Aquarium, Fish}

case class Sole(
	name: String,
	aquarium: Aquarium
) extends Fish with Herbivorous with Opportunist {

	def breed(partner: Fish): Fish = {
		Sole(s"Child of $name and ${partner.name}", aquarium)
	}


}
