package com.github.aesteve.scalaquarium

import com.github.aesteve.scalaquarium.impl.Plant

import scala.util.Random

class Aquarium {

	var fishes = List[Fish]()
	var plants = List[Plant]()

	val alive = { living: Living => !living.dead }

	def randomMember[A](list: List[A]): A = Random.shuffle(list).head

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
		fishes = fishes.filterNot(f => f == fish)
	}

	def -(plant: Plant): Unit = {
		plants = plants.filterNot(p => p == plant)
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
		livingPlants.size + livingFishes.size == 0
	}

	def someFish(): Fish = randomMember(livingFishes)

	def somePlant(): Plant = randomMember(livingPlants)

	def cleanUp(): Unit = {
		plants = livingPlants
		fishes = livingFishes
	}
}
