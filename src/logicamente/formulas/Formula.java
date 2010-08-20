package logicamente.formulas;

import java.util.Collection;

public interface Formula {

	public static final String AND = "&";
	public static final String OR = "|";
	public static final String NOT = "!";
	public static final String IMPLIES = "->";
	int getComplexity();
	int getHeight();
	int getNegationDegree();
	Collection<Formula> getChildren();
	
}
