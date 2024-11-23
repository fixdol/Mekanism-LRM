package com.fxd927.mlrm.common.gas;

import mekanism.common.base.IChemicalConstant;

public enum MLRMChemicalConstants implements IChemicalConstant {
    POLONIUM("polonium",0xFF1B9E7B,0,1235F,9196F),
    PLUTONIUM("plutonium",0xFF1F919C,0,3505F,1981.6F),
    FISSILE_FUEL("fissile_fuel",0xFF2E332F,0,329.7F,1905F),
    NUCLEAR_WASTE("nuclear_waste",0xFF4F412A,0,1235F,9196F),
    SPENT_NUCLEAR_WASTE("spent_nuclear_waste",0xFF262015,0,3505F,1981.6F),
    ANTIMATTER("antimatter",0xFFA464B3,0,1235F,9196F);

    private final String name;
    private final int color;
    private final int luminosity;
    private final float temperature;
    private final float density;

    MLRMChemicalConstants(String name,int color,int luminosity,float temperature,float density){
        this.name = name;
        this.color = color;
        this.luminosity = luminosity;
        this.temperature = temperature;
        this.density = density;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getColor(){
        return color;
    }

    @Override
    public int getLuminosity() {
        return luminosity;
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getDensity() {
        return density;
    }
}