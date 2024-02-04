package Day7.Challenge3;

abstract class Shape implements Drawable {
    private String shapetype;
    public Shape(String shapetype){
        this.shapetype = shapetype;
    }
    public void displayShapetype() {
        System.out.println("type de forme :" + shapetype);
    }
}
