package com.teamaurora.enhanced_mushrooms.core.other;

import com.teamaurora.enhanced_mushrooms.core.registry.EMBlocks;
import gg.moonflower.pollen.api.registry.StrippingRegistry;
import gg.moonflower.pollen.api.registry.content.FlammabilityRegistry;

/**
 * @author ebo2022
 */
public class EMData {
    public static void registerFlammables() {
            // Red Mushrooms
            FlammabilityRegistry.register(EMBlocks.RED_MUSHROOM_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.RED_MUSHROOM_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_RED_MUSHROOM_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_RED_MUSHROOM_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.RED_MUSHROOM_PLANKS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.RED_MUSHROOM_SLAB.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.RED_MUSHROOM_STAIRS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.RED_MUSHROOM_FENCE.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.RED_MUSHROOM_FENCE_GATE.get(), 5, 20);

            // Brown Mushrooms
            FlammabilityRegistry.register(EMBlocks.BROWN_MUSHROOM_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.BROWN_MUSHROOM_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_BROWN_MUSHROOM_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.BROWN_MUSHROOM_PLANKS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BROWN_MUSHROOM_SLAB.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BROWN_MUSHROOM_STAIRS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BROWN_MUSHROOM_FENCE.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BROWN_MUSHROOM_FENCE_GATE.get(), 5, 20);

            //Glowshrooms
            FlammabilityRegistry.register(EMBlocks.BOP_GLOWSHROOM_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.BOP_GLOWSHROOM_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_BOP_GLOWSHROOM_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_BOP_GLOWSHROOM_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.BOP_GLOWSHROOM_PLANKS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BOP_GLOWSHROOM_SLAB.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BOP_GLOWSHROOM_STAIRS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BOP_GLOWSHROOM_FENCE.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.BOP_GLOWSHROOM_FENCE_GATE.get(), 5, 20);

            //Toadstools
            FlammabilityRegistry.register(EMBlocks.TOADSTOOL_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.TOADSTOOL_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_TOADSTOOL_STEM.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.STRIPPED_TOADSTOOL_HYPHAE.get(), 5, 5);
            FlammabilityRegistry.register(EMBlocks.TOADSTOOL_PLANKS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.TOADSTOOL_SLAB.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.TOADSTOOL_STAIRS.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.TOADSTOOL_FENCE.get(), 5, 20);
            FlammabilityRegistry.register(EMBlocks.TOADSTOOL_FENCE_GATE.get(), 5, 20);
    }

    public static void registerStrippables() {
            StrippingRegistry.register(EMBlocks.RED_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_RED_MUSHROOM_STEM.get());
            StrippingRegistry.register(EMBlocks.BROWN_MUSHROOM_STEM.get(), EMBlocks.STRIPPED_BROWN_MUSHROOM_STEM.get());

            StrippingRegistry.register(EMBlocks.RED_MUSHROOM_HYPHAE.get(), EMBlocks.STRIPPED_RED_MUSHROOM_HYPHAE.get());
            StrippingRegistry.register(EMBlocks.BROWN_MUSHROOM_HYPHAE.get(), EMBlocks.STRIPPED_BROWN_MUSHROOM_HYPHAE.get());

            StrippingRegistry.register(EMBlocks.BOP_GLOWSHROOM_STEM.get(), EMBlocks.STRIPPED_BOP_GLOWSHROOM_STEM.get());
            StrippingRegistry.register(EMBlocks.BOP_GLOWSHROOM_HYPHAE.get(), EMBlocks.STRIPPED_BOP_GLOWSHROOM_HYPHAE.get());

            StrippingRegistry.register(EMBlocks.TOADSTOOL_STEM.get(), EMBlocks.STRIPPED_TOADSTOOL_STEM.get());
            StrippingRegistry.register(EMBlocks.TOADSTOOL_HYPHAE.get(), EMBlocks.STRIPPED_TOADSTOOL_HYPHAE.get());
    }
}
