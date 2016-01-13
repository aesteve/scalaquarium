package com.github.aesteve.scalaquarium.reproduction

import com.github.aesteve.scalaquarium.Fish

trait Opportunist { self: Fish =>

	// TODO
	def reproduce(partner: Fish): Fish = {
		if (!viablePartners(self, partner)) return null
		if (self.sex == partner.sex) return null
		return self.breed(partner)
	}

}
