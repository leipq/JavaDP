package kingdee.base.ssc.day04.annotations001;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
