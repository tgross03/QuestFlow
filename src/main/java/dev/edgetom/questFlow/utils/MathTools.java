package dev.edgetom.questFlow.utils;


import org.bukkit.Location;

public class MathTools {

    public static double getHorizontalDistance(Location locationA, Location locationB) {
        locationA = locationA.clone();
        locationB = locationB.clone();

        locationA.setY(0);
        locationB.setY(0);

        return locationA.distance(locationB);
    }

}
