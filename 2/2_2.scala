def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
  @annotation.tailrec
  var cnt = 0
  if (cnt == length(as)) {
    return ordered(as[cnt - 1], as[cnt])
    }
  else {
    println("intheloop")
    var cnt = cnt + 1 
    println(cnt)
    isSorted(as, ordered)
  }  
}

isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x < y)
