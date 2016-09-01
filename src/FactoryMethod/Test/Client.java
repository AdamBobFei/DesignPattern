package FactoryMethod.Test;

import FactoryMethod.Interface.Tv;
import FactoryMethod.Interface.TvFactory;
import FactoryMethod.implement.HaierFactory;
import FactoryMethod.implement.HisenseTvFactory;

public class Client {
	public static void main(String[] args) {
		
		TvFactory haiertvFactory=new HaierFactory();
		Tv haiertv=haiertvFactory.produceTv();
		haiertv.play();
		
		TvFactory hisensetvFactory=new HisenseTvFactory();
		Tv hisensetv=hisensetvFactory.produceTv();
		hisensetv.play();
	}

}
