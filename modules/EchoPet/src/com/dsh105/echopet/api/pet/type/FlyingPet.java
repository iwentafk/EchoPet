package com.dsh105.echopet.api.pet.type;

import com.dsh105.echopet.api.pet.Pet;
import com.dsh105.echopet.compat.api.entity.type.pet.IFlyingPet;
import org.bukkit.entity.Player;

/**
 * @author Arnah
 * @since Aug 12, 2018
 */
public class FlyingPet extends Pet implements IFlyingPet{
	
	public FlyingPet(Player owner){
		super(owner);
	}
}
