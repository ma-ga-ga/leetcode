# solution1

从左右两端往中间扫描，记录最大的面积，直到左右指针相遇。

该面积由底部的长度和最短的高度决定：

```
maxArea = (right - left) * Math.min(height[left], height[right])
```
以` [1,8,6,2,5,4,8,3,7]`为输入。

从`[0, n - 1]`开始，`maxArea = (n - 1) * Math.min(height[0], height[n - 1]) = 8`，此时长度最大。

要使面积增大，就要移动更小的高，以获取更大的高。

所以下一次扫描为`[1, n - 1]`，`maxArea = (n - 2) * Math.min(height[1], height[n - 1]) = 49`。

下一次： `[1, n - 2]`，`maxArea = (n - 2) * Math.min(height[1], height[n - 2]) = 18`

直到左右指针相遇，返回最大的面积。

时间复杂度为 `O(n)`。

> Runtime: 2 ms, faster than 94.80% of Java online submissions for Container With Most Water.
>
>Memory Usage: 39.9 MB, less than 94.87% of Java online submissions for Container With Most Water.

# solution2

解法一通过缩短长度以增加高度去发现更大的面积。

在此基础上，若缩短了长度，但是高度没有增加，那就面积必定减少。

所以在某个方向的遍历的过程中，尝试去寻找比原本更高的高度去计算面积，才有可能发现更大的面积。

通过该方式去减少计算面积的次数。

当`left = 0` 跟 `right = n - 1 `为数组中最大的两个数时，只需要计算一次面积。

当数组的分布呈驼峰型时，每一次都需要计算面积，所以与第一种方式计算面积的次数一致。

该方式通过增加额外的变量及更多的比较次数尝试去减少乘法的次数(因为目前的 `CPU` 乘法的代价更高)。

时间复杂度为 `O(n)`。

>Runtime: 1 ms, faster than 100.00% of Java online submissions for Container With Most Water.
>
>Memory Usage: 39.8 MB, less than 94.87% of Java online submissions for Container With Most Water.