package m9.LivingBackpack.util;

import m9.LivingBackpack.LivingBackpack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(LivingBackpack.MODID, name);//.set(LivingBackpack.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(LivingBackpack.MODID, name);//.setTranslationKey(LivingBackpack.MODID + "." + name);
        return block;
    }

}