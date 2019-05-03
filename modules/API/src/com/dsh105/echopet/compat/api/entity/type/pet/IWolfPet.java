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

package com.dsh105.echopet.compat.api.entity.type.pet;

import org.bukkit.DyeColor;

import com.dsh105.echopet.compat.api.entity.ITameablePet;

public interface IWolfPet extends ITameablePet{

    public void setCollarColor(DyeColor dc);

    public DyeColor getCollarColor();

    public void setAngry(boolean flag);

    public boolean isAngry();
}