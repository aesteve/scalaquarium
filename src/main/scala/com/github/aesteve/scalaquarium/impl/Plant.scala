package com.github.aesteve.scalaquarium.impl

import com.github.aesteve.scalaquarium.Living

class Plant extends Living {

	override def ++(): Unit = {
		grow()
		health += 1
	}

}
