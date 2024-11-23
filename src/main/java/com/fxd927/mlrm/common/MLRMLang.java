package com.fxd927.mlrm.common;

import mekanism.api.text.ILangEntry;
import net.minecraft.Util;

public enum MLRMLang implements ILangEntry {
    MLRM("constants","mod_name");

    private final String key;

    MLRMLang(String type,String path){
        this(Util.makeDescriptionId(type, MekanismLiquidRadioactiveMaterial.rl(path)));
    }

    MLRMLang(String key){
        this.key = key;
    }

    @Override
    public String getTranslationKey(){
        return key;
    }
}
