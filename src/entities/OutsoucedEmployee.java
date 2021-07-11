package entities;

public class OutsoucedEmployee extends Employee {
	private Double additionalCharge;
	
	public OutsoucedEmployee() {
	}

	public OutsoucedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return additionalCharge * 1.1 + super.payment();
	}
}
