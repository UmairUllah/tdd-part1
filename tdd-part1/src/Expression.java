public interface Expression {

  Money reduce( String to );
  
  Expression plus(Expression addend);
  
  Expression times(int multiplier);
}
