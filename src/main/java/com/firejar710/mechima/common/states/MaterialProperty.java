package com.firejar710.mechima.common.states;

import net.minecraft.block.material.Material;
import net.minecraft.util.IStringSerializable;

public enum MaterialProperty implements IStringSerializable {
    WOOD("wood", Material.WOOD);

    private String valueName;
    private Material material;

    MaterialProperty(String valueName, Material material) {
        this.valueName = valueName;
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public String getName() {
        return valueName;
    }
}
