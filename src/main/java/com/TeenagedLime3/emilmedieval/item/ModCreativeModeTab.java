package com.TeenagedLime3.emilmedieval.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab{
    public static final CreativeModeTab TAMM_TAB = new CreativeModeTab("tamm_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.SUTTON_HOO_HELMET.get());
        }
    };
    // for multiple tabs, make sure to change name and label
/*  public static final CreativeModeTab TAMM_TAB = new CreativeModeTab("tamm_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
        }
    }; */
}
