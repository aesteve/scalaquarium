package com.github.aesteve.scalaquarium.scalaquarium.impl

import com.github.aesteve.scalaquarium.scalaquarium.{Aquarium, Fish}
import com.github.aesteve.scalaquarium.scalaquarium.diet.Carnivorous

case class Tuna(
	name: String,
	aquarium: Aquarium
) extends Fish with Carnivorous {}
