package it.sinergis.kml3d;

public class Build_object {
	private int gid;
	private String geom;
	private double epgl;
	private boolean residential;
	private double height;
	
	public Build_object() {
		gid = 0;
		geom = "";
		epgl = -9999;
		residential = true;
	}
	
	public Build_object(int gid, String geom, double epgl, boolean residential, double height) {
		this.gid = gid;
		this.geom = geom;
		this.epgl = epgl;
		this.residential = residential;
		this.height = height;
	}
	
	public String getStyleClass() {
		if (!residential) {
			return "NOT_RESIDENTIAL";
		}
		if (epgl == -9999)
			return "NOT_VALID";
		if (epgl <= -0)
			return "NOT_VALID";
		if (epgl <= 30)
			return "30";
		if (epgl <= 60)
			return "60";
		if (epgl <= 120)
			return "120";
		if (epgl <= 180)
			return "180";
		if (epgl <= 220)
			return "220";
		if (epgl <= 270)
			return "270";
		return "OVER";
	}
	
	public int getGid() {
		return gid;
	}
	
	public void setGid(int gid) {
		this.gid = gid;
	}
	
	public String getGeom() {
		return geom;
	}
	
	public String getGeomModified() {
		String my_geom = geom;
		
		if (my_geom == null) {
			System.out.println(gid);
			return "";
		}
		my_geom = my_geom.replaceAll("<MultiGeometry>", "<MultiGeometry>\r\n" + "<extrude>1</extrude>\r\n"
				+ "<tessellate>0</tessellate>\r\n" + "<altitudeMode>relativeToGround</altitudeMode>\r\n" + "");
		my_geom = my_geom.replaceAll("<Polygon>", "<Polygon>\r\n" + "<extrude>1</extrude>\r\n"
				+ "<tessellate>0</tessellate>\r\n" + "<altitudeMode>relativeToGround</altitudeMode>\r\n" + "");
		return my_geom;
	}
	
	public void setGeom(String geom) {
		this.geom = geom;
	}
	
	public double getEpgl() {
		return epgl;
	}
	
	public void setEpgl(double epgl) {
		this.epgl = epgl;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
}
