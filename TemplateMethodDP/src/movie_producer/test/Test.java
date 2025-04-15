package movie_producer.test;

import movie_producer.BollywoodMovie;
import movie_producer.HollywoodMovie;
import movie_producer.Movie;

public class Test {
    public static void main(String[] args) {
        // Create an instance of BollywoodMovie and call produceMovie() on it
        Movie bollywoodMovie = new BollywoodMovie();
        bollywoodMovie.produceMovie();
        System.out.println("---------------------------------");

        // You can also create a HollywoodMovie instance and call produceMovie() on it
         Movie hollywoodMovie = new HollywoodMovie();
        hollywoodMovie.produceMovie();
    }
}
