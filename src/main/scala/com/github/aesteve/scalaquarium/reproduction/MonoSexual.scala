package com.github.aesteve.scalaquarium.reproduction

import com.github.aesteve.scalaquarium.Fish

trait MonoSexual { self: Fish =>

	@Override
	def reproduce(partner: Fish): Option[Fish] = {
		if (!goodReproducingConditions(self, partner)) return None
		if (self.sex == partner.sex) return None
		Some(self.breed(partner))
	}

}
