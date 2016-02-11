package it.sinergis.modelloBuilding;

import java.util.LinkedList;

import org.postgis.MultiPolygon;

public class MyBuilding {
	private long id;
	private MultiPolygon MultiPolygon;
	private String nature;
	private Integer begin;
	private Integer end;
	private String refurbishmentlevel;
	private Double height_val;
	private Double elev_val;
	private Integer floor;
	private Integer bdg_units;
	private String typology;
	private Double u_wall;
	private Double u_roof;
	private Double u_floor;
	private Double delta_u;
	private Double area;
	
	private LinkedList<String> usages;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public MultiPolygon getMultiPolygon() {
		return MultiPolygon;
	}
	
	public void setMultiPolygon(MultiPolygon multiPolygon) {
		MultiPolygon = multiPolygon;
	}
	
	public String getNature() {
		return nature;
	}
	
	public void setNature(String nature) {
		this.nature = nature;
	}
	
	public Integer getBegin() {
		return begin;
	}
	
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	
	public Integer getEnd() {
		return end;
	}
	
	public void setEnd(Integer end) {
		this.end = end;
	}
	
	public String getRefurbishmentlevel() {
		return refurbishmentlevel;
	}
	
	public void setRefurbishmentlevel(String refurbishmentlevel) {
		this.refurbishmentlevel = refurbishmentlevel;
	}
	
	public Double getHeight_val() {
		return height_val;
	}
	
	public void setHeight_val(Double height_val) {
		this.height_val = height_val;
	}
	
	public Double getElev_val() {
		return elev_val;
	}
	
	public void setElev_val(Double elev_val) {
		this.elev_val = elev_val;
	}
	
	public Integer getFloor() {
		return floor;
	}
	
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
	public Integer getBdg_units() {
		return bdg_units;
	}
	
	public void setBdg_units(Integer bdg_units) {
		this.bdg_units = bdg_units;
	}
	
	public String getTypology() {
		return typology;
	}
	
	public void setTypology(String typology) {
		this.typology = typology;
	}
	
	public Double getU_wall() {
		return u_wall;
	}
	
	public void setU_wall(Double u_wall) {
		this.u_wall = u_wall;
	}
	
	public Double getU_roof() {
		return u_roof;
	}
	
	public void setU_roof(Double u_roof) {
		this.u_roof = u_roof;
	}
	
	public Double getU_floor() {
		return u_floor;
	}
	
	public void setU_floor(Double u_floor) {
		this.u_floor = u_floor;
	}
	
	public Double getDelta_u() {
		return delta_u;
	}
	
	public void setDelta_u(Double delta_u) {
		this.delta_u = delta_u;
	}
	
	public Double getArea() {
		return area;
	}
	
	public void setArea(Double area) {
		this.area = area;
	}
	
	public LinkedList<String> getUsages() {
		return usages;
	}
	
	public void setUsages(LinkedList<String> usages) {
		this.usages = usages;
	}
	
}
