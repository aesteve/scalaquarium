package com.github.aesteve.scalaquarium.scalaquarium.impl

import com.github.aesteve.scalaquarium.scalaquarium.diet.Herbivorous
import com.github.aesteve.scalaquarium.scalaquarium.{Fish, Aquarium}

case class Bass(
	name: String,
	aquarium: Aquarium
) extends Fish with Herbivorous {}
