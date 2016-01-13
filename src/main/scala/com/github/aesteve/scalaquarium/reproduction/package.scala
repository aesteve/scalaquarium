package com.github.aesteve.scalaquarium

package object reproduction {

	def viablePartners(father: Fish, mother: Fish): Boolean = father match {
		case `mother` => false
		case _ => !father.isHungry() && !mother.isHungry() && sameSpecies(father, mother)
	}

}
