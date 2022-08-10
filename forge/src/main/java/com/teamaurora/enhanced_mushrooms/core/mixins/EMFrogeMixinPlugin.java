package com.teamaurora.enhanced_mushrooms.core.mixins;

import gg.moonflower.pollen.api.platform.Platform;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class EMFrogeMixinPlugin implements IMixinConfigPlugin {
    public boolean isBOPLoadedd;
    public List<String> BOP_GLOWSHROOM_MIXINS = List.of(
            "com.teamaurora.enhanced_mushrooms.core.mixin.GiantGlowshroomFeatureMixin",
            "com.teamaurora.enhanced_mushrooms.core.mixin.HugeGlowshroomFeatureMixin",
            "com.teamaurora.enhanced_mushrooms.core.mixin.MediumGlowshroomFeatureMixin",
            "com.teamaurora.enhanced_mushrooms.core.mixin.SmallGlowshroomFeatureMixin");

    @Override
    public void onLoad(String s) {
        isBOPLoadedd = Platform.isModLoaded("biomesoplenty");
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClass, String mixinClassName) {
        return !this.isBOPLoadedd || !BOP_GLOWSHROOM_MIXINS.contains(mixinClassName);
    }

    @Override
    public void acceptTargets(Set<String> set, Set<String> set1) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }

    @Override
    public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }
}
