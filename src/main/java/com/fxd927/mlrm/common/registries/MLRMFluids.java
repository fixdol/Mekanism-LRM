package com.fxd927.mlrm.common.registries;

import com.fxd927.mlrm.common.MekanismLiquidRadioactiveMaterial;
import com.fxd927.mlrm.common.gas.MLRMChemicalConstants;
import mekanism.common.registration.impl.FluidDeferredRegister;
import mekanism.common.registration.impl.FluidRegistryObject;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class MLRMFluids {
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(MekanismLiquidRadioactiveMaterial.MODID);

    public static final FluidRegistryObject<ForgeFlowingFluid.Source,ForgeFlowingFluid.Flowing,LiquidBlock,BucketItem> ANTIMATTER = FLUIDS.registerLiquidChemical(MLRMChemicalConstants.ANTIMATTER);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source,ForgeFlowingFluid.Flowing,LiquidBlock,BucketItem> FISSILE_FUEL = FLUIDS.registerLiquidChemical(MLRMChemicalConstants.FISSILE_FUEL);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source,ForgeFlowingFluid.Flowing,LiquidBlock,BucketItem> NUCLEAR_WASTE = FLUIDS.registerLiquidChemical(MLRMChemicalConstants.NUCLEAR_WASTE);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source,ForgeFlowingFluid.Flowing,LiquidBlock,BucketItem> PLUTONIUM = FLUIDS.registerLiquidChemical(MLRMChemicalConstants.PLUTONIUM);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source,ForgeFlowingFluid.Flowing,LiquidBlock,BucketItem> POLONIUM = FLUIDS.registerLiquidChemical(MLRMChemicalConstants.POLONIUM);
    public static final FluidRegistryObject<ForgeFlowingFluid.Source,ForgeFlowingFluid.Flowing,LiquidBlock,BucketItem> SPENT_NUCLEAR_WASTE = FLUIDS.registerLiquidChemical(MLRMChemicalConstants.SPENT_NUCLEAR_WASTE);

    private MLRMFluids(){
    }
}
