package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "State")
public class State {
	
	@Id @GeneratedValue
	long id;
	@Column(name = "stateId", nullable = false)
	String stateId;
	@Column(name = "year", nullable = false)
	int	   year;
	@Column(name = "stateName", nullable = false)
	String stateName;
	@Column(name = "polygon", nullable = false)
	String polygon;
	@Column(name = "clickCount", nullable = false)
	int    clickCount;	
	
	public State(){		
	}
	
	public State(String stateId, String stateName, String polygon, int year, int clickCount) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.polygon = polygon;
		this.year = year;
		this.clickCount = clickCount;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPolygon() {
		return polygon;
	}

	public void setPolygon(String polygon) {
		this.polygon = polygon;
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
