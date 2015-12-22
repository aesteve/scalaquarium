package com.github.aesteve.scalaquarium

abstract class Living {

	var age: Int = 0
	var health: Int = 10

	def ++()

	def grow(): Unit = {
		age += 1
	}

	def dead: Boolean = {
		health <= 0 || age > 20
	}

}
