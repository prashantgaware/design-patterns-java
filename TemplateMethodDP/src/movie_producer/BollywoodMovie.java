package movie_producer;

public class BollywoodMovie extends Movie {
    @Override
    public boolean makeMovie() {
        System.out.println("Making Bollywood Movie");
        return true;
    }

    @Override
    public boolean castActors() {
        System.out.println("Casting Actors for Bollywood Movie");
        return true;
    }

    @Override
    public boolean shootMovie() {
        System.out.println("Shooting Bollywood Movie");
        return true;
    }

    @Override
    public void releaseMovie() {
        System.out.println("Releasing Bollywood Movie");
    }
}
