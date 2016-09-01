package FactoryMethod.implement;

import FactoryMethod.Interface.Tv;
import FactoryMethod.Interface.TvFactory;

public class HisenseTvFactory implements TvFactory{

	@Override
	public Tv produceTv() {
		// TODO Auto-generated method stub
		System.out.println("producing Hisense");
		System.out.println("hjk");
		return new HisenseTv();
	}

}
