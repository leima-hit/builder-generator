package fr.lteconsulting;

import com.toto.SimpleBuilder;

public class Demonstration
{
	public static void main(String[] args)
	{
		ComplexClass instance = SimpleBuilder
				.withA("this one is mandatory")
				.bonjour("monsieur")
				.withC("this one too")
				.withE("all this is generated !")
				.withD("an optional parameter")
				.build();
		System.out.println(instance.toString());

		SimpleBuilder.create().withA(null).bonjour(null).withC(null).withE(null).build();

		PeteBurneBuilder.withA("khkjh").withB(null).withD(null).call();
	}
}
