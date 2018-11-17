package com.firejar710.mechima.proxy;

import com.firejar710.mechima.common.block.BlockMechima;
import com.firejar710.mechima.common.item.ItemBlockMechima;
import com.firejar710.mechima.common.item.ItemMechima;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class CommonProxy {

    public void registerBlock(IForgeRegistry<Block> registry, Block block) {
        registry.register(block);
    }

    public void registerItem(IForgeRegistry<Item> registry, Item item) {
        registry.register(item);
    }

    public void registerItemRenders(ItemMechima item, int meta) {
    }

    public void registerItemRenders(ItemBlockMechima item, int meta) {
    }
}
