package movie_producer;

public abstract class Movie {
    public abstract boolean makeMovie();

    public abstract boolean castActors();

    public abstract boolean shootMovie();

    public abstract void releaseMovie();

    public final boolean produceMovie() {
        if (makeMovie()) {
            if (castActors()) {
                if (shootMovie()) {
                    releaseMovie();
                }
            }
        }

        return true;
    }
}
