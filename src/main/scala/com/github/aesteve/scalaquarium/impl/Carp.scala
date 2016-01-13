package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.diet.Herbivorous
import com.github.aesteve.scalaquarium.reproduction.MonoSexual
import com.github.aesteve.scalaquarium.{Aquarium, Fish}

case class Carp(
	name: String,
	aquarium: Aquarium
) extends Fish with Herbivorous with MonoSexual {

	def breed(partner: Fish): Fish = {
		Carp(s"Child of $name and ${partner.name}", aquarium)
	}

}
