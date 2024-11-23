package com.fxd927.mlrm.common.registries;

import com.fxd927.mlrm.common.MLRMLang;
import com.fxd927.mlrm.common.MekanismLiquidRadioactiveMaterial;
import mekanism.common.registration.impl.CreativeTabDeferredRegister;
import mekanism.common.registration.impl.CreativeTabRegistryObject;
import mekanism.common.registries.MekanismBlocks;
import mekanism.common.registries.MekanismCreativeTabs;

public class MLRMCreativeTab {
    public static final CreativeTabDeferredRegister CREATIVE_TABS = new CreativeTabDeferredRegister(MekanismLiquidRadioactiveMaterial.MODID);

    public static final CreativeTabRegistryObject MEKANISM_SCIENCE = CREATIVE_TABS.registerMain(MLRMLang.MLRM, MekanismBlocks.RADIOACTIVE_WASTE_BARREL, builder ->
            builder.withSearchBar()
                    .withTabsBefore(MekanismCreativeTabs.MEKANISM.key())
                    .displayItems((displayParameters, output) -> {
                        CreativeTabDeferredRegister.addToDisplay(MLRMFluids.FLUIDS, output);
                    })
    );
}
