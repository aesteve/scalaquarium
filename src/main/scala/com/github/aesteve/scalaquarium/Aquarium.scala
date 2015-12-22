package com.github.aesteve.scalaquarium

import com.github.aesteve.scalaquarium.impl.Plant

import scala.util.Random

class Aquarium(var fishes: List[Fish] = List[Fish](), var plants: List[Plant] = List[Plant]()) {

	private val rand = new Random()
	val alive = { living: Living => !living.dead }

	def ++(): Unit = {
		for (living <- livings) { living.++() }
		cleanUp()
	}

	def +(plant: Plant): Unit = {
		plants = plant +: plants
	}

	def +(fish: Fish): Unit = {
		fishes = fish +: fishes
	}

	def -(fish: Fish): Unit = {
		fishes = fishes.filterNot(f => f != fish)
	}

	def -(plant: Plant): Unit = {
		plants = plants.filterNot(p => p != plant)
	}

	def livingPlants: List[Plant] = {
		plants.filter(alive)
	}

	def livingFishes: List[Fish] = {
		fishes.filter(alive)
	}

	def livings: List[Living] = {
		List.concat(livingPlants, livingFishes)
	}

	def empty: Boolean = {
		livingPlants.size + livingPlants.size == 0
	}

	def randomFish(): Fish = {
		livingFishes(rand.nextInt(livingFishes.size))
	}

	def randomPlant(): Plant = {
		livingPlants(rand.nextInt(livingPlants.size))
	}

	def cleanUp(): Unit = {
		plants = livingPlants
		fishes = livingFishes
	}
}
