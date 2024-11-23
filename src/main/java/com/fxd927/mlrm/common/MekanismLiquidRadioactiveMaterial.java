package com.fxd927.mlrm.common;

import com.fxd927.mlrm.common.registries.MLRMCreativeTab;
import com.fxd927.mlrm.common.registries.MLRMFluids;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MekanismLiquidRadioactiveMaterial.MODID)
public class MekanismLiquidRadioactiveMaterial
{
    public static final String MODID = "mlrm";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MekanismLiquidRadioactiveMaterial()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MLRMCreativeTab.CREATIVE_TABS.register(modEventBus);
        MLRMFluids.FLUIDS.register(modEventBus);
    }

    public static ResourceLocation rl(String path){
        return new ResourceLocation(MekanismLiquidRadioactiveMaterial.MODID,path);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
