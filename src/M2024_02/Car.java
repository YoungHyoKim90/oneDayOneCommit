package M2024_02;

public class Car {
	private final String make;
	private final String model;
	private final int year;

	private Car(Builder builder) {
		this.make = builder.make;
		this.model = builder.model;
		this.year = builder.year;
	}

	public static class Builder {
		private final String make;
		private final String model;
		private int year;

		public Builder(String make, String model) {
			this.make = make;
			this.model = model;
		}

		public Builder year(int year) {
			this.year = year;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
