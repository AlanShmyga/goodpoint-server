package travel.goodpoint.PointGuide.models;

public enum Category {
    SIGHT, RESTAURANT, HOTEL;
    
    @Override
    public String toString() {
        return switch (this) {
            case SIGHT -> "Sight";
            case RESTAURANT -> "Restaurant";
            case HOTEL -> "Hotel";
        };
    }
}
