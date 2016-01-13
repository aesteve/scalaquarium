package com.github.aesteve

package object scalaquarium {

	def sameSpecies(living1: Living, living2: Living): Boolean = {
		living1.getClass() == living2.getClass()
	}

}
