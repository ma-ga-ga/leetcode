[解题思路](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/solution/xun-zhao-liang-ge-you-xu-shu-zu-de-zhong-wei-shu-b/)

其中要使`len(left_part)=len(right_part)`：

> i + j = m − i + n − j（或：m - i + n - j + 1）
> 如果 n ≥ m, 只需要 i = 0 ~ m, j = (m + n + 1) / 2

如果 `m + n` 为奇数，那么 `len(left_part) = len(right_part)` 恒不成立。

当`m + n` 为奇数：

`m - i + n - j + 1`时，右部分比左部分多一个元素，中位数为`max(A[i−1],B[j−1])`；
`m - i + n - j`时，左部分比右部分多一个元素，中位数为`max(A[i],B[j])`。
