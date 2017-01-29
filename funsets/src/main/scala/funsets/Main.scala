package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(2), 1))
  println(union(singletonSet(1), singletonSet(2)))
  println(intersect(singletonSet(1), singletonSet(2)))
  println( forall(union(singletonSet(4), singletonSet(-2)), x => x>0) )

  println( exists(union(singletonSet(4), singletonSet(-2)), x => x>0) )

  println( FunSets.toString(map(union(singletonSet(4), singletonSet(-2)), x => x*3)) )
}
