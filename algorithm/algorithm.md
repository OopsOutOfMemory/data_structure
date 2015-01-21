# 算法
算法和数据结构的关系就像 `梁山伯` 与 `祝英台`的 关系，缺一不可，否则很空洞。
来描述什么是算法，`算法`就是`解决特定问题求解的步骤，在计算机里表现为指令的有限序列，并且每条指令代表一个或者多个操作`。

####简单的求和sum
1 + 2 + 3 + 4 +5 + 6 + ...... 100
可以简单的用for循环100下，sum = sum + i 
这样计算机会机械的一个个累加，效率比较低。

####高斯求和sum
也可以思考这种累加的方法，可以用高斯的 
```
101 * 50 
即
(1 + n ) * (n / 2)
注: n为100
```

####优秀的算法
设计算法应该满足`时间最少`，`空间占用尽量低`。这个是最理想的情况，但是现实情况，我们可有所取舍。
####衡量算法的优劣
我们一般采用实现估计法对算法的效率进行估算。

一个程序的时间依赖于`算法的好坏`和`问题输入规模`（即输入量）

比如求和的算法
不考虑循环头，只考虑循环体：遍历1-100次，遍历每次相加，指令执行了100次。而高斯求和算法，只有1次。
这就是`n次`和`1次`的算法效率关系。

最重要的是：把`基本操作的数量`，与`输入规模`关联起来，即操作数量`f(n)`必须表示为输入规模`n`的函数。
f(n) = 1
f(n) = n * n


####判断一个算法的效率
判断一个算法的效率只需要留下`指数项`，常数项和其它次项可以忽略。因为随着指数的问题规模的增长，常数项的影响已经慢慢变得微乎其微。