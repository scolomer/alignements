
/** 
 * Comment placer n points dans une grille n/2 par n/2 sans que trois points soit alignés. Méthode naïve et concise.
 * Pour répondre à un problème posé par ma fille en CM2.
 */
object Alignements extends App {
  
  val n = 12;
  
  def aligned(a : (Double, Double), b : (Double, Double), c : (Double, Double)) : Boolean = {
    if (a._1 - b._1 == 0 && a._1 - c._1 == 0) return true
    if (a._1 - b._1 == 0 || a._1 - c._1 == 0) return false
    
    val d1 = (a._2 - b._2) / (a._1 - b._1)
    val d2 = (a._2 - c._2) / (a._1 - c._1)
    d2 == d1
  }
  
  println("C'est parti...")
  
  val list = Range(0, n / 2).map(_.toDouble)
  val elems = for { a <- list; b <- list } yield (a, b)
  
  val comb = elems.toSeq.combinations(n)

  val res = comb.filterNot(ens => ens.combinations(3).map(c => (c(0), c(1), c(2))).exists(a => aligned(a._1, a._2, a._3)))
  res.foreach(println _)
}
