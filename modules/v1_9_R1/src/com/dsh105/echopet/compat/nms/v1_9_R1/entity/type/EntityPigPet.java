/*
 * This file is part of EchoPet.
 *
 * EchoPet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EchoPet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EchoPet.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.dsh105.echopet.compat.nms.v1_9_R1.entity.type;

import com.dsh105.echopet.compat.api.entity.EntityPetType;
import com.dsh105.echopet.compat.api.entity.EntitySize;
import com.dsh105.echopet.compat.api.entity.IPet;
import com.dsh105.echopet.compat.api.entity.PetType;
import com.dsh105.echopet.compat.api.entity.type.nms.IEntityPigPet;
import com.dsh105.echopet.compat.nms.v1_9_R1.entity.EntityAgeablePet;

import net.minecraft.server.v1_9_R1.DataWatcher;
import net.minecraft.server.v1_9_R1.DataWatcherObject;
import net.minecraft.server.v1_9_R1.DataWatcherRegistry;
import net.minecraft.server.v1_9_R1.World;

@EntitySize(width = 0.9F, height = 0.9F)
@EntityPetType(petType = PetType.PIG)
public class EntityPigPet extends EntityAgeablePet implements IEntityPigPet {

	private static final DataWatcherObject<Boolean> SADDLE = DataWatcher.a(EntityPigPet.class, DataWatcherRegistry.h);

    public EntityPigPet(World world) {
        super(world);
    }

    public EntityPigPet(World world, IPet pet) {
        super(world, pet);
    }

    public boolean hasSaddle() {
		return ((Boolean) this.datawatcher.get(SADDLE)).booleanValue();
    }

    @Override
    public void setSaddled(boolean flag) {
		this.datawatcher.set(SADDLE, Boolean.valueOf(flag));
    }

    @Override
    protected void initDatawatcher() {
        super.initDatawatcher();
		this.datawatcher.register(SADDLE, Boolean.valueOf(false));
    }
}
