package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		double[] data = {1.2, 2.4, 3.6, 4.8, 6.0};

		DescriptiveStatistics stats = new DescriptiveStatistics();
		for (double value : data) {
			stats.addValue(value);
		}

		double mean = stats.getMean();
		double stdDev = stats.getStandardDeviation();

		System.out.println("Mean: " + mean);
		System.out.println("Standard Deviation: " + stdDev);
	}

}