package pl.edu.us.awpwo;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {

	public static void main(String[] args) {
		RandomGenerator randomGenerator = new JDKRandomGenerator();
		System.out.println(randomGenerator.nextInt());
		System.out.println(randomGenerator.nextDouble());
		DescriptiveStatistics stats = new DescriptiveStatistics();
		stats.addValue(9);
		stats.addValue(2);
		stats.addValue(1);
		stats.addValue(3);
		stats.addValue(5);
		stats.addValue(6);
		stats.addValue(7);
		System.out.println("Mean : "+stats.getMean());
		System.out.println("Standard deviation : " + stats.getStandardDeviation());
		System.out.println("Max : "+stats.getMax());
		Complex c1  = new Complex(1, 2);
		Complex c2 = new Complex(2, 3);
 		System.out.println("Absolute of c1 " + c1.abs());
 		System.out.println("Addition : " + (c1.add(c2)));
	}

}
