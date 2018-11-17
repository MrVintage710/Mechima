package com.firejar710.mechima.common.item;

import com.firejar710.mechima.common.block.BlockMechima;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockMechima extends ItemBlock {

    private String name;

    public ItemBlockMechima(BlockMechima block) {
        super(block);

        name = block.getName();
        this.setRegistryName(name);
    }

    public String getName() {
        return name;
    }
}
