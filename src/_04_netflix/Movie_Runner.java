package _04_netflix;

public class Movie_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetflixQueue list= new NetflixQueue();
		Movie Emoji= new Movie("The emoji movie",1);
		Movie spood = new Movie("across the spiderverse",5);
		Movie star = new Movie("Star Wars IV",4);
		Movie mulan = new Movie("2019 Mulan",3);
		Movie polarexpress = new Movie("The Polar Express",2);
		list.addMovie(spood);
		list.addMovie(Emoji);
		list.addMovie(star);
		list.addMovie(mulan);
		list.addMovie(polarexpress);
		System.out.println("The best movie is "+list.getBestMovie()+"!");
		System.out.println("Followed by "+list.getMovie(0));
		for(int i=1; i<list.movies.size();i++) {
		System.out.println("then "+list.getMovie(i));
		}
	}

}
