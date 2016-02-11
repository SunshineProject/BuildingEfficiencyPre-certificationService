package it.sinergis.kml3d;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
		String array[] = { "flavon", "romallo", "don", "sanzeno", "denno", "ronzone", "sfruz", "romeno", "dambel",
				"sarnonico", "revo", "predaia", "cunevo", "tassullo", "fondo", "castelfondo", "ton", "cavareno",
				"amblar", "sporminore", "brez", "nanno", "campodenno", "terres", "malosco" };
		
		//String item = array[0];
		
		for (String item : array) {
			String values[] = { item, "temp/" + item + ".kml", "wfs_energy." + item, "7", "perf_value" };
			KMLGeneration.main(values);
		}
		
	}
	
	//cles temp/cles.kml wfs_energy.cles  1 perf_value
	
}
