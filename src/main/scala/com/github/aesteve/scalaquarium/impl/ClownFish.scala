package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.diet.Carnivorous
import com.github.aesteve.scalaquarium.reproduction.Opportunist
import com.github.aesteve.scalaquarium.{Aquarium, Fish}

case class ClownFish(
	name: String,
	aquarium: Aquarium
) extends Fish with Carnivorous with Opportunist {

	def breed(partner: Fish): Fish = {
		ClownFish(s"Child of $name and ${partner.name}", aquarium)
	}


}
