package homework.nazzario.Continental;


import static homework.nazzario.Continental.HorizontalDirections.East;
import static homework.nazzario.Continental.HorizontalDirections.West;
import static homework.nazzario.Continental.VerticalDirections.North;
import static homework.nazzario.Continental.VerticalDirections.South;

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
