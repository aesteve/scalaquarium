package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.diet.Herbivorous
import com.github.aesteve.scalaquarium.reproduction.{AgeHermaphrodit, MonoSexual}
import com.github.aesteve.scalaquarium.{Aquarium, Fish}

case class Bass(
	name: String,
	aquarium: Aquarium
) extends Fish with Herbivorous with AgeHermaphrodit {

	def breed(partner: Fish): Fish = {
		Bass(s"Child of $name and ${partner.name}", aquarium)
	}



}
