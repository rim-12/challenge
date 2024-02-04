package Day7.Challenge3;

class Square extends Shape {
    public Square(){
        super("carré");
    }

    @Override
    public void drawshap() {
        System.out.println("dessin d'un carré");
    }
}
