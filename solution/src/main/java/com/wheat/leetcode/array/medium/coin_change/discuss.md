# solution1

采用回溯：
1. 子问题分解：```f(n) = min[f(n - (0 ... m))] + 1```
2. 终止条件:：```n == 0``` 时，递归终止; ```f(0) = 0```

时间复杂度是 O(n^m)，毫无疑问运行超出时间限制，该过程存在重复计算，考虑引入备忘录优化。

# solution2

采用动态规划：

状态转移方程式：```f(n) = min[f(n - (0 ... m))] + 1```