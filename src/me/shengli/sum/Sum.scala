package me.shengli.sum

/**
 * Created by shengli on 1/21/15.
 */

/**
 * old version of sum 1 + 2 + 3 + 4 + 5 + ... 100
 */
object Sum extends App {
  var sum = 0
  var n = 0
  val total = 100
  for (e <- n to total) { // 执行n + 1次
    sum += e       //执行 n 次
  }
  println(s"sum is $sum")
}


/**
 * 1 + 2 + 3 + 4 + 5 + ... 100
 * 1 + 100 = 101
 * 2 + 99 = 101
 * 3 + 99 = 101
 * ...
 * 50 + 51 = 101
 * 50个101 = 101 * 50 = 5050
 */
object GaoSiSum extends App {
  val i = 0
  var sum = 0
  val n = 100
  // 1 + 100 * 100/2 = 101 * 50
  // n = 100 代入
  sum = (1 + n) * (n / 2)  // 执行1次
  println(s"sum is $sum")
}



//object N2Sum extends App {
// java style
//  for (int i = 0; i <= 100; i ++) {
//     for (int j = 0; j < 100; j++) {
//          doSth    这个要执行 10000次即 n * n 次执行
//     }
//  }
//}