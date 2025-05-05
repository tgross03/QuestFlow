package dev.edgetom.questFlow.trigger;

import dev.edgetom.questFlow.QuestFlow;
import dev.edgetom.questFlow.base.Trigger;
import dev.edgetom.questFlow.utils.MathTools;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.entity.Player;

@Getter
public class ProximityTrigger extends Trigger {

    private final Type type = Type.PROXIMITY;

    public enum Shape {
        CIRCULAR, // in this case the activationRange is the radius of a circle
        RECTANGULAR; // in this case the activationRange the sidelength.
    }

    private Shape shape;

    private Location center;
    private float activationRange;
    private float heightRange; // Set to -1f if no height restriction


    @Override
    public void execute(Player player) {

    }

    public boolean inRange(Location location) {

        switch (this.shape) {
            case CIRCULAR -> {
                if (this.heightRange == -1)
                    return MathTools.getHorizontalDistance(location, this.center) <= this.activationRange;
                else
                    return this.center.distance(location) <= this.activationRange;
            }

            case RECTANGULAR -> {

                Location cornerA = this.center.clone().add(this.activationRange / 2, 0, this.activationRange / 2);
                Location cornerB = this.center.clone().subtract(this.activationRange / 2, 0, this.activationRange / 2);

                if (!this.horizontalOnly && location.getY() > center.getY() + activationRange)


            }
        }
    }

    // TODO: make sure that there are not overlapping proximity triggers
    public static ProximityTrigger fromLocation(Location location) {
        return (ProximityTrigger) QuestFlow.plugin.getTriggerManager().getTriggers().stream()
                .filter(trigger -> trigger instanceof ProximityTrigger proximityTrigger &&
                        proximityTrigger.inRange(location))
                .findFirst()
                .orElse(null);
    }

}
