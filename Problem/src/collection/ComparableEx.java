package collection;



	// A Java program to demonstrate use of Comparable
	import java.io.*;
	import java.util.*;

	// A class 'Movie' that implements Comparable
	class Movies implements Comparable<Movies>
	{
		private double rating;
		private String name;
		private int year;

		// Used to sort movies by year
		public int compareTo(Movies m)
		{
			return this.year - m.year;
		}

		// Constructor
		public Movies(String nm, double rt, int yr)
		{
			this.name = nm;
			this.rating = rt;
			this.year = yr;
		}

		// Getter methods for accessing private data
		public double getRating() { return rating; }
		public String getName() { return name; }
		public int getYear()	 { return year; }
	}

	// Driver class
	class ComparableEx
	{
		public static void main(String[] args)
		{
			ArrayList<Movie> list = new ArrayList<Movie>();
			list.add(new Movie("Force Awakens", 8.3, 2015));
			list.add(new Movie("Star Wars", 8.7, 1977));
			list.add(new Movie("Empire Strikes Back", 8.8, 1980));
			list.add(new Movie("Return of the Jedi", 8.4, 1983));

			Collections.sort(list);

			System.out.println("Movies after sorting : ");
			for (Movie movie: list)
			{
				System.out.println(movie.getName() + " " +
								movie.getRating() + " " +
								movie.getYear());
			}
		}
	}

