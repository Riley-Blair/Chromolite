package com.leytonblackler.chromolite.main.effecthandler.effects;

import com.leytonblackler.chromolite.controllers.LEDStripSimulationController;
import com.leytonblackler.chromolite.main.effecthandler.Effect;
import com.leytonblackler.chromolite.main.settings.SettingsManager;
import com.leytonblackler.chromolite.main.utilities.arduino.ArduinoController;
import com.leytonblackler.chromolite.main.utilities.razerchroma.RazerChromaService;

public class OffEffect extends Effect {

    @Override
    public void tick(SettingsManager settings, ArduinoController arduinoController, RazerChromaService razerChromaService, LEDStripSimulationController ledStripSimulation) {
        razerChromaService.setAll(0, 0, 0);
        ledStripSimulation.setAll(0, 0, 0);
    }
}
