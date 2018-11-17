package com.firejar710.mechima.common.item;

import net.minecraft.item.Item;

public class ItemMechima extends Item {

    protected String name;

    public ItemMechima(String name) {
        this.name = name;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

    public String getName() {
        return name;
    }
}
