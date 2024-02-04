package Day7.Challenge3;

class Triangle extends Shape {
    public Triangle(){
        super("triangle");
    }

    @Override
    public void drawshap() {
        System.out.println("dessin d'un triangle");
    }
}
