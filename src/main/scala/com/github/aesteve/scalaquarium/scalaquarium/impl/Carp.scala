package com.github.aesteve.scalaquarium.scalaquarium.impl

import com.github.aesteve.scalaquarium.scalaquarium.{Aquarium, Fish}
import com.github.aesteve.scalaquarium.scalaquarium.diet.Herbivorous

case class Carp(
	val name: String,
	val aquarium: Aquarium
) extends Fish with Herbivorous {}
