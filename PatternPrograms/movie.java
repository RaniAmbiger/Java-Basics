class movie 
{
	String movieName;
	String hero;
	String heroine;
	public void displayMovieInfo()
	{
		System.out.println("Movie Name="+this.movieName+" Hero="+this.hero+" Hroine="+this.heroine);
	}
	public movie(String movieName,String hero,String heroine)
	{
		this.movieName=movieName;
		this.hero=hero;
		this.heroine=heroine;
	}

	public static void main(String[] args) 
	{
		movie m1=new movie("Paramatma","Puneeth","Deepa");
		movie m2=new movie("Rikki","Rakshith","Haripriya");
		movie m3=new movie("Drama","Yash","Radhika");
		m1.displayMovieInfo();
		m2.displayMovieInfo();
		m3.displayMovieInfo();
		
	}
}
