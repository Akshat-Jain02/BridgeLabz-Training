package com.day02.songvault;

public class Song implements Media {
	private String title;
	private String artist;
	private String duration;
	private String genre;

	public Song(String title, String artist, String duration, String genre) {
		this.title = title.trim();
		this.artist = artist.trim();
		this.duration = duration.trim();
		this.genre = genre.trim();
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getArtist() {
		return artist;
	}

	@Override
	public String getDuration() {
		return duration;
	}

	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return title + " | " + artist + " | " + duration + " | " + genre;
	}
}