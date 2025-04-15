package movie_producer;

public class HollywoodMovie extends Movie {
    @Override
    public boolean makeMovie() {
        System.out.println("Making Hollywood Movie");
        return true;
    }

    @Override
    public boolean castActors() {
        System.out.println("Casting Actors for Hollywood Movie");
        return true;
    }

    @Override
    public boolean shootMovie() {
        System.out.println("Shooting Hollywood Movie");
        return true;
    }

    @Override
    public void releaseMovie() {
        System.out.println("Releasing Hollywood Movie");
    }
}
