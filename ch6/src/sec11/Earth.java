package sec11;

public class Earth {
	static final double EARTH_RADIUS = 6400; //바로초기화한모습
	static final double EARTH_SURFACE_AREA;
	
	static { //EARTH SURFACE AREA초기화
		EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
		
	}

}
