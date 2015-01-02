public interface Expression {

  Money reduce( String to );
  
  Expression plus(Expression addend);
}
