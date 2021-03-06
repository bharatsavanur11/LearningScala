package collections

object implExpr {
 
 var arr = Array(1,2,3)                           //> arr  : Array[Int] = Array(1, 2, 3)
 var arr1 = Array(5,6,7)                          //> arr1  : Array[Int] = Array(5, 6, 7)
 
 arr ++ arr1                                      //> res0: Array[Int] = Array(1, 2, 3, 5, 6, 7)
 arr ++: arr1                                     //> res1: Array[Int] = Array(1, 2, 3, 5, 6, 7)
 arr1                                             //> res2: Array[Int] = Array(5, 6, 7)
 
 Array.fill(100)(10)                              //> res3: Array[Int] = Array(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                                                  //|  10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                                                  //|  10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                                                  //|  10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                                                  //|  10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                                                  //|  10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
 
 Array.apply(1,2,3)                               //> res4: Array[Int] = Array(1, 2, 3)
 
}