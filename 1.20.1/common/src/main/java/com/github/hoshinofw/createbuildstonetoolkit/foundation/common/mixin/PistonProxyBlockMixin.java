package com.github.hoshinofw.createbuildstonetoolkit.foundation.common.mixin;


import com.github.hoshinofw.buildstonetoolkit.content.common.blocks.PistonProxyBlock;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PistonProxyBlock.class)
public class PistonProxyBlockMixin implements IWrenchable {
}
