package com.firejar710.mechima;

import com.firejar710.mechima.common.block.BlockMechima;
import com.firejar710.mechima.common.block.BlockTest;
import com.firejar710.mechima.common.item.ItemMechima;
import com.firejar710.mechima.common.item.ItemTest;
import com.firejar710.mechima.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MechimaMod.modID, name = MechimaMod.modName, version = MechimaMod.modVersion)
public class MechimaMod {
    public static final String modID = "mechima";
    public static final String modName = "Mechima";
    public static final String modVersion = "1.0.0";

    @SidedProxy(clientSide = "com.firejar710.mechima.proxy.ClientProxy", serverSide = "com.firejar710.mechima.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class MechimaRegister {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            for (MechimaMod.items item: MechimaMod.items.values()) {
                proxy.registerItem(event.getRegistry(), item.getItem());
            }
            for(MechimaMod.blocks block: MechimaMod.blocks.values()) {
                proxy.registerItem(event.getRegistry(), block.getBlock().toItem());
            }
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            for(MechimaMod.blocks block: MechimaMod.blocks.values()) {
                proxy.registerBlock(event.getRegistry(), block.getBlock());
            }
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            for (MechimaMod.items item: MechimaMod.items.values()) {
                proxy.registerItemRenders(item.getItem(), 0);
            }
            for(MechimaMod.blocks block: MechimaMod.blocks.values()) {
                proxy.registerItemRenders(block.getBlock().toItem(), 0);
            }
        }
    }

    public static enum items {
        test(new ItemTest());

        private ItemMechima item;

        items(ItemMechima item) {
            this.item = item;
        }

        public ItemMechima getItem() {
            return item;
        }
    }

    public static enum blocks {
        test(new BlockTest());

        private BlockMechima block;

        blocks(BlockMechima block) {
            this.block = block;
        }

        public BlockMechima getBlock() {
            return block;
        }
    }
}
