package com.github.aesteve.scalaquarium.reproduction

import com.github.aesteve.scalaquarium.Fish

trait MonoSexual { self: Fish =>

	def reproduce(partner: Fish): Fish = {
		if (!viablePartners(self, partner)) return null
		if (self.sex == partner.sex) return null
		return self.breed(partner)
	}

}
