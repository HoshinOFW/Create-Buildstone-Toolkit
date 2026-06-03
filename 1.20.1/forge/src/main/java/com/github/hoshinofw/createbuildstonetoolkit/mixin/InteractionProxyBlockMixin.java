package com.github.hoshinofw.createbuildstonetoolkit.mixin;

import com.github.hoshinofw.buildstonetoolkit.content.common.blocks.unstable.InteractionProxyBlock;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(InteractionProxyBlock.class)
public class InteractionProxyBlockMixin implements IWrenchable {
}
