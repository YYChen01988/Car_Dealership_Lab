public enum Type {

    CAR("Engine"),
    ELECTRIC("Battery"),
    HYBRID("Engine and Battery"),
    TANK("Engine");


    private final String value;

    Type(String engineType){
        this.value = engineType;
    }

    public String getEngineType(){
        return value;
    }
}