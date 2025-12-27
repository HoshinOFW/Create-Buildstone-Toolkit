package com.github.hoshinofw.createbuildstonetoolkit.mixin;

import com.github.hoshinofw.buildstonetoolkit.content.common.blocks.unstable.RedstoneProxyBlock;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(RedstoneProxyBlock.class)
public class RedstoneProxyBlockMixin implements IWrenchable {
}
