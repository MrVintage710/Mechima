package com.firejar710.mechima.proxy;

import com.firejar710.mechima.MechimaMod;
import com.firejar710.mechima.common.item.ItemBlockMechima;
import com.firejar710.mechima.common.item.ItemMechima;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenders(ItemMechima item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MechimaMod.modID + ":" + item.getName(), "inventory"));
    }

    @Override
    public void registerItemRenders(ItemBlockMechima item, int meta) {
        MechimaMod.logger.info("Registering Item Renderer for: " + item.getName());
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MechimaMod.modID + ":" + item.getName(), "inventory"));
    }
}
