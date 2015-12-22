package com.github.aesteve.scalaquarium.scalaquarium.impl

import com.github.aesteve.scalaquarium.scalaquarium.diet.Carnivorous
import com.github.aesteve.scalaquarium.scalaquarium.{Fish, Aquarium}

case class ClownFish(
	name: String,
	aquarium: Aquarium
) extends Fish with Carnivorous {}
