package ar.edu.unlam.tallerweb.rectangulo;

import org.junit.Test;
import org.junit.Assert;

public class Rectangulo {
	
	private Integer base=9;
	private Integer altura=8;
	
	public Integer perimetro(Integer base,Integer altura){
		Integer perimetro=(base*2)+(altura*2);
		return perimetro;
	}
	
	public Integer area(Integer base,Integer altura){
		Integer area=base*altura;
		return area;
	}

}
