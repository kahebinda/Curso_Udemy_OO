package Sessao_8_Composicao;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer horus;
	
	
	public HourContract() {
		// TODO Auto-generated constructor stub
	}


	public HourContract(Date date, Double valuePerHour, Integer horus) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.horus = horus;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public Integer getHorus() {
		return horus;
	}


	public void setHorus(Integer horus) {
		this.horus = horus;
	}
	
	public double totalValeu() {
		return valuePerHour * horus;
	}
	
	
	
	
}
