package com.firejar710.mechima.common.block;

import com.firejar710.mechima.common.item.ItemBlockMechima;
import com.firejar710.mechima.common.item.ItemMechima;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.ArrayList;

public abstract class BlockMechima extends Block {

    protected String name;

    protected BlockMechima(String name, Material material) {
        super(material);

        this.name = name;
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

    public ItemBlockMechima toItem() {
        return new ItemBlockMechima(this);
    }

    public String getName() {
        return name;
    }
}
