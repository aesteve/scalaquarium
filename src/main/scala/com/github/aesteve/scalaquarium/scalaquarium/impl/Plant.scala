package com.github.aesteve.scalaquarium.scalaquarium.impl

import com.github.aesteve.scalaquarium.scalaquarium.{Living, Aquarium}

class Plant extends Living {

	override def ++(): Unit = {
		grow()
		health += 1
	}

}
