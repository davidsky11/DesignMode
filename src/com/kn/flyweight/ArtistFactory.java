package com.kn.flyweight;

import java.util.Hashtable;

public class ArtistFactory {

	Hashtable<String, Artist> pool = new Hashtable<String, Artist>();
	
	Artist getArtist(String key) {
		Artist result;
		result = (Artist) pool.get(key);
		// 产生新的Artist
		if (result == null) {
			result = new Artist(key);
			pool.put(key, result);
		}
		return result;
	}
}