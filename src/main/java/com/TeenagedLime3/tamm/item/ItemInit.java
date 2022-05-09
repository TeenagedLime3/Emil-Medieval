package com.TeenagedLime3.tamm.item;

import com.TeenagedLime3.tamm.TotallyAccurateMedievalMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.CallbackI;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TotallyAccurateMedievalMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_BLEND = ITEMS.register("steel_blend", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));




    //Weapons
    public static final RegistryObject<Item> BEARDED_STEEL_AXE = ITEMS.register("bearded_steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> DAGGER = ITEMS.register("dagger",
            () -> new SwordItem(ModTiers.STEEL, 1, 6f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> MACE = ITEMS.register("mace",
            () -> new AxeItem(ModTiers.STEEL, 4, 1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> FALCHION = ITEMS.register("falchion",
            () -> new SwordItem(ModTiers.STEEL, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> SEAX = ITEMS.register("seax",
            () -> new SwordItem(ModTiers.STEEL, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> WARPICK = ITEMS.register("warpick",
            () -> new AxeItem(ModTiers.STEEL, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    //Weapons - Steel
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    //Armor - Sutton Hoo
    public static final RegistryObject<Item> SUTTON_HOO_HELMET = ITEMS.register("sutton_hoo_helmet",
            () -> new ArmorItem(ModArmorMaterials.SUTTON_HOO, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    //Armor - Crusader
    public static final RegistryObject<Item> GREATHELM = ITEMS.register("greathelm",
            () -> new ArmorItem(ModArmorMaterials.CRUSADER, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> HOSPITALER_CHESTPLATE = ITEMS.register("hospitaler_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HOSPITALER, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> TEUTONIC_CHESTPLATE = ITEMS.register("teutonic_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TEUTONIC, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> TEMPLAR_CHESTPLATE = ITEMS.register("templar_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TEMPLAR, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> HOSPITALER_LEGGINGS = ITEMS.register("hospitaler_leggings",
            () -> new ArmorItem(ModArmorMaterials.HOSPITALER, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> TEUTONIC_LEGGINGS = ITEMS.register("teutonic_leggings",
            () -> new ArmorItem(ModArmorMaterials.TEUTONIC, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> TEMPLAR_LEGGINGS = ITEMS.register("templar_leggings",
            () -> new ArmorItem(ModArmorMaterials.TEMPLAR, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    //Armor - Gambeson
    public static final RegistryObject<Item> GAMBESON = ITEMS.register("gambeson",
            () -> new ArmorItem(ModArmorMaterials.GAMBESSON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    //Armor - Steel
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    //Armor - Brigandine
    public static final RegistryObject<Item> BRIGANDINE_CHESTPLATE = ITEMS.register("brigandine_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BRIGANDINE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));
    //Armor - Barbuta
    public static final RegistryObject<Item> BARBUTA = ITEMS.register("barbuta",
            () -> new ArmorItem(ModArmorMaterials.BRIGANDINE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAMM_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
