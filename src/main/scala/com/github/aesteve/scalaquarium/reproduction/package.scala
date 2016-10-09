package com.github.aesteve.scalaquarium

package object reproduction {

	def goodReproducingConditions(father: Fish, mother: Fish): Boolean = {
		father != mother &&
		!father.isHungry &&
		!mother.isHungry &&
		sameSpecies(father, mother)
	}

}
