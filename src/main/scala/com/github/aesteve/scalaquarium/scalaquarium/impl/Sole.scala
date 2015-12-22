package com.github.aesteve.scalaquarium.scalaquarium.impl

import com.github.aesteve.scalaquarium.scalaquarium.{Aquarium, Fish}
import com.github.aesteve.scalaquarium.scalaquarium.diet.Herbivorous

case class Sole(
	name: String,
	aquarium: Aquarium
) extends Fish with Herbivorous {}
