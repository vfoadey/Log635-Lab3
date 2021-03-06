import java.util.Random;

class Synapse {
	private double weight;
	private double data;
	private Neuron from;
	private Neuron to;
	static Random random = new Random();

	Synapse(Neuron f, Neuron t) {
		from = f;
		to = t;
		weight = RandomClamped();
		data = 0.0;
		f.getOutlinks().add(this);
		t.getInlinks().add(this);
	}

	private double RandomClamped() {
		Random random = new Random();
		return random.nextDouble() * 2 - 1;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public Neuron getFrom() {
		return from;
	}

	public void setFrom(Neuron from) {
		this.from = from;
	}

	public Neuron getTo() {
		return to;
	}

	public void setTo(Neuron to) {
		this.to = to;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
}
