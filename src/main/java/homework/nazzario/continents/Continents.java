package homework.nazzario.continents;


import static homework.nazzario.continents.HorizontalDirections.East;
import static homework.nazzario.continents.HorizontalDirections.West;
import static homework.nazzario.continents.VerticalDirections.North;
import static homework.nazzario.continents.VerticalDirections.South;

public enum Continents {
    Australia(South, East),
    Evrope(North, East),
    Asia(North, East),
    North_America(North, West),
    South_America(South, West),
    Africa(South, East),
    Antarctika(North, null);
    private VerticalDirections verticalDirections;
    private HorizontalDirections horizontalDirections;

    Continents(VerticalDirections verticalDirections, HorizontalDirections horizontalDirections) {
        this.verticalDirections = verticalDirections;
        this.horizontalDirections = horizontalDirections;
    }
}
