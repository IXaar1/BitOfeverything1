package com.hipter57.bitofeverything.items;

import com.google.common.collect.Sets;
import com.hipter57.bitofeverything.Reference;
import com.hipter57.bitofeverything.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.util.EnumHelper;

import java.util.List;
import java.util.Set;

public class ItemSoulSteeler extends ItemTool {

    private static final Set<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(new Block[] {});

    public ItemSoulSteeler(String unlocalizedName) {
        super(EnumHelper.addToolMaterial(Reference.MODID + ":soul_steeler", 0, 100, 0, 1, 0), EFFECTIVE_BLOCKS);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
        tooltip.add(TextFormatting.RED + Utils.getLang().localize("soul_steeler.tooltip"));
    }
}
