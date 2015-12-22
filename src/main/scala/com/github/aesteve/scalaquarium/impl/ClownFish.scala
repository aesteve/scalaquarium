package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.{Fish, Aquarium}
import com.github.aesteve.scalaquarium.diet.Carnivorous

case class ClownFish(
	name: String,
	aquarium: Aquarium
) extends Fish with Carnivorous {}
