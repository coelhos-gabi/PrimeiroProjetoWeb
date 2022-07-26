package br.com.sinqia.primeiroprojetoweb.injecao.email;


import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Qualifier
@Retention(RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER})
public @interface ServicoHotmailQualifier {
}
