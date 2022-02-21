package m9.LivingBackpack;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import m9.LivingBackpack.util.RegistryUtil;

@EventBusSubscriber(modid = LivingBackpack.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(CreativeTabs.MISC)
        };

        event.getRegistry().registerAll(items);
    }

}
