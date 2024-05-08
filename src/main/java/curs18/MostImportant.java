package curs18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//definesc cand vrem sa se execute adnotarea  
@Retention(RetentionPolicy.RUNTIME)
//defineste ce anume "decoreaza" adnotarea - metoda - METHOD/ clasa - TYPE 
@Target(ElementType.TYPE)

//NU ARE IN INTERIORUL EI O FUNCTIONALITATE -> INTERFATA 
//exista o referinta catre aceasta adnotare (in alta clasa)
public @interface MostImportant {

	
	
	
}
