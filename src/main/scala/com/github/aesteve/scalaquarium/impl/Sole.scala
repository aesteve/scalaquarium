package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.diet.Herbivorous
import com.github.aesteve.scalaquarium.{Fish, Aquarium}

case class Sole(
	name: String,
	aquarium: Aquarium
) extends Fish with Herbivorous {}
