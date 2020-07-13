package exercise.Stefan;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {

    private final String name;
    private final double orbitalTime;
    private final Set<HeavenlyBody> satellites;
    private final String bodyType;

    public HeavenlyBody(String name, double orbitalTime, String bodyType) {
        this.name = name;
        this.orbitalTime = orbitalTime;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    public final String getBodyType() {
        return bodyType;
    }

    public final String getName() {
        return name;
    }

    public final double getOrbitalTime() {
        return orbitalTime;
    }

    public final Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public final boolean addSatellite (HeavenlyBody moon) {
        if (!(moon.getBodyType().equals("MOON")) && this.bodyType.equals("PLANET")) {
            System.out.println("You can only add moons to the satellites of planet " + this.getName());
            return false;
        }
        else
            satellites.add(moon);
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof HeavenlyBody && this.getClass().equals(obj.getClass())) {
            String objName = ((HeavenlyBody) obj).getName();
            return this.name.equals(objName); //uses the "equals()" from String class
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.getName().hashCode() + 57 + this.bodyType.hashCode();
    }
}
