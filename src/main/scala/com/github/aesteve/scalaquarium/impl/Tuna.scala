package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.diet.Carnivorous
import com.github.aesteve.scalaquarium.reproduction.MonoSexual
import com.github.aesteve.scalaquarium.{Aquarium, Fish}

case class Tuna(
	name: String,
	aquarium: Aquarium
) extends Fish with Carnivorous with MonoSexual {

	def breed(partner: Fish): Fish = {
		Tuna(s"Child of $name and ${partner.name}", aquarium)
	}

}
