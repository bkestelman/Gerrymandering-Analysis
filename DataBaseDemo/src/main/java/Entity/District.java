package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "District")
public class District {
	@Id
	String stateId;
	@Id
	int districtId;
	@Id
	int year;
	
	@Column(name = "voteRep", nullable = false)
	int    voteRep;
	@Column(name = "voteDem", nullable = false)
	int    voteDem;
	@Column(name = "polygon", nullable = false)
	String polygon;
	@Column(name = "area", nullable = false)
	int    area;
	@Column(name = "population", nullable = false)
	int    population;
	@Column(name = "clickCount", nullable = false)
	int    clickCount;
	
	public District() {
		
	}
	
	public District(String stateId, int districtId, int voteRep, int voteDem, String polygon, int area, int population, int year, int clickCount) {
		super();
		this.stateId = stateId;
		this.districtId = districtId;
		this.voteRep = voteRep;
		this.voteDem = voteDem;
		this.polygon = polygon;
		this.area = area;
		this.population = population;
		this.year = year;
		this.clickCount = clickCount;
		
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getVoteRep() {
		return voteRep;
	}

	public void setVoteRep(int voteRep) {
		this.voteRep = voteRep;
	}

	public int getVoteDem() {
		return voteDem;
	}

	public void setVoteDem(int voteDem) {
		this.voteDem = voteDem;
	}

	public String getPolygon() {
		return polygon;
	}

	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getClickCount() {
		return clickCount;
	}

	public void setClickCount(int clickCount) {
		this.clickCount = clickCount;
	}
	
	
	
}
